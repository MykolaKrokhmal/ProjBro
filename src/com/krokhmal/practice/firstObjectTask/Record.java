package com.krokhmal.practice.firstObjectTask;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record  {
    private Date date;
    private Priority priority;
    private String source;
    private String message;

    public Record(Date date, Priority priority, String source, String message) {
        this.date       = new Date(date.getTime());
        this.priority   = priority;
        this.source     = source.trim();
        this.message    = message.trim();
    }

    public static Record add(String recordString){
        if (recordString == null || recordString.trim().isEmpty())
            throw new IllegalArgumentException("Input argument can not be null or empty");

        String checkedRecordString = getHandledString(recordString);
        return new Record(checkedRecordString);
    }

    public Date getDate(){
        return new Date(this.date.getTime());
    }

    public Priority getPriority(){
        return this.priority;
    }

    public String getSource() {
        return this.source;
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public String toString() {
        return getDateAsString() + " " + this.priority.getSignature() + " " + getSource() + " " + this.message;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Record comparable = (Record) obj;
        return (this.date.getTime() == comparable.date.getTime() && this.priority == comparable.priority &&
                this.source.equals(comparable.source) && this.message.equals(comparable.message));
    }

    private Record(String record) {
        final int LAST_DATE_TIME_SYMBOL = 19;
        final int FIRST_PRIORITY_SYMBOL = 20;
        final int LAST_PRIORITY_SYMBOL = 25;
        final int FIRST_SOURCE_SYMBOL = 26;
        final int LAST_SOURCE_SYMBOL = record.indexOf(" ",26);
        final int FIRST_MESSAGE_SYMBOL = record.indexOf(" ",27) + 1;

        setDate(record.substring(0, LAST_DATE_TIME_SYMBOL));
        this.priority = Priority.fromString(record.substring(FIRST_PRIORITY_SYMBOL, LAST_PRIORITY_SYMBOL));
        this.source = record.substring(FIRST_SOURCE_SYMBOL, LAST_SOURCE_SYMBOL);
        this.message = record.substring(FIRST_MESSAGE_SYMBOL, record.length());
    }

    private static String getHandledString(String inputString){
        final int MIN_WORDS_COUNT = 5;
        final int DATE_WORD_NUMBER = 0;
        final int TIME_WORD_NUMBER = 1;
        final int PRIORITY_WORD_NUMBER = 2;
        final int SOURCE_WORD_NUMBER = 3;
        final int MESSAGE_FIRST_WORD = 4;

        String[] wordsSet = inputString.trim().split("\\s+");
        if(wordsSet.length < MIN_WORDS_COUNT)
            throw new IllegalArgumentException("Incorrect string format");

        StringBuilder message = new StringBuilder();
        String dateTimeString = wordsSet[DATE_WORD_NUMBER] + " " + wordsSet[TIME_WORD_NUMBER];

        if(isCorrectDateFormat(dateTimeString)) {
            message.append(dateTimeString);
            message.append(" ");
        }
        String priorityString = getFormattedPriority(wordsSet[PRIORITY_WORD_NUMBER]);
        if(isCorrectPriorityFormat(priorityString)) {
            message.append(priorityString);
            message.append(" ");
        }
        message.append(wordsSet[SOURCE_WORD_NUMBER]);
        message.append(" ");

        for (int i = MESSAGE_FIRST_WORD; i < wordsSet.length; i++) {
            message.append(wordsSet[i]);
            message.append(" ");
        }
        return message.toString().trim();
    }

    private static boolean isCorrectDateFormat(String dateString){
        try {
            SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            inputDate.setLenient(false);
            inputDate.parse(dateString);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private static boolean isCorrectPriorityFormat(String priorityString){
        try {
            Priority.fromString(priorityString);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private static String getFormattedPriority(String priorityString) {
        switch(priorityString){
            case "."    :
                return ".    ";
            case "!"    :
                return "!    ";
            case "!!!"  :
                return "!!!  ";
            case "!!!!!":
                return "!!!!!";
            default     : throw new IllegalArgumentException("Illegal \"priority\" format");
        }
    }

    private static Date getDateFromString(String dateString){
        try {
            SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            inputDate.setLenient(false);
            return inputDate.parse(dateString);

        } catch (ParseException exception) {
            throw new IllegalArgumentException("Illegal \"date\" format");
        }
    }

    private String getDateAsString() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.date);
    }

    private void setDate(String date) {
        this.date = getDateFromString(date);
    }
}