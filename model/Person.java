package model;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Person {

  private final String name;
  private final char gender;
  private int age;

  public Person(String name, char gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

}
