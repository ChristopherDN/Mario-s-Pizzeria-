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
        ui.printIndtastOrdre("Indtast ordrenummer: ");
        int brugerInput = input.nextInt();

        while (input.nextInt() != 0) {
            for (int i = 0; i < pizzaMenuen.pizzaMenu.size(); i++) {
                if (brugerInput == (i)) {
                    ordreListe.add(brugerInput);
                }

        for (int i = 0; i < pizzaMenuen.pizzaMenu.size(); i++) {
            if (brugerInput == (i)) {
                ordreListe.add(brugerInput);
                System.out.println(ordreListe);
// TODO: 20/04/2021 metoden skal kunne tilføje flere pizzaer på en ordre. og evt filer  
                
            }
        }
    }

    public void seOrdreListeMario() {
        for (int i = 0; i < ordreListe.size(); i++) {
            ui.printOrdreListe(ordreListe.get(i).toString());
            File fileRead = new File("src/orderliste.txt");
            Scanner fileReader = new Scanner(fileRead);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());
                fileReader.close(); //god stil
            }
        }
    }
}