import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);
  private final LocalDateTime købstid = LocalDateTime.now();

  void printPizzaMenu(PizzaMenu pizzaMenu) {
    Bruger bruger = new Bruger();
  }

  //Get string
  public String getString(String message) {
    System.out.println(message);
    return scan.nextLine();
  }

  //Get int
  public int getInt(String message) {
    System.out.println(message);
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


  public int printOrdreListe(int s) {
    System.out.println(s);
    return s;
  }
  public String printIndtastOrdre (String message){
      System.out.println(message);
      return message;


    /*public String printOrdreUgyldig (String message){
      System.out.println(message);
      return message;

    }*/

    /*public String printPizzaer (String p){
      getString(p);
      return p;
      */
    }
  public String ugyldigtPizzaNummer(String message) {
    getString(message);
    return message;
  }

  }

