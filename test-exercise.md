Setze das abgebildete Klassendiagramm vollständig um. Erstelle zum Testen eine
ausführbare Klasse.

## Klassendiagramm

```mermaid
classDiagram
    FastFood o-- FastFoodCategory
    Shop~T extends Comparable<T>~ o-- FastFood
    Comparable~T~ <|.. FastFood: implements
    InvalidRatingException <.. Shop~T extends Comparable<T>~: throws
    NoProductFoundException <.. Shop~T extends Comparable<T>~: throws

    class FastFoodCategory {
        <<enumeration>>
        BURGER
        PIZZA
        FRIES
        ...
    }

    class FastFood {
        <<record>>
        name: String
        fastFoodCategory: FastFoodCategory
        calorificValueInKcal: double
        isVegetarian: boolean
        +compareTo(otherFastFood: FastFood) int
    }

    class Shop~T extends Comparable<T>~ {
        <<record>>
        name: String
        products: Map~T, List~Integer~~
        +addProduct(product: T) void
        +rateProduct(product: T, rating: int) void
        +getBestRatedProduct() T
        +getAllProductsSortedByNaturalOrdering() List~T~
    }

    class Comparable~T~ {
        <<interface>>
        +compareTo(o: T) int
    }

    class InvalidRatingException {
        <<exception>>
        +InvalidRatingException(rating: int)
    }

    class NoProductFoundException {
        <<exception>>
    }
```

## Allgemeine Hinweise

- Aus Gründen der Übersicht werden im Klassendiagramm keine Getter und
  Object-Methoden dargestellt
- So nicht anders angegeben, sollen Konstruktoren, Setter, Getter sowie die
  Object-Methoden wie gewohnt implementiert werden

## Hinweis zur Klasse _FastFood_

Die Methode `int compareTo(otherFastFood: FastFood)` soll so implementiert warden, dass damit FastFood absteigend nach den Kalorien sortiert warden kann.

## Hinweise zur Klasse _Shop_

- Die Methode `void addProduct(product: T)` soll das eingehende Produkt zum Sortiment hinzufügen
- Die Methode `void rateProduct(product: T, rating: int)` soll dem eingehenden Produkt die eingehende Bewertung hinzufügen. Für den Fall, dass das eingehende Produkt nicht im Sortiment vorhanden ist, soll die Ausnahme `NoProductFoundException` ausgelöst warden und für den Fall, dass die eingehende Bewertung nicht im Bereich 1 bis 5 liegt, soll die Ausnahme `InvalidRatingException` ausgelöst werden 
- Die Methode `Burger getBestRatedProduct()` soll das Produkt mit der höchsten
  Bewertung zurückgeben
- Die Methode `List<T> getAllProductsSortedByNaturalOrdering()` soll alle Produkte sortiert nach ihrer natürlichen Ordnung zurückgeben
