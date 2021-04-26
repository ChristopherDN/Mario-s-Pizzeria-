import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UI {

  //----Attributter----
  //---Lavet af Christopher------
  private final Scanner scan = new Scanner(System.in);
  private LocalDateTime localDateTime = LocalDateTime.now();

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
    Kasseapparat kasseapparat = new Kasseapparat();
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

//printer en String i kasseapperatet
  public void printString(String besked){
    System.out.println(besked);
  }
  //printer en int
  public void printInt(int tal){
    System.out.println(tal);
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
  public String ugyldigtPizzaNummer(String besked) {
    getString(besked);
    return besked;
  }

  //----Lavet af Anna----
  public void visTidspunkt(LocalDateTime localDateTime) {
    System.out.println(localDateTime);
  }

}