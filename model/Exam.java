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

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public String getLecture() {
    return lecture;
  }

  @Override
  public String toString() {
    return "Exam [lecture=" + lecture + ", grade=" + grade + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, lecture);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Exam other = (Exam) obj;
    return Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade)
        && Objects.equals(lecture, other.lecture);
  }

}
