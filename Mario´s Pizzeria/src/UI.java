public class Ui {

    void printPizzaMenu() {
    Menu menu = new Menu();
    for (int i = 0; i < menu.pizzaMenu.size(); i++) {
        System.out.println(menu.pizzaMenu.get(i).toString);
    }
  }
}
