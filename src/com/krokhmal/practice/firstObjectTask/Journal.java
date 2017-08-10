package com.krokhmal.practice.firstObjectTask;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by NKrok on 03.08.2017.
 */
public class Journal {
    private Record[] records = {};

    public void add(Record newRecord){
        if(newRecord == null)
            throw new IllegalArgumentException("Parameter \"newRecord\" can not be null");

        this.records = Arrays.copyOf(this.records, this.records.length + 1);
        this.records[this.records.length - 1] = newRecord.clone();
    }

    public void add(Journal newJournal){
        if(newJournal == null)
            throw new IllegalArgumentException("Parameter \"newJournal\" can not be null");

        for(Record record : newJournal.records) this.add(record);
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

    public void remove(Record removeRecord){
        if(removeRecord == null)
            throw new IllegalArgumentException("Parameter \"removeRecord\" can not be null");

        for (int i = 0; i < this.records.length; i++)
            if(this.records[i] == removeRecord) this.remove(i);
    }

    public void removeAll(){
        this.records = new Record[]{};
    }

    public Journal filter(String text){
        if(text == null || text.trim().isEmpty())
            throw new IllegalArgumentException("Parameter \"content\" is null or empty");

        Journal filtered = new Journal();
        for (Record record : this.records)
            if(record.toString().contains(text))
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
            public int compare(Record firstRecord, Record secondRecord) {
                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortByImportanceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int priorityCompare = firstRecord.getPriority().compareTo(secondRecord.getPriority());
                if(priorityCompare != 0)
                    return priorityCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortByImportanceSourceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int priorityCompare = firstRecord.getPriority().compareTo(secondRecord.getPriority());
                if(priorityCompare != 0)
                    return priorityCompare;

                int sourceCompare = firstRecord.getSource().compareTo(secondRecord.getSource());
                if(sourceCompare != 0)
                    return sourceCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortBySourceDate(){
        Arrays.sort(this.records, new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int sourceCompare = firstRecord.getSource().compareTo(secondRecord.getSource());
                if(sourceCompare != 0)
                    return sourceCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("");
        for (Record record : this.records){
            string.append(record.toString());
            string.append("\n");
        }
        return string.toString();
    }

    public static void main(String[] args) {

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

        Date fromDate = new GregorianCalendar(2017, Calendar.AUGUST, 04).getTime();
        Date toDate = new GregorianCalendar(2017, Calendar.AUGUST, 06).getTime();

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