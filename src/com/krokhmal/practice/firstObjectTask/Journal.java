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

    public Record[] getRecords(){
        return records.clone();
    }

    public void add(Record r){
        records = Arrays.copyOf(records, records.length + 1);
        records[records.length - 1] = r;
        System.out.println(records[records.length-1].toString());
    }

    public void add(Journal j){
        records = j.records.clone();
    }

    public void remove(Record r){
        for (int i = 0; i < this.records.length; i++) {
            if(this.records[i] == r){
                //this.records = Arrays.
            }
        }
    }

    public void remove(int index){

    }

    public void remove(int fromIndex, int toIndex){

    }

    public void removeAll(){

    }

    public Journal filter(String s){
        return new Journal();

    }

    public Journal filter(Date fromDate, Date toDate){
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

    public static void main(String[] args) {
        Journal d = new Journal();
        d.add(new Record("2017-08-04 12:34:15 !!!!! Nick Error1 message text"));
        d.add(new Record("2017-08-05 12:34:15 !!!   Nick Error2 message text"));
        Record rrr = new Record("2017-08-06 12:34:15 !     Nick Error3 message text");
        d.add(rrr);
        System.out.println(d.records[d.records.length - 1].toString());
        Journal s = new Journal();
        s.add(d);
    }
}