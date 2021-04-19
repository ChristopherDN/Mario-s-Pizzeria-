import java.io.IOException;

public class PizzaMenu {

    public void visMenu() {

        UI ui = new UI();
        PizzaMenu pizzaMenu = new PizzaMenu();
        Alfonso alfonso = new Alfonso();
        Mario mario = new Mario();

        boolean isRunning;
        Menu menu = new Menu("MARIOS PIZZA:", "Vælg: ", new String[]{
                "1. Se Pizza Menu",
                "2. Opret ordre",
                "3. Se ordre",
                //"4. Slet ordre",
                "9. Quit" });

        isRunning = true;
        while (isRunning) {
            menu.printMenu();
            int userChoise = menu.readChoice();

            switch (userChoise) {
                case 1:
                    ui.printPizzaMenu();
                    break;
                case 2:
                    alfonso.opretOrdre();
                    break;
                case 3:
                    mario.seOrdreListe();
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    System.out.println("\nFejl.\nDet indtastede er ugyldigt ");
            }
        }
        }
    }

