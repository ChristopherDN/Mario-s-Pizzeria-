import java.util.ArrayList;

public class PizzaMenu {
  public ArrayList<Pizza> pizzaMenu = new ArrayList();

  public PizzaMenu() {
    pizzaMenu.add(new Pizza(1,"DELLA NONNA","tomat, ost, semi-dry tomat, rucola og parmesanost",80));
    pizzaMenu.add(new Pizza(2, "QUATTRO FORMAGGI","tomat, fire forskellige oste",92 ));
    pizzaMenu.add(new Pizza(3,"PIZZA DELALCASA","tomat, ost, gorgonzola, champignon og pastrami",85));
    pizzaMenu.add(new Pizza(4,"PAESANA","tomat, ost, italiensk skinke og bacon",79));
    pizzaMenu.add(new Pizza(5,"MARE E MONTI","tomat, ost, champignon, rejer og løg",79));
    pizzaMenu.add(new Pizza(6,"","",85));
    pizzaMenu.add(new Pizza(7,"","",78));
    pizzaMenu.add(new Pizza(8,"","",85));
    pizzaMenu.add(new Pizza(9,"","",79));
    pizzaMenu.add(new Pizza(10,"","",85));
    pizzaMenu.add(new Pizza(11,"","",92));
    pizzaMenu.add(new Pizza(12,"","",65));
    pizzaMenu.add(new Pizza(13,"","",79));
    pizzaMenu.add(new Pizza(14,"","",69));
    pizzaMenu.add(new Pizza(15,"","",79));
    pizzaMenu.add(new Pizza(16,"","",82));
    pizzaMenu.add(new Pizza(17,"","",75));
    pizzaMenu.add(new Pizza(18,"","",79));
    pizzaMenu.add(new Pizza(19,"","",79));
    pizzaMenu.add(new Pizza(20,"","",85));


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
