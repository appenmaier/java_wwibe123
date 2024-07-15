package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import model.Exam;
import model.Student;

/**
 * Assoziativspeicher (Maps)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D37_Maps {

  public static void main(String[] args) {

    Map<Student, List<Exam>> studentsWithExams = new HashMap<>();

    Student student = new Student("8172634", "Hans Maier");

    /* Werte setzen */
    studentsWithExams.put(student, List.of(new Exam("LA", 3.4), new Exam("Programmierung 2", 2.1)));
    studentsWithExams.put(new Student("9109832", "Peter Schmid"),
        List.of(new Exam("LA", 1.4), new Exam("Programmierung 2", 1.8)));
    studentsWithExams.put(new Student("6152435", "Lisa Mueller"),
        List.of(new Exam("LA", 2.8), new Exam("Programmierung 2", 2.2)));
    System.out.println(studentsWithExams.put(new Student("9109832", "Peter Schmid"),
        List.of(new Exam("LA", 1.3), new Exam("Programmierung 2", 1.7))));

    /* Werte lesen */
    System.out.println(studentsWithExams.get(new Student("9109832", "Peter Schmid")));

    /* Inhalte pruefen */
    System.out.println(studentsWithExams.containsKey(new Student("8172634", "Lisa Mueller")));
    System.out.println(studentsWithExams
        .containsValue(List.of(new Exam("LA", 3.4), new Exam("Programmierung 2", 2.1))));

    System.out.println(studentsWithExams);

    /* Datensammlungen: Die Menge aller Schluessel */
    System.out.println("Anwesenheitsliste: ");
    for (Student s : studentsWithExams.keySet()) {
      System.out.println(s);
    }
    System.out.println();

    /* Datensammlungen: Alle Werte */
    double total = 0;
    int numberOfExams = 0;
    for (List<Exam> exams : studentsWithExams.values()) {
      for (Exam e : exams) {
        total += e.getGrade();
        numberOfExams++;
      }
    }
    System.out
        .println("Durchschnittsnote aller Klausuren aller Studenten: " + total / numberOfExams);

    /* Datensammlung: Die Menge aller Schluessel-Wert-Paare (aller Eintraege) */
    for (Entry<Student, List<Exam>> entry : studentsWithExams.entrySet()) {
      Student s = entry.getKey();
      List<Exam> exams = entry.getValue();
      System.out.println(s.getMatriculationNumber() + ": " + exams);
    }

    /* Die forEach-Methode */
    studentsWithExams
        .forEach((s, exams) -> System.out.println(s.getMatriculationNumber() + ": " + exams));

  }

}
