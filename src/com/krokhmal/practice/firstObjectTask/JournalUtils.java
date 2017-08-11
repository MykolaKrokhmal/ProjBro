package com.krokhmal.practice.firstObjectTask;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by NKrok on 03.08.2017.
 */
public class JournalUtils {
    public static void main(String[] args) {
        Journal firstJournal = new Journal();

        System.out.println("====================================================================================");
        System.out.println(" 1. First journal filling start");
        System.out.println("====================================================================================");
        firstJournal.add(new Record("2017-08-04 06:15:09 !!!!! Nick    Error1   message text"));
        firstJournal.add(new Record("2017-08-09 17:34:15 .     Den     Error2 message text"));
        firstJournal.add(new Record("2017-08-16 12:36:15 !     Nick  Error3 message text"));
        firstJournal.add(new Record("2017-08-02 05:38:15 !!!!! Rick Error4 message text"));
        firstJournal.add(new Record("2017-08-05 01:45:15 .     Tom    Error5 message text"));
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

        Date fromDate = new GregorianCalendar(2017, Calendar.AUGUST, 4).getTime();
        Date toDate = new GregorianCalendar(2017, Calendar.AUGUST, 6).getTime();

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
