import java.util.Scanner;

public class Menu {
    private String menuOverskrift;
    private String leadText;
    private String[] pizzaMenu;

    public Menu(String s, String menuOverskrift, String[] pizzaMenu) {
        this.menuOverskrift = menuOverskrift;
        this.leadText = leadText;
        this.pizzaMenu = pizzaMenu;
    }
    public Menu() { //tom konstrtuktør
    }

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
            System.out.print(leadText);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                validChoice = true;
            } else {
                scanner.nextLine();
            }
        }     return choice;
    }
}

