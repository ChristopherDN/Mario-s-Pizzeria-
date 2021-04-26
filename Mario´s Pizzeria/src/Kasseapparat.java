import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Kasseapparat {

  //----Attributter----
  private ArrayList<Ordre> ordreListe = new ArrayList<>();
  private ArrayList<String> filListe = new ArrayList<>();

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
    ArrayList<Pizza> pizzaListe = new ArrayList<>();
    ui.printIndtastOrdre("Indtast ordrenummer, afslut med 0: ");
    int brugerInput = input.nextInt();

    do {
      for (int i = 0; i < pizzaMenuen.getPizzaMenu().size(); i++) {
        //Laver en variabel med nuværende pizza
        Pizza pizza = pizzaMenuen.getPizzaMenu().get(i);

        if (brugerInput == pizza.getNummer()) {

          pizzaListe.add(pizza);
        }
      }
      //lav ordre
      ui.printIndtastOrdre("Indtast nummer, afslut med 0: ");
      brugerInput = input.nextInt();
      input.nextLine();
    }
    while (brugerInput != 0);

    Ordre ordre = new Ordre(pizzaListe);
    ordreListe.add(ordre);
    uploadOrdreListe();
  }


  //----Lavet af Younes----
  public void seOrdreListeMario() {
     downloadOrdreFil();
    for (int i = 0; i < filListe.size(); i++) {

      ui.printString("Ordre nummer: " + ((i) + 1));
      ui.printString(filListe.get(i));
    }
  }


  //----Lavet af Younes----
  public void uploadOrdreListe() {
    File file = new File("src/Ordreliste.txt");
    try {
      FileWriter fw = new FileWriter(file, true);
      for (int i = 0; i < ordreListe.size(); i++) {
        //ordreliste
        Ordre ordre = ordreListe.get(i);

        fw.append("Pizza nummer: ");

        for (int j = 0; j < ordre.getPizzaer().size(); j++) {
          //Value Of konverter int(getNummer) til string
          fw.append(String.valueOf(ordre.getPizzaer().get(j).getNummer()));
          fw.append(", ");

        }

        fw.append("Dato og tid: ").append(ordreListe.get(i).getTid());
        fw.append("\n");
      }
      fw.close();
      ordreListe.clear();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //----Lavet af Younes----
  public void downloadOrdreFil() {
    filListe.clear();
    try {
      File fileRead = new File("src/Ordreliste.txt");


      Scanner fileReader = new Scanner(fileRead);

      while (fileReader.hasNextLine()) {
        filListe.add(fileReader.nextLine());
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }

  //--Lavet af Younes----
  public void sletOrdre() {

    Scanner input = new Scanner(System.in);
    ui.getString("Indtast bestillingsnummer som du vil slette: ");

    int sletBestillingsNummer = input.nextInt();
    for (int i = 0; i < filListe.size(); i++) {
      if (i == (sletBestillingsNummer - 1)) {
        filListe.remove(i);
      }
    }
    try {
      File file = new File("src/OrdreListe.txt");
      // beholder txt filen og tilføjer en ny String ordre
      FileWriter fw = new FileWriter(file, false);
      for (int i = 0; i < filListe.size(); i++) {
        fw.append(filListe.get(i)).append("\n");
      }
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
