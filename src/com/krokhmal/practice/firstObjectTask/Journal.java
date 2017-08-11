package com.krokhmal.practice.firstObjectTask;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by NKrok on 03.08.2017.
 */
public class Journal {
    private Record[] records = {};

    public void add(Record newInstance){
        if(newInstance == null)
            throw new IllegalArgumentException("Parameter \"newRecord\" can not be null");

        this.records = Arrays.copyOf(this.records, this.records.length + 1);
        this.records[this.records.length - 1] = new Record(newInstance.toString());
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


    }
}