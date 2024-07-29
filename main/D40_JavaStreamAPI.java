package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Person;

public class D40_JavaStreamAPI {

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Anna", 'w', 19));
    persons.add(new Person("Max", 'm', 17));
    persons.add(new Person("Lisa", 'w', 16));
    persons.add(new Person("Hans", 'm', 23));
    persons.add(new Person("Mia", 'w', 21));
    persons.add(new Person("Fritz", 'm', 15));
    persons.add(new Person("Petra", 'w', 22));

    /* Imperative Lösung */
    List<String> names = new ArrayList<>();
    for (Person p : persons) {
      if (p.getGender() == 'w' && p.getAge() > 17) {
        String name = p.getName().toUpperCase();
        names.add(name);
      }
    }

    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String n1, String n2) {
        return n2.compareTo(n1);
      }
    });

    for (String n : names) {
      System.out.println(n);
    }

    /* Funktionale Lösung */
    List<String> names2 = persons.stream()
        .filter(p -> p.getGender() == 'w')
        .filter(p -> p.getAge() > 17)
        .map(p -> p.getName().toUpperCase())
        .sorted((n1, n2) -> n2.compareTo(n1))
        .toList();

    names2.forEach(System.out::println);

  }

}
