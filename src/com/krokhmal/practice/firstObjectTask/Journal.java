package com.krokhmal.practice.firstObjectTask;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Journal {
    private final int MIN_ARRAY_SIZE = 5;
    private Record[] records = new Record[MIN_ARRAY_SIZE];
    private int length = 0;

    public void add(Record newInstance) {
        checkRecordParameters(newInstance);
        ensureArrayLength(length + 1);
        this.records[length] = new Record(newInstance.getDate(), newInstance.getPriority(), newInstance.getSource(), newInstance.getMessage());
        setNullToNewEmptyCoilsAndChangeLengthValueOn(1);
    }

    public void add(Journal newJournal) {
        if (newJournal == null)
            throw new IllegalArgumentException("Parameter \"newJournal\" can not be null");
        for (int i = 0; i < newJournal.length; i++) {
            this.add(newJournal.records[i]);
        }
    }

    public void remove(int index) {
        if (index >= length || index < 0)
            throw new IllegalArgumentException("\"index\" is out of bounds");

        for (int i = index; i < length - 1; i++) {
            records[i] = records[i + 1];
        }

        records[length - 1] = null;
        setNullToNewEmptyCoilsAndChangeLengthValueOn(-1);
    }

    public void remove(int fromIndex, int toIndex) {
        if (fromIndex < 0)
            throw new IllegalArgumentException("\"fromIndex\" must greater or equal zero");
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("\"fromIndex\" must be less then \"toIndex\"");
        if (toIndex > this.records.length)
            throw new IllegalArgumentException("\"toIndex\" is out of array bounds");

        for (int i = fromIndex, j = toIndex; ++j < this.records.length; i++)
            this.records[i] = records[j];
        int valueOfChange = -(toIndex - fromIndex) - 1;

        setNullToNewEmptyCoilsAndChangeLengthValueOn(valueOfChange);
    }

    public void remove(Record removeRecord) {
        if (removeRecord == null)
            throw new IllegalArgumentException("Parameter \"removeRecord\" can not be null");

        for (int i = 0; i < length; i++)
            if (this.records[i].equals(removeRecord)) this.remove(i);

        setNullToNewEmptyCoilsAndChangeLengthValueOn(-1);
    }

    public void removeAll() {
        this.records = new Record[]{};
        this.length = 0;
    }

    public Journal filter(String filterCriteria) {
        if (filterCriteria == null || filterCriteria.trim().isEmpty())
            throw new IllegalArgumentException("Parameter \"content\" is null or empty");

        Journal filtered = new Journal();
        for (int i = 0; i < this.length; i++) {
            if (this.records[i].toString().contains(filterCriteria))
                filtered.add(this.records[i]);

        }

        return filtered;
    }

    public Journal filter(Date fromDate, Date toDate) {
        if (fromDate == null || toDate == null)
            throw new IllegalArgumentException("Parameters can not be null");

        Journal filtered = new Journal();
        long currDate = 0;
        for (int i = 0; i < this.length; i++) {
            currDate = this.records[i].getDate().getTime();
            if (currDate >= fromDate.getTime() && currDate <= toDate.getTime())
                filtered.add(this.records[i]);
        }

        return filtered;
    }

    public void sortByDate() {
        Arrays.sort(this.getRecords(), new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortByImportanceDate() {
        Arrays.sort(this.getRecords(), new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int priorityCompare = firstRecord.getPriority().compareTo(secondRecord.getPriority());
                if (priorityCompare != 0)
                    return priorityCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortByImportanceSourceDate() {
        Arrays.sort(this.getRecords(), new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int priorityCompare = firstRecord.getPriority().compareTo(secondRecord.getPriority());
                if (priorityCompare != 0)
                    return priorityCompare;

                int sourceCompare = firstRecord.getSource().compareTo(secondRecord.getSource());
                if (sourceCompare != 0)
                    return sourceCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    public void sortBySourceDate() {
        Arrays.sort(this.getRecords(), new Comparator<Record>() {
            @Override
            public int compare(Record firstRecord, Record secondRecord) {
                int sourceCompare = firstRecord.getSource().compareTo(secondRecord.getSource());
                if (sourceCompare != 0)
                    return sourceCompare;

                return firstRecord.getDate().compareTo(secondRecord.getDate());
            }
        });
    }

    private Record[] getRecords(){
        Record[] records = new Record[length];
        for (int i = 0; i < length; i++) {
            records[i] = this.records[i];
        }

        return records;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("");
        for (Record record : this.getRecords()) {
            if(record != null) {
                string.append(record.toString());
                string.append("\n");
            }
        }
        return string.toString();
    }

    private void checkRecordParameters(Record newInstance) {
        if (newInstance == null)
            throw new IllegalArgumentException("Parameter \"newRecord\" can not be null");
        if (newInstance.getDate() == null)
            throw new IllegalArgumentException("Parameter \"date\" can not be null");

        if (newInstance.getPriority() == null)
            throw new IllegalArgumentException("Parameter \"priority\" is null");

        String sourceParameter = newInstance.getSource();
        if (sourceParameter == null || sourceParameter.trim().isEmpty() || sourceParameter.contains(" "))
            throw new IllegalArgumentException("Parameter \"source\" must be without spaces, not null and not empty");

        String messageParameter = newInstance.getMessage();
        if (messageParameter == null || messageParameter.trim().isEmpty() || messageParameter.contains(System.lineSeparator()))
            throw new IllegalArgumentException("Parameter \"message\" can not contain line separator, be null or empty");
    }

    private void ensureArrayLength(int askedArrayLength){
        int MAX_ARRAY_LENGTH = Integer.MAX_VALUE;
        int currentArrayLength = records.length;

        if(askedArrayLength - currentArrayLength > 0 && askedArrayLength < MAX_ARRAY_LENGTH - MIN_ARRAY_SIZE) {

            int newArrayLength = (askedArrayLength - currentArrayLength < MIN_ARRAY_SIZE) ?
                                currentArrayLength + MIN_ARRAY_SIZE : askedArrayLength;

            this.records = Arrays.copyOf(this.records, newArrayLength);
        }
    }

    private void setNullToNewEmptyCoilsAndChangeLengthValueOn(int valueOfChange){
        int newLength = length + valueOfChange;

        if(newLength < length){
            for (int i = newLength; i < length - 1; i++) {
                this.records[i] = null;
            }
        }

        this.length = newLength;
    }
}
