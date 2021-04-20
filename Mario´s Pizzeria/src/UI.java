import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {

  private final Scanner scan = new Scanner(System.in);
  private final LocalDateTime købstid = LocalDateTime.now();

  //string getter
  public String getString(String besked) {
    System.out.println(besked);
    return scan.nextLine();
  }

  //int getter
  public int getInt(String besked) {
    System.out.println(besked);
    return intValidate();
  }
  //int validering
  public int intValidate() {
    while (!scan.hasNextInt()) {
      getString("Invalid input, enter a new number: ");
    }
    int nextNumber = scan.nextInt();
    scan.nextLine();

    return nextNumber;
  }
  public String printOrdreListe(String s) {
    System.out.println(s);
    return s;
  }
}
