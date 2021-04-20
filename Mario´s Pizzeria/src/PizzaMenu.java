import java.util.ArrayList;

public class PizzaMenu {
  protected ArrayList<Pizza> pizzaMenu = new ArrayList();

  public PizzaMenu() {
    pizzaMenu.add(new Pizza(1, "DELLA NONNA", "tomat, ost, semi-dry tomat, rucola og parmesanost", 80));
    pizzaMenu.add(new Pizza(2, "QUATTRO FORMAGGI", "tomat, fire forskellige oste", 92));
    pizzaMenu.add(new Pizza(3, "PIZZA DELALCASA", "tomat, ost, gorgonzola, champignon og pastrami", 85));
    pizzaMenu.add(new Pizza(4, "CHRISTOPHER", "tomat, ost, italiensk skinke og bacon", 79));
    pizzaMenu.add(new Pizza(5, "MARE E MONTI", "tomat, ost, champignon, rejer og løg", 79));
    pizzaMenu.add(new Pizza(6, "PARMA", "tomat, ost, gorgonzola og parmaskinke", 85));
    pizzaMenu.add(new Pizza(7, "YOUNES", "tomat, ost, champignon, bacon og løg", 78));
    pizzaMenu.add(new Pizza(8, "CACCIATORA", "tomat, ost, pepperoni, paprika og oliven", 85));
    pizzaMenu.add(new Pizza(9, "PIER", "tomat, ost, bacon, asparges og æg", 79));
    pizzaMenu.add(new Pizza(10, "RUSTICA", "tomat, ost, gorgonzola og mortadella", 85));
    pizzaMenu.add(new Pizza(11, "PAZZA", "tomat, ost, gorgonzola, bacon, champignon og rejer", 92));
    pizzaMenu.add(new Pizza(12, "MARGARITA", "tomat, ost og oregano", 65));
    pizzaMenu.add(new Pizza(13, "ANNA", "tomat, ost, italiensk skinke og champignon",79));
    pizzaMenu.add(new Pizza(14, "CAMPAGNOLA", "tomat, ost, champignon,", 69));
    pizzaMenu.add(new Pizza(15, "NAPOLETANA", "tomat, ost, ansjoser og oliven",79));
    pizzaMenu.add(new Pizza(16, "VEGETALE", "tomat, ost og blandede grøntsager", 82));
    pizzaMenu.add(new Pizza(17, "NOSTROMO", "tomat, ost, tun, oliven og hvidløg",75));
    pizzaMenu.add(new Pizza(18, "HAWAII", "tomat, ost, italiensk skinke og ananas",79));
    pizzaMenu.add(new Pizza(19, "QUATTRO STAGIONI", "tomat, ost, champignon, pepperoni, italiensk skinke og artiskok",85));
    pizzaMenu.add(new Pizza(20, "SORRETO", "tomat, ost, italiensk skinke",72));
    pizzaMenu.add(new Pizza(21, "CALZONE", "indbagt pizza med tomat, ost og italiensk skinke",75));
    pizzaMenu.add(new Pizza(22, "MARINARA", "tomat, ost, rejer og tun",80));
    pizzaMenu.add(new Pizza(23, "CIAO CIAO", "tomat, ost, emmentaler og parmeskinke",86));
    pizzaMenu.add(new Pizza(24, "ITALIA", "tomat, ost og pepperoni",79));
    pizzaMenu.add(new Pizza(25, "GORGONZOLA", "tomat, ost og gorgonzolaost",75));
    pizzaMenu.add(new Pizza(26, "SCALA", "tomat, ost, kødstrimler, champignon, løg og oliven",85));
    pizzaMenu.add(new Pizza(27, "OPERA", "tomat, ost, gorgonzola, parmaskinke og soltørrede tomater",85));
    pizzaMenu.add(new Pizza(28, "CANNES", "tomat, ost, pepperoni, italiensk skinke og gorgonzola",89));
    pizzaMenu.add(new Pizza(29, "MONTANARA", "tomat, ost, pepproni, bacon og champignon",88));
    pizzaMenu.add(new Pizza(30, "VESUVIO", "tomat, ost, italiensk skinke og pepperoni",82));
    pizzaMenu.add(new Pizza(31, "BIANCE", "pizza med ost, bacon, rosmarin og kartoffel",22));
  }

  public void printPizzaMenu() {
    for (int i = 0; i < pizzaMenu.size(); i++) {
      System.out.println(pizzaMenu.get(i));
    }
  }
}

