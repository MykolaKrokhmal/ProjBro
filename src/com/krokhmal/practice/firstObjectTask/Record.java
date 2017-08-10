package com.krokhmal.practice.firstObjectTask;

import sun.security.ssl.HandshakeInStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Record {
    private Date date;
    private int priority;
    private String source;
    private String message;
    private final int MIN_PRIORITY_VALUE    = 1;
    private final int LOW_PRIORITY_VALUE    = 2;
    private final int HEIGHT_PRIORITY_VALUE = 3;
    private final int MAX_PRIORITY_VALUE    = 4;
    private final int ARGUMENTS_COUNT       = 4;
    private final int NO_SPACE              = -1;

    public Record(Date date, int priority, String source, String message) {
        if (date == null)
            throw new IllegalArgumentException("Parameter \"date\" can not be null");

        if (priority < MIN_PRIORITY_VALUE || priority > MAX_PRIORITY_VALUE)
            throw new IllegalArgumentException("Parameter \"priority\" must be in range 1..4");

        if (source == null || source.trim().isEmpty() || source.contains(" "))
            throw new IllegalArgumentException("Parameter \"source\" must be without spaces, not null and not empty");

        if (message == null || message.trim().isEmpty() || message.contains(System.lineSeparator()))
            throw new IllegalArgumentException("Parameter \"message\" can not contain line separator, be null or empty");

        this.date       = new Date(date.getTime());
        this.priority   = priority;
        this.source     = source.trim();
        this.message    = message.trim();
    }

    public Record(String record) {

        if (record == null || record.trim().isEmpty())
            throw new IllegalArgumentException("Illegal input argument");

        record = record.trim();

        String[] parameter = new String[ARGUMENTS_COUNT];
        int index = 0;
        for (int i = 0; i < ARGUMENTS_COUNT; i++) {
            index = record.indexOf(" ");
            if(index == NO_SPACE)
                throw new IllegalArgumentException("Illegal input argument " + i);
            parameter[i] = record.substring(0, index);
            record = record.substring(index).trim();
        }

        setDate(parameter[0] + " " + parameter[1]);
        setPriority(parameter[2]);
        setSource(parameter[3]);

        setMessage(record);
    }

    public Date getDate(){
        return new Date(this.date.getTime());
    }

    private void setDate(String date) {
        try {
            SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            inputDate.setLenient(false);

            this.date = inputDate.parse(date);

        } catch (ParseException exception) {
            throw new IllegalArgumentException("Illegal \"date\" format");
        }
    }

    private void setPriority(String priority) {
        switch (priority) {
            case "."    : this.priority = MIN_PRIORITY_VALUE;       break;
            case "!"    : this.priority = LOW_PRIORITY_VALUE;       break;
            case "!!!"  : this.priority = HEIGHT_PRIORITY_VALUE;    break;
            case "!!!!!": this.priority = MAX_PRIORITY_VALUE;       break;
            default     : throw new IllegalArgumentException("Illegal \"priority\" format");
        }

    }

    private void setSource(String source) {
        this.source = source;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return getDateAsString() + " " + getPriorityAsString() + " " + getSource() + " " + getMessage();
    }

    private String getDateAsString() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.date);
    }

    public Integer getPriority(){
        return this.priority;
    }

    private String getPriorityAsString() {

        String symbol;
        switch (this.priority) {
            case MIN_PRIORITY_VALUE     :   symbol = ".    "; break;
            case LOW_PRIORITY_VALUE     :   symbol = "!    "; break;
            case HEIGHT_PRIORITY_VALUE  :   symbol = "!!!  "; break;
            case MAX_PRIORITY_VALUE     :   symbol = "!!!!!"; break;
            default                     :   symbol = "     "; break;
        }
        return symbol;
    }

    public String getSource() {
        return this.source;
    }

    private String getMessage() {
        return this.message;
    }
}