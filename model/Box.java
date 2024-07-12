package model;

/**
 * Box
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Box<T, U extends Number> {

  private T contentA;
  private U contentB;

  public T getContentA() {
    return contentA;
  }

  public void setContentA(T contentA) {
    this.contentA = contentA;
  }

  public U getContentB() {
    return contentB;
  }

  public void setContentB(U contentB) {
    this.contentB = contentB;
  }

  public void doSomething() {
    System.out.println(contentB.byteValue());
  }

}
