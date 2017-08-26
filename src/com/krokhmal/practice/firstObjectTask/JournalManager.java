package com.krokhmal.practice.firstObjectTask;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by NKrok on 03.08.2017.
 */
public class JournalManager {

    public static void main(String[] args) {
        Journal firstJournal = new Journal();

        System.out.println("====================================================================================");
        System.out.println(" 1. First journal filling start");
        System.out.println("====================================================================================");
        firstJournal.add(Record.add("2017-08-04 06:15:09 !!!!! A-Journal-1     Error1 message text"));
        firstJournal.add(Record.add("2017-08-09 17:34:15 .     D-Journal-1     Error2 message text"));
        firstJournal.add(Record.add("2017-08-16 12:36:15 !     A-Journal-1  Error3 message   text"));
        firstJournal.add(Record.add("2017-08-02 05:38:15 !!!   B-Journal-1 Error4 message text"));
        firstJournal.add(Record.add("2017-08-05 01:45:15 !!!!!   A-Journal-1    Error5     message text"));
        Record singleRecord = new Record(new Date(), Priority.HIGH,"D-Journal-1"," Error6 message text");
        firstJournal.add(singleRecord);

        System.out.println(firstJournal.toString());

        Journal secondJournal = new Journal();

        System.out.println("====================================================================================");
        System.out.println(" 2. Second journal filling start");
        System.out.println("====================================================================================");

        secondJournal.add(Record.add("2016-06-01 01:42:00 .     F-Journal-2 Error0 message text"));

        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 3. Add first journal to second journal. PRINT SECOND JOURNAL");
        System.out.println("====================================================================================");

        secondJournal.add(firstJournal);
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 4. Remove Record with Error 6 FIRST journal");
        System.out.println("====================================================================================");

        firstJournal.remove(singleRecord);
        System.out.println(firstJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 5. Remove index range from 1 to 3 from FIRST journal");
        System.out.println("====================================================================================");

        firstJournal.remove(1, 3);
        System.out.println(firstJournal.toString());

        System.out.println("====================================================================================");
        System.out.println(" 6. Remove all from FIRST journal");
        System.out.println("====================================================================================");

        firstJournal.removeAll();
        System.out.println(firstJournal.toString());


        System.out.println("====================================================================================");
        System.out.println(" 7. filter SECOND journal by string \"A-Journal-1\"");
        System.out.println("====================================================================================");

        System.out.println(secondJournal.filter("A-Journal-1").toString());

        System.out.println("====================================================================================");
        System.out.println(" 8. filter SECOND journal by date range from 2017-08-04 00:00:00 to 2017-08-06 00:00:00");
        System.out.println("====================================================================================");

        Date fromDate = new GregorianCalendar(2017, Calendar.AUGUST, 4).getTime();
        Date toDate = new GregorianCalendar(2017, Calendar.AUGUST, 6).getTime();

        System.out.println(secondJournal.filter(fromDate, toDate).toString());

        System.out.println("====================================================================================");
        System.out.println(" 9. sort SECOND journal records by Date");
        System.out.println("====================================================================================");

        secondJournal.sortByDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println("10. sort SECOND journal records by Priority, Date");
        System.out.println("====================================================================================");

        secondJournal.sortByImportanceDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println("11. sort SECOND journal records by Priority, Source, Date");
        System.out.println("====================================================================================");

        secondJournal.sortByImportanceSourceDate();
        System.out.println(secondJournal.toString());

        System.out.println("====================================================================================");
        System.out.println("12. sort SECOND journal records by Source, Date");
        System.out.println("====================================================================================");

        secondJournal.sortBySourceDate();
        System.out.println(secondJournal.toString());
    }
}
