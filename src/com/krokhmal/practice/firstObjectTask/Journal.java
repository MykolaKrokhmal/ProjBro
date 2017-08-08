package com.krokhmal.practice.firstObjectTask;

import jdk.nashorn.internal.scripts.JO;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * Created by NKrok on 03.08.2017.
 */
public class Journal {
    private Record[] records = new Record[0];

    public void add(Record r){
        if(r == null)
            throw new IllegalArgumentException("Parameter can not be null");

        this.records = Arrays.copyOf(this.records, this.records.length + 1);
        this.records[this.records.length - 1] = r.copy();
    }

    public void add(Journal j){
        if(j == null)
            throw new IllegalArgumentException("Parameter can not be null");

        for(Record record : j.getRecords()) this.add(record);
    }

    public void remove(Record r){
        if(r == null)
            throw new IllegalArgumentException("Parameter can not be null");

        for (int i = 0; i < this.records.length; i++)
            if(this.records[i] == r) this.remove(i);
    }

    public void remove(int index){
        if(index >= this.records.length || index < 0)
            throw new IllegalArgumentException("Index is out of bounds");

        for (int i = index; i < this.records.length - 1; i++)
            records[i] = records[i + 1];

        this.records = Arrays.copyOf(this.records, this.records.length - 1);
    }

    public void remove(int fromIndex, int toIndex){
        if(fromIndex < 0)
            throw new IllegalArgumentException("fromIndex must greater or equal zero");
        if(fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex must be less then toIndex");
        if(toIndex > this.records.length)
            throw new IllegalArgumentException("toIndex is out of array count range");

        for(int i = fromIndex, j = toIndex; ++j < this.records.length; i++)
            this.records[i] = records[j];
        int newLength = this.records.length - (toIndex - fromIndex) - 1;
        this.records = Arrays.copyOf(this.records, newLength);
    }

    public void removeAll(){
        this.records = new Record[0];
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
        Journal filtered = new Journal();
        long currDate = 0;
        for ( Record record : records) {
            currDate = record.getDate().getTime();
            if(currDate >= fromDate.getTime() && currDate <= toDate.getTime())
                filtered.add(record);
        }
        return new Journal();
    }

    public void sortByDate(){

    }

    public void sortByImportanceDate(){

    }

    public void sortByImportanceSourceDate(){

    }

    public void sortBySourceDate(){

    }

    public Record[] getRecords(){
        Record[] copy = new Record[this.records.length];
        for (int i = 0; i < this.records.length; i++) {
            copy[i] = this.records[i].copy();
        }
        return copy;
    }

    public static void main(String[] args) {
        Journal firstJournal = new Journal();

        System.out.println("=============================================================");
        System.out.println(" 1. First journal filling start");
        System.out.println("=============================================================");
        firstJournal.add(new Record("2017-08-04 09:15:09 !!!!! Nick Error1 message text"));
        firstJournal.add(new Record("2017-08-05 07:34:15 .     Den  Error2 message text"));
        firstJournal.add(new Record("2017-08-06 12:36:15 !     Nick Error3 message text"));
        firstJournal.add(new Record("2017-08-07 05:38:15 !!!!! Rick Error4 message text"));
        firstJournal.add(new Record("2017-08-09 01:45:15 .     Tom Error5 message ltext"));
        Record singleRecord = new Record(new Date(), 2,"Sandra"," Error6 message text");
        firstJournal.add(singleRecord);

        System.out.println(Arrays.toString(firstJournal.getRecords()));

        Journal secondJournal = new Journal();
        System.out.println();
        System.out.println("=============================================================");
        System.out.println(" 2. Second journal filling start");
        System.out.println("=============================================================");

        secondJournal.add(new Record("2016-06-01 01:42:00 .     Mike Error0 message text"));

        System.out.println(Arrays.toString(secondJournal.getRecords()));

        System.out.println();
        System.out.println("=============================================================");
        System.out.println(" 3. Add first journal to second journal");
        System.out.println("=============================================================");

        secondJournal.add(firstJournal);
        System.out.println(Arrays.toString(secondJournal.getRecords()));

        System.out.println();
        System.out.println("=============================================================");
        System.out.println(" 4. Remove range from 3 to 5");
        System.out.println("=============================================================");

        secondJournal.remove(3, 5);
        System.out.println(Arrays.toString(secondJournal.getRecords()));


        System.out.println();
        System.out.println("=============================================================");
        System.out.println(" 5. filter by string \"Nick\"");
        System.out.println("=============================================================");

        System.out.println(Arrays.toString(secondJournal.filter("Nick").getRecords()));

        System.out.println();
        System.out.println("=============================================================");
        System.out.println(" 6. filter by date range");
        System.out.println("=============================================================");

        System.out.println(Arrays.toString(secondJournal.filter(new Date(), new Date() ).getRecords()));

    }
}