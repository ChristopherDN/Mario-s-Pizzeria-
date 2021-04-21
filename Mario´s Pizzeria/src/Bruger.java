import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
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
