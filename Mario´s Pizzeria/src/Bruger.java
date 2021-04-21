import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
    private LocalDateTime localDateTime = LocalDateTime.now();
    private String midlertidig;
    private ArrayList<Integer> ordreListe = new ArrayList<>();

    UI ui = new UI();
    PizzaMenu pizzaMenuen = new PizzaMenu();
    Menu menuen = new Menu();

    public void hentPizzaMenu() {
        pizzaMenuen.printPizzaMenu();
    }

    public void opretOrdreAlfonso() {
        Scanner input = new Scanner(System.in);
        ui.printIndtastOrdre("Indtast ordrenummer, afslut med 0: ");
        int brugerInput = input.nextInt();

        do {
            for (int i = 1; i < pizzaMenuen.pizzaMenu.size()+1; i++) {
                if (brugerInput == (i)) {
                    ordreListe.add(brugerInput);
            ui.printIndtastOrdre("Indtast nummer, afslut med 0: ");
            brugerInput = input.nextInt();
            input.nextLine();
                }
            }
        }
        while (brugerInput != 0);
    }

            public void seOrdreListeMario () {
                for (int i = 0; i < ordreListe.size(); i++) {
                    ui.printOrdreListe(ordreListe.get(i));
                }
            }
            public void uploadOrdreListe()  {

                File file = new File("Mario´s Pizzeria/src/Ordreliste.txt");
                PrintStream fileWriter = null;
                try {
                    fileWriter = new PrintStream(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < ordreListe.size(); i++) {
                    fileWriter.println("Bestilling nr: " + ordreListe.get(i).toString() + "\nDato og tid: " + localDateTime);
                    fileWriter.println();
                }

  }
}
