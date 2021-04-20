import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);
  private final LocalDateTime købstid = LocalDateTime.now();

  void printPizzaMenu(PizzaMenu pizzaMenu) {
    Bruger bruger = new Bruger();
<<<<<<< HEAD

=======
    
>>>>>>> 1f0ed084724f1fa7bb9afdff61bdc302cc2e7f37
  }

  //Get string
  public String getString(String besked) {
    System.out.println(besked);
    return scan.nextLine();
  }

  //Get int
  public int getInt(String besked) {
    System.out.println(besked);
    return intValidate();
  }
// Int validering
  public int intValidate() {
    while (!scan.hasNextInt()) {
      getString("Fejl, indtast et tal: ");
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }
<<<<<<< HEAD
  public String printOrdreListe(String s) {
    getString(s);
    return s;
=======
  public String printOrdreListe(String message) {
    System.out.println(message);
    return message;
  }

  public String printIndtastOrdre(String message){
    System.out.println(message);
    return message;
  }

  public String printOrdreUgyldig(String message){
    System.out.println(message);
    return message;

>>>>>>> 7891c1e90123e917f545c49639fc8a11d2a48021
  }

  public String printPizzaer(String p) {
    getString(p);
    return p;
  }

}
