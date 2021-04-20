import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);
  private final LocalDateTime købstid = LocalDateTime.now();

  void printMenu() {
    Bruger bruger = new Bruger();
    Mario mario = new Mario();
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
}
