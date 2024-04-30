package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Zeichenkettenverarbeitung, Wrapper-Klassen und Datums- und Zeitangaben
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D24_StringProcessingAndWrappersAndDatesAndTimes {

  public static void main(String[] args) {

    /* Zeichenkettenverarbeitung */
    String text = "Max;Peter;Lisa;Hans";
    String[] names = text.split(";");
    for (String name : names) { // for(int i = 0; i < names.length; i++) {
      System.out.println(name); // System.out.println(names[i]);
    }

    /* Wrapper-Klassen */
    String numberText = "42";
    int number = Integer.valueOf(numberText);
    System.out.println("number: " + number);

    /* Datums- und Zeitangaben */
    long timeInMillis = System.currentTimeMillis();
    System.out.println("timeInMillis: " + timeInMillis);

    LocalDateTime now = LocalDateTime.now();
    System.out.println("now: " + now);
    System.out.println("dayOfYear: " + now.getDayOfYear());

    int day = 4, month = 1, year = 1982;
    LocalDate myBirthday = LocalDate.of(year, month, day);
    System.out.println("myBirthday: " + myBirthday);

  }

}
