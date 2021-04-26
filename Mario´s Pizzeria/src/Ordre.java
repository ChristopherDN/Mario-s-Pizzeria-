
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//---Lavet af Christopher------
public class Ordre {
  //----Attributter----
  private ArrayList<Pizza> pizzaer;
  private String tid;

  //----Konstruktør----
  public Ordre(ArrayList<Pizza> pizzaer) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy | HH:mm");
    LocalDateTime idag =LocalDateTime.now();
    this.pizzaer = pizzaer;
    this.tid = formatter.format(idag);
  }
  //----Gettere----
  public ArrayList<Pizza> getPizzaer() {
    return pizzaer;
  }
  public String getTid() {
    return tid;
  }
}
