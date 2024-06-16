package misc;

import java.util.Random;

public class ExamTask03 {

  private static int counter;
  private static int[] data;

  public static void main(String[] args) {
    data = new int[1_000_000];

    Random random = new Random();
    for (int i = 0; i < 1_000_000; i++) {
      int randomNumber = random.nextInt(1, 101);
      data[i] = randomNumber;
    }

    ExamTask03.insertSort();
  }

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
      ExamTask03.print();
      i++;
    }
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
