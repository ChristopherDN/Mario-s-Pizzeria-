import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    //----Attributter------
    //---Lavet af Christopher------
    private String menuOverskrift;
    private String brugerValg;
    private String[] pizzaMenu;
    final UI ui = new UI();

    //----Konstruktør----
    //---Lavet af Christopher------
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
    //----Lavet af Anna-Christopher---
    public void printMenu() {
        String printString = menuOverskrift + "\n";
        for (int i = 0; i < pizzaMenu.length; i++)
            printString += pizzaMenu[i] + "\n";
        System.out.println("\n" + printString);
    }

    //----Lavet af Anna-Christopher---
    public int readChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;
        int choice = -1;
        while (!validChoice) {
            System.out.print(brugerValg);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                ui.getInt("Fejl, indtast et tal fra menuen");
                scanner.nextLine();
            }
        }
        return choice;
    }

    //----Lavet af Anna-Christopher---
    public void visMenu() throws FileNotFoundException {
        Controller controller = new Controller();

        String[] menuChoice = {"1. Se Pizza Menu",
                "2. Opret ordre",
                "3. Se ordre",
                "4. Upload ordreliste",
                "5. Download ordreliste",
                "6. Slet ordre",
                "9. Afslut"};

        Menu menu = new Menu("MARIOS PIZZA:", "\nVælg: \n", menuChoice);

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
                    controller.opretOrdreAlfonso();
                    break;
                case 3:
                    controller.seOrdreListeMario();
                    break;
                case 4:
                    controller.uploadOrdreListe();
                    break;
                case 5:
                    controller.downloadOrdreListe();
                    break;
                case 6:
                    controller.sletOrdre();
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    ui.getString("\nFejl.\nDet indtastede er ugyldigt ");
            }
            for (int i = 0; i < pizzaMenuen.getPizzaMenu().size(); i++) {

                if (pizzaMenuen.getPizzaMenu().get(i).equals(userChoice)) ;
            }
        }
    }

}

