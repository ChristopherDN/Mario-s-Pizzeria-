import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UI {

  //----Attributter----
  private final Scanner scan = new Scanner(System.in);
  private LocalDateTime localDateTime = LocalDateTime.now();
  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

  //----Metoder----
  public String getString(String message) {
    System.out.println(message);
    return scan.nextLine();
  }

  public int getInt(String message) {
    getString(message);
    return intValidate();
  }

  public void printPizzaMenu(PizzaMenu pizzaMenu) {
    Bruger bruger = new Bruger();
  }

  public int intValidate() {
    while (!scan.hasNextInt()) {
      getString("Fejl, indtast et tal: ");
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  public int printOrdreListe(int s) {
    System.out.print(s + ": ");
    return s;
  }

  public String printIndtastOrdre(String message) {
    System.out.println(message);
    return message;
  }

  public String ugyldigtPizzaNummer(String message) {
    getString(message);
    return message;
  }

  public String visTidspunkt(String localDateTime) {
    return localDateTime;
  }

}