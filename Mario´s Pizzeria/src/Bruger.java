import java.util.ArrayList;
import java.util.Scanner;

public class Bruger {
    private String midlertidig;
    private ArrayList<Pizza> ordreListe = new ArrayList<>();

    UI ui = new UI();
    PizzaMenu pizzaMenuen= new PizzaMenu();
    Menu menuen = new Menu();

    public void hentPizzaMenu(){
        pizzaMenuen.printPizzaMenu();
    }

    public void opretOrdreAlfonso() {
        // Alfonso skal kunne indskrive en pizza og så skal systemet registrere hvilken

        Scanner input = new Scanner(System.in);
        input.nextInt();

        for (int i = 1; i < pizzaMenuen.pizzaMenu.size(); i++) {
            Pizza pizzaer = pizzaMenuen.pizzaMenu.get(i);
            if (input.equals(pizzaer)) {
                input.nextInt();
                ordreListe.add(pizzaer);
            }
        }
    }

    public void seOrdreListeMario() {
        for (int i = 0; i < ordreListe.size(); i++) {
            ui.printOrdreListe(ordreListe.get(i).toString());
        }
    }




}