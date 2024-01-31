package main;

/**
 * Arithmetische Operatoren
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D07_ArithmeticOperators {

    public static void main(String[] args) {
        
        int a = 5, b = 3, c;
        double d;
        
        /* Addition */
        c = a + b;
        System.out.println("a + b = " + c);
        
        /* Subtraktion */
        c = a - b;
        System.out.println("a - b = " + c);
        
        /* Multiplikation */
        c = a * b;
        System.out.println("a * b = " + c);
        
        /* Division */
        d = (double) a / b;
        System.out.println("(double) a / b = " + d);   
        
        /* Ganzzahlige Division */
        c = a / b; // ganzzahliger Quotient
        System.out.println("a / b = " + c);
        c = a % b; // Divisionrest (Modulo)
        System.out.println("a % b = " + c);
        
        /* Inkrementierung / Dekrementierung */
        c = 0;
        c = c + 1;
        c += 1; // c = c + 1;
        c++;
        System.out.println("c: " + c);
        
        c = c - 1;
        c -= 1;
        c--;
        System.out.println("c: " + c);
        
        /* Teilen durch Null */        
        // System.out.println(a / 0); // ArithmeticException
        System.out.println(a / 0.0); // Infinity
        System.out.println(a / -0.0); // -Infinity
        System.out.println(0 / 0.0); // NaN
        System.out.println(0 / -0.0); // NaN
    }
    
}
