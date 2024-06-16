package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Person;

/**
 * Arbeiten mit Dateien
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D25_Files {

  @SuppressWarnings("unused")
  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Person> persons = new ArrayList<>();

    /* Pfadangaben */
    String pathAbsolute = "C:\\Users\\D054906\\git\\java_wwibe123\\resources\\persons.txt"; // absolut
    String pathRelative = "resources/persons.txt"; // relativ

    /* Systemeigenschaften */
    String fileSeparator = System.getProperty("file.separator");
    System.out.println("fileSeparator: " + fileSeparator);
    String userHomeDirectory = System.getProperty("user.home");
    System.out.println("userHomeDirectory: " + userHomeDirectory);
    String userWorkDirectory = System.getProperty("user.dir");
    System.out.println("userWorkDirectory: " + userWorkDirectory);

    /* Zeichenbasiertes Lesen von Dateien */
    File myFile = new File(pathRelative);
    Scanner myScanner = new Scanner(myFile);

    while (myScanner.hasNextLine()) {
      String line = myScanner.nextLine();
      System.out.println("line: " + line);
      String[] tokens = line.split(";");
      String name = tokens[0];
      char gender = tokens[2].charAt(0);
      int age = Integer.valueOf(tokens[1]);
      Person myPerson = new Person(name, gender, age);
      persons.add(myPerson);
    }

    for (Person p : persons) {
      System.out.println(p.getName() + " - " + p.getGender() + " - " + p.getAge());
    }

    myScanner.close();

  }

}
