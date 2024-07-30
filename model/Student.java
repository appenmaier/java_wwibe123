package model;

import java.util.Objects;

/**
 * Student
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Student implements Comparable<Student> {

  private final String matriculationNumber;
  private final String fullName;

  public Student(String matriculationNumber, String fullName) {
    this.matriculationNumber = matriculationNumber;
    this.fullName = fullName;
  }

  @Override
  public int compareTo(Student otherStudent) {
    return matriculationNumber.compareTo(otherStudent.matriculationNumber);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Student other = (Student) obj;
    return Objects.equals(fullName, other.fullName)
        && Objects.equals(matriculationNumber, other.matriculationNumber);
  }

  public String getFullName() {
    return fullName;
  }

  public String getMatriculationNumber() {
    return matriculationNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, matriculationNumber);
  }

  @Override
  public String toString() {
    return "Student [matriculationNumber=" + matriculationNumber + ", fullName=" + fullName + "]";
  }

}
