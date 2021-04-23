import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UI {

  //----Attributter----
  //---Lavet af Christopher------
  private final Scanner scan = new Scanner(System.in);
  private LocalDateTime localDateTime = LocalDateTime.now();
  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

  //----Metoder----
  //----Lavet af Anna----
  public String getString(String message) {
    System.out.println(message);
    return scan.nextLine();
  }

  //----Lavet af Anna----
  public int getInt(String message) {
    getString(message);
    return intValidate();
  }

  //----Lavet af Anna----
  public void printPizzaMenu(PizzaMenu pizzaMenu) {
    Controller controller = new Controller();
  }

  //----Lavet af Anna----
  public int intValidate() {
    while (!scan.hasNextInt()) {
      getString("Fejl, indtast et tal: ");
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }

  //----Lavet af Anna----
  public int printOrdreListe(int s) {
    System.out.print(s + ": ");
    return s;
  }

  //----Lavet af Anna----
  public String printIndtastOrdre(String message) {
    System.out.println(message);
    return message;
  }

  //----Lavet af Anna----
  public String ugyldigtPizzaNummer(String message) {
    getString(message);
    return message;
  }

  //----Lavet af Anna----
  public String visTidspunkt(String localDateTime) {
    return localDateTime;
  }

}