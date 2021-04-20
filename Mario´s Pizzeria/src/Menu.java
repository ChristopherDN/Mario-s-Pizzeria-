import java.util.Scanner;

public class Menu {

    //----Attributter------
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
            System.out.print(brugerValg);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                scanner.nextLine();
            }
        }
        return choice;
    }

    public void visMenu() {
        UI ui = new UI();
        Bruger bruger = new Bruger();

        String[] menuChoice = {"1. Se Pizza Menu",
                "2. Opret ordre",
                "3. Se ordre",
                //"4. Slet ordre",
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
                case 9:
                    isRunning = false;
                    break;
                default:
                    System.out.println("\nFejl.\nDet indtastede er ugyldigt ");
            }
            for (int i = 0; i < pizzaMenuen.pizzaMenu.size(); i++) {

                if (pizzaMenuen.pizzaMenu.get(i).equals(userChoice)) ;
            }
        }
    }
}

