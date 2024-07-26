package model;

import java.util.Objects;

/**
 * Drache
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DragonNormalClass {

  private final String name;
  private int age;

  public DragonNormalClass(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DragonNormalClass other = (DragonNormalClass) obj;
    return age == other.age && Objects.equals(name, other.name);
  }

  @Override
  public String toString() {
    return "DragonNormalClass [name=" + name + ", age=" + age + "]";
  }

}
