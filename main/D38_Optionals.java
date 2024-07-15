package main;

import java.util.Optional;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D38_Optionals {

  public static void main(String[] args) {

    /* Ohne Optionals */
    String text = getText(false);
    if (text != null) {
      System.out.println(text.toUpperCase());
    } else {
      System.out.println("null");
    }

    /* Mit Optionals */
    Optional<String> optionalText = getOptionalText(false);
    if (optionalText.isPresent()) {
      System.out.println(optionalText.get().toUpperCase());
    } else {
      System.out.println("leeres Optional");
    }

    optionalText.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
        () -> System.out.println("leeres Optional"));
  }

  private static String getText(boolean giveBack) {
    if (giveBack) {
      return "Hallo Welt";
    }
    return null;
  }

  private static Optional<String> getOptionalText(boolean giveBack) {
    if (giveBack) {
      return Optional.ofNullable("Hallo Welt");
    }
    return Optional.empty();
  }

}
