import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    //----Attributter------
    final UI ui = new UI();
    private String menuOverskrift;
    private String brugerValg;
    private String[] pizzaMenu;

    //----Konstruktør----
    public Menu(String menuOverskrift, String brugerValg, String[] pizzaMenu) {
        this.menuOverskrift = menuOverskrift;
        this.brugerValg = brugerValg;
        this.pizzaMenu = pizzaMenu;
    }

    //----Override konstrtuktør----
    public Menu() {
    }

    //----Instantiering----
    PizzaMenu pizzaMenuen = new PizzaMenu();



    //----Metoder----
    public void printMenu() {
        String printString = menuOverskrift + "\n";
        for (int i = 0; i < pizzaMenu.length; i++)
            printString += pizzaMenu[i] + "\n";
        System.out.println("\n" + printString);
    }

    public int readChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;
        while (!validChoice) {
            ui.getInt(brugerValg);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                scanner.nextLine();
            }
        }
        return choice;
    }

    public void visMenu() throws FileNotFoundException {
        Bruger bruger = new Bruger();

        String[] menuChoice = {"1. Se Pizza Menu",
                "2. Opret ordre",
                "3. Se ordre",
                "4. Upload ordreliste",
                "5. Download ordreliste",
                "9. Afslut"};
        Menu menu = new Menu("MARIOS PIZZA:", "Vælg: ", menuChoice);


        menu.printMenu();
        boolean isRunning;
        isRunning = true;
        while (isRunning) {
            int userChoice = menu.readChoice();

            switch (userChoice) {
                case 1:
                    pizzaMenuen.printPizzaMenu();
                    break;
                case 2:
                    bruger.opretOrdreAlfonso();
                    break;
                case 3:
                    bruger.seOrdreListeMario();
                    break;
                case 4:
                    bruger.uploadOrdreListe();
                    break;
                case 5:
                    bruger.downloadOrdreListe();
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    ui.getInt("\nFejl.\nDet indtastede er ugyldigt ");
            }
            for (int i = 0; i < pizzaMenuen.getPizzaMenu().size(); i++) {

                if (pizzaMenuen.getPizzaMenu().get(i).equals(userChoice)) ;
            }
        }
    }
}

