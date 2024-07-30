package model;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
@EqualsAndHashCode
@ToString
@Setter
public class Person {

  private final String name;
  private final char gender;
  private int age;

  public Person(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

}
