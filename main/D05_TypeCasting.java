package main;

/**
 * Typumwandlungen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D05_TypeCasting {

  public static void main(String[] args) {

    /* Reihenfolge: byte -> short -> int -> long -> float -> double */

    /* Implizite Typumwandlungen / Erweiternde Typumwandlungen (type promotion) */
    byte b1 = 42; // (00101010)
    short s1 = b1; // (00000000 00101010)
    int i1 = s1; // (00000000 00000000 00000000 00101010)
    long l1 = i1; // (00000000 00000000 00000000 00000000 00000000 00000000 00000000 00101010)
    float f1 = l1; // (01000010 00101000 00000000 00000000)
    double d1 = f1; // (01000000 01000101 00000000 00000000 00000000 00000000 00000000 00000000)

    System.out.println("b1: " + b1);
    System.out.println("s1: " + s1);
    System.out.println("i1: " + i1);
    System.out.println("l1: " + l1);
    System.out.println("f1: " + f1);
    System.out.println("d1: " + d1);

    /* Explizite Typumwandlungen / Einschraenkenden Typumwandlungen (type demotion) */
    double d2 = 1.9; // (00111111 11111110 01100110 01100110 01100110 01100110 01100110 01100110)
    float f2 = (float) d2; // (00111111 11110011 00110011 00110011)
    long l2 = (long) d2; // (00000000 00000000 00000000 00000000 00000000 00000000 00000000
                         // 00000001)

    System.out.println("d2: " + d2);
    System.out.println("f2: " + f2);
    System.out.println("l2: " + l2);

    /* Typumwandlung char <-> int */
    int i2 = 'A';
    char c1 = 65;
    char c2 = (char) 65L;

    System.out.println("i2: " + i2);
    System.out.println("c1: " + c1);
    System.out.println("c2: " + c2);
  }

}
