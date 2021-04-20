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
        ui.printIndtastOrdre("Indtast ordrenavn: ");
        input.nextInt();

        for (int i = 0; i < pizzaMenuen.pizzaMenu.size(); i++) {
            if (input.equals(pizzaMenuen.pizzaMenu.get(i).getNummer()));
                ordreListe.add(pizzaMenuen.pizzaMenu.get(i));
        }
    }

    public void seOrdreListeMario() {
        for (int i = 0; i < ordreListe.size(); i++) {
            ui.printOrdreListe(ordreListe.get(i).toString());
        }
    }




}