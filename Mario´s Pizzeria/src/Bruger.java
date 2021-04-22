import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
  private LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
  private String midlertidig;
  private ArrayList<Integer> ordreListe = new ArrayList<>();


  UI ui = new UI();
  PizzaMenu pizzaMenuen = new PizzaMenu();
  Menu menuen = new Menu();

  public void hentPizzaMenu() {
    pizzaMenuen.printPizzaMenu();
  }

  public void opretOrdreAlfonso()  {
    Scanner input = new Scanner(System.in);
    ui.printIndtastOrdre("Indtast ordrenummer, afslut med 0: ");
    int brugerInput = input.nextInt();

    do {
      for (int i = 0; i < pizzaMenuen.getPizzaMenu().size(); i++) {
        if (brugerInput == pizzaMenuen.getPizzaMenu().get(i).getNummer()) {
          ordreListe.add(pizzaMenuen.getPizzaMenu().get(i).getNummer());
          ui.printIndtastOrdre("Indtast nummer, afslut med 0: ");
          brugerInput = input.nextInt();
          input.nextLine();
        }
      }
    }
    while (brugerInput != 0);
  }

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

  public void seOrdreListeMario() {
    for (int i = 0; i < ordreListe.size(); i++) {

      System.out.println(ui.visTidspunkt(localDateTime.format(formatter)));
      ui.printOrdreListe(ordreListe.get(i));

      for (int j = 0; j < pizzaMenuen.getPizzaMenu().size(); j++) {
        if (ordreListe.get(i) == j + 1) {
<<<<<<< HEAD
          System.out.println(pizzaMenuen.getPizzaMenu().get(j).getNavn() + "\n");
=======
          System.out.println(pizzaMenuen.getPizzaMenu().get(j).getNavn());
>>>>>>> 028631fe3617a3ef5839b76d6a1c709db84d7ea8
        }
      }
    }
  }
  public void uploadOrdreListe() {
    File fileWrite = new File("Mario´s Pizzeria/src/Ordreliste.txt");
    PrintStream fileWriter = null;
    try {
      fileWriter = new PrintStream(fileWrite);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    for (int i = 0; i < ordreListe.size(); i++) {
      fileWriter.println("Bestilling nr: " + ordreListe.get(i).toString() + "\nDato og tid: " + ui.visTidspunkt(localDateTime.format(formatter)));
      fileWriter.println();

    }
<<<<<<< HEAD
  }
=======
<<<<<<< HEAD
  }
    public void sletOrdre () {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of order you want to delete: ");
      int brugerName = input.nextInt();
      for (int i = 0; i < ordreListe.size(); i++) {
        if (ordreListe.get(i).equals(brugerName)) {
          ordreListe.remove(i);
        }
      }
=======
>>>>>>> 028631fe3617a3ef5839b76d6a1c709db84d7ea8

    public void downloadOrdreListe () {
      File fileRead = new File("Mario´s Pizzeria/src/Ordreliste.txt");
      Scanner fileReader = null;
      try {
        fileReader = new Scanner(fileRead);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      while (fileReader.hasNext()) {
        System.out.println(fileReader.nextLine());
      }
  }

<<<<<<< HEAD
  public void sletOrdre () {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of order you want to delete: ");
    int brugerName = input.nextInt();
    for (int i = 0; i < ordreListe.size(); i++) {
      if (ordreListe.get(i).equals(brugerName)) {
        ordreListe.remove(i);
      }
=======
   */
>>>>>>> ce1b39128681d200572defb401a0671962366de0
>>>>>>> 028631fe3617a3ef5839b76d6a1c709db84d7ea8
    }
  }
}

