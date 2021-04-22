import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Bruger {

  //----Attributter----
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
  private LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
  private ArrayList<Integer> ordreListe = new ArrayList<>();
  private int bestillingsNummer;

  //----Override konstruktør----
  public Bruger(){
  }


  //--Konstruktør----

  public Bruger(int bestillingsNummer)    {
    this.bestillingsNummer = bestillingsNummer;
  }

  //----Getter----
  public int getBestillingsNummer() {
    return bestillingsNummer;
  }

  //----Setter----
  public void setBestillingsNummer(int bestillingsNummer) {
    this.bestillingsNummer = bestillingsNummer;

  }

  //----Instantieringer---
  UI ui = new UI();
  PizzaMenu pizzaMenuen = new PizzaMenu();
  Menu menuen = new Menu();


  //----Metoder----
  public void hentPizzaMenu() {
    pizzaMenuen.printPizzaMenu();
  }

  //----Lavet af Younes----
  public void opretOrdreAlfonso() {
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


  //----Lavet af Younes----
  public void seOrdreListeMario() {

    for (int i = 0; i < ordreListe.size(); i++) {
      Bruger bruger = new Bruger(i);
      //bestillingsNummer++;
      System.out.println("\n" + ui.visTidspunkt(localDateTime.format(formatter)) + "\n" + "Bestilling nummer: " + bruger.getBestillingsNummer());

      System.out.print("Pizza nummer: ");

      ui.printOrdreListe((ordreListe.get(i)));


      for (int j = 0; j < pizzaMenuen.getPizzaMenu().size(); j++) {
        if (ordreListe.get(i) == pizzaMenuen.getPizzaMenu().get(j).getNummer()) {
          System.out.println("\n" + pizzaMenuen.getPizzaMenu().get(j).getNavn());
        }
      }
    }
  }

  //----Lavet af Younes----
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
      Bruger bruger = new Bruger(i);
      //bestillingsNummer++;
      fileWriter.println("Bestilling nummer: " + bruger.getBestillingsNummer() + "\nPizza nummer: " + ordreListe.get(i).toString() + "\nDato og tid: " + ui.visTidspunkt(localDateTime.format(formatter)));
      fileWriter.println();
    }
  }

  //----Lavet af Younes----
  public void downloadOrdreListe() {
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

  //--Lavet af Younes----
  public void sletOrdre() {

    Scanner input = new Scanner(System.in);
    System.out.println("Indtast bestillingsnummer som du vil slette: ");
    int sletBestillingsNummer = input.nextInt();
    for (int i = 0; i < ordreListe.size(); i++) {
      Bruger bruger = new Bruger(i);
      if (bruger.getBestillingsNummer() == sletBestillingsNummer) {
        ordreListe.remove(i);
      }
    }
  }
  
}

