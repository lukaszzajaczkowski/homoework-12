package pl.testuj.exceptions_examples;

import pl.testuj.exceptions_examples.exceptions.ImproperNumberException;
import pl.testuj.exceptions_examples.exceptions.ImproperNameException;


public class ExceptionsApp {
    public static void main(String[] args) throws ImproperNameException {
    /*
ZADANIE DOMOWE:
- napisz obsługę własnego wyjątku ImproperNameException - wyjątek rzucany jeśli
String jest null lub pusty
 */

            String name = "";

            try {
                checkName(name);
                System.out.println("Poprawne działanie programu");
            } catch (ImproperNameException e2) {
                System.out.println("IMPROPER NAME EXCEPTION");
                System.out.println("Błędne imię to " + e2.getName());
            }
            System.out.println("Koniec programu");

        }
            public static void checkName (String name) throws ImproperNameException {
                if (name == null || name == "") {
                    throw new ImproperNameException(name);
                }
            }
}
