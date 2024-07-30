package model;

import java.util.Objects;

/**
 * Klausur
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Exam {

  private final String lecture;
  private double grade;

  public Exam(String lecture, double grade) {
    this.lecture = lecture;
    this.grade = grade;
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
    Exam other = (Exam) obj;
    return Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade)
        && Objects.equals(lecture, other.lecture);
  }

  public double getGrade() {
    return grade;
  }

  public String getLecture() {
    return lecture;
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, lecture);
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "Exam [lecture=" + lecture + ", grade=" + grade + "]";
  }

}
