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
<<<<<<< HEAD

=======
  void visMenu() {
    UI ui = new UI();
    Alfonso alfonso = new Alfonso();
    Mario mario = new Mario();
>>>>>>> 5d0225d31d62123e813befae7aac6356ad71465b

}
