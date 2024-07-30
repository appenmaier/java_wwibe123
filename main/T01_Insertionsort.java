package main;

import java.util.Random;

/**
 * Klausurvorbereitung: Insertionsort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class T01_Insertionsort {

  private static int counter;
  private static int[] data;

  private static void insertSort() {
    int tmp = 0;
    int i = 1;
    while (i < data.length) {
      counter++;
      int j = i;
      tmp = data[j];
      while (j > 0 && data[j - 1] > tmp) {
        data[j] = data[j - 1];
        j--;
      }
      data[j] = tmp;
      T01_Insertionsort.print();
      i++;
    }
  }

  public static void main(String[] args) {
    data = new int[1_000_000];

    Random random = new Random();
    for (int i = 0; i < 1_000_000; i++) {
      int randomNumber = random.nextInt(1, 101);
      data[i] = randomNumber;
    }

    T01_Insertionsort.insertSort();
  }

  private static void print() {
    System.out.println("Durchlauf: " + counter);
    int i = 0;
    while (i < data.length) {
      System.out.println(data[i]);
      i++;
    }
  }

}
