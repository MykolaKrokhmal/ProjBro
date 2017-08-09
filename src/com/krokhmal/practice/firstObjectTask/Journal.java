package com.krokhmal.practice.firstObjectTask;

import jdk.nashorn.internal.scripts.JO;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by NKrok on 03.08.2017.
 */
public class Journal {
    private Record[] records = {};

    public void add(Record r){
        if(r == null)
            throw new IllegalArgumentException("Parameter can not be null");

        this.records = Arrays.copyOf(this.records, this.records.length + 1);
        this.records[this.records.length - 1] = r.copy();
    }

    public void add(Journal j){
        if(j == null)
            throw new IllegalArgumentException("Parameter \"j\" can not be null");

        for(Record record : j.records) this.add(record);
    }

    public void remove(int index){
        if(index >= this.records.length || index < 0)
            throw new IllegalArgumentException("\"index\" is out of bounds");

        for (int i = index; i < this.records.length - 1; i++)
            records[i] = records[i + 1];

        this.records = Arrays.copyOf(this.records, this.records.length - 1);
    }

    public void remove(int fromIndex, int toIndex){
        if(fromIndex < 0)
            throw new IllegalArgumentException("\"fromIndex\" must greater or equal zero");
        if(fromIndex > toIndex)
            throw new IllegalArgumentException("\"fromIndex\" must be less then \"toIndex\"");
        if(toIndex > this.records.length)
            throw new IllegalArgumentException("\"toIndex\" is out of array bounds");

        for(int i = fromIndex, j = toIndex; ++j < this.records.length; i++)
            this.records[i] = records[j];
        int newLength = this.records.length - (toIndex - fromIndex) - 1;
        this.records = Arrays.copyOf(this.records, newLength);
    }

    public void remove(Record r){
        if(r == null)
            throw new IllegalArgumentException("Parameter \"r\" can not be null");

        for (int i = 0; i < this.records.length; i++)
            if(this.records[i] == r) this.remove(i);
    }

    public void removeAll(){
        this.records = new Record[]{};
    }

    public Journal filter(String s){
        if(s == null || s.trim().isEmpty())
            throw new IllegalArgumentException("String is null or empty");

        Journal filtered = new Journal();
        for (Record record : this.records)
            if(record.toString().contains(s))
                filtered.add(record);

        return filtered;

    }

    public Journal filter(Date fromDate, Date toDate){
        if(fromDate == null || toDate == null)
            throw new IllegalArgumentException("Parameters can not be null");

        Journal filtered = new Journal();
        long currDate = 0;
        for ( Record record : records) {
            currDate = record.getDate().getTime();
            if(currDate >= fromDate.getTime() && currDate <= toDate.getTime())
                filtered.add(record);
        }
        return filtered;
    }

    public void sortByDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

    public void sortByImportanceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                int priorityCompare = o1.getPriority().compareTo(o2.getPriority());
                if(priorityCompare != 0)
                    return priorityCompare;

                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

    public void sortByImportanceSourceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                int priorityCompare = o1.getPriority().compareTo(o2.getPriority());
                if(priorityCompare != 0)
                    return priorityCompare;

                int sourceCompare = o1.getSource().compareTo(o2.getSource());
                if(sourceCompare != 0)
                    return sourceCompare;

                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

    public void sortBySourceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                int sourceCompare = o1.getSource().compareTo(o2.getSource());
                if(sourceCompare != 0)
                    return sourceCompare;

                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("");
        for (Record r : this.records){
            string.append(r.toString());
            string.append("\n");
        }
        return string.toString();
    }

    public static void main(String[] args) throws ParseException {

        Journal firstJournal = new Journal();

        System.out.println("====================================================================================");
        System.out.println(" 1. First journal filling start");
        System.out.println("====================================================================================");
        firstJournal.add(new Record("2017-08-04 09:15:09 !!!!! Nick Error1 message text"));
        firstJournal.add(new Record("2017-08-09 17:34:15 .     Den  Error2 message text"));
        firstJournal.add(new Record("2017-08-16 12:36:15 !     Nick Error3 message text"));
        firstJournal.add(new Record("2017-08-02 05:38:15 !!!!! Rick Error4 message text"));
        firstJournal.add(new Record("2017-08-05 01:45:15 .     Tom  Error5 message text"));
        Record singleRecord = new Record(new Date(), 2,"Sandra"," Error6 message text");
        firstJournal.add(singleRecord);

        System.out.println(firstJournal.toString());

        Journal secondJournal = new Journal();

        System.out.println("====================================================================================");
        System.out.println(" 2. Second journal filling start");
        System.out.println("====================================================================================");

        secondJournal.add(new Record("2016-06-01 01:42:00 .     Mike Error0 message text"));

        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 3. Add first journal to second journal");
        System.out.println("====================================================================================");

        secondJournal.add(firstJournal);
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 4. Remove range from 2 to 3 from first journal");
        System.out.println("====================================================================================");

        firstJournal.remove(2, 3);
        System.out.println(firstJournal.toString());


        System.out.println("====================================================================================");
        System.out.println(" 5. filter by string \"Nick\"");
        System.out.println("====================================================================================");

        System.out.println(secondJournal.filter("Nick").toString());

        System.out.println("====================================================================================");
        System.out.println(" 6. filter 1st journal by date range from 2017-08-04 00:00:00 to 2017-08-06 00:00:00");
        System.out.println("====================================================================================");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date fromDate = sdf.parse("2017-08-04 00:00:00");
        Date toDate = sdf.parse("2017-08-06 00:00:00");
        System.out.println(firstJournal.filter(fromDate, toDate).toString());

        System.out.println("====================================================================================");
        System.out.println(" 7. sort records by Date");
        System.out.println("====================================================================================");

        secondJournal.sortByDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 8. sort records by Priority, Date");
        System.out.println("====================================================================================");

        secondJournal.sortByImportanceDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 9. sort records by Priority, Source, Date");
        System.out.println("====================================================================================");

        secondJournal.sortByImportanceSourceDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println("10. sort records by Source, Date");
        System.out.println("====================================================================================");

        secondJournal.sortBySourceDate();
        System.out.println(secondJournal.toString());
    }
}