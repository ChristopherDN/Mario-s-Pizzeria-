import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
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
  /*          File fileRead = new File("src/orderliste.txt");


            Scanner fileReader = new Scanner(fileRead);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());

               fileReader.close(); //god stil
               */


                }
            }
        }
