import java.util.ArrayList;

public class PizzaMenu {
  public ArrayList<Pizza> pizzaMenu = new ArrayList();

  public PizzaMenu() {
    pizzaMenu.add(new Pizza(1,  "DELLA NONNA",
        "tomat, ost, semi-dry tomat, rucola og parmesanost", 80));
  }

  public void printPizzaMenu() {
    for (int i = 0; i < pizzaMenu.size(); i++) {
      System.out.println(pizzaMenu.get(i));
    }
  }
  void visMenu() {
    UI ui = new UI();
    Alfonso alfonso = new Alfonso();
    Mario mario = new Mario();

    String[] menuChoice = {"1. Se Pizza Menu",
        "2. Opret ordre",
        "3. Se ordre",
        //"4. Slet ordre",
        "9. Afslut"};
    Menu menu = new Menu("MARIOS PIZZA:", "Vælg:", menuChoice);
    menu.printMenu();
    boolean isRunning;
    isRunning = true;
    while (isRunning) {
      int userChoice = menu.readChoice();

      switch (userChoice) {
        case 1:
          printPizzaMenu();
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
