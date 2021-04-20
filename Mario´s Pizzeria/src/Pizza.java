public class Pizza {
  int nummer = 0;
  String navn = "vesuvio";
  String ingredienser = "tomat";
  int pris = 60;

  public Pizza(int nummer, String navn, String ingredienser, int pris) {
    this.nummer = nummer;
    this.navn = navn;
    this.ingredienser = ingredienser;
    this.pris = pris;
  }

  public int getNummer() {
    return nummer;
  }

  public String getNavn() {
    return navn;
  }

  public String getIngredienser() {
    return ingredienser;
  }

  public int getPris() {
    return pris;
  }

  @Override
  public String toString() {
    return "Pizza: " + nummer + " " + navn  + "  " + pris+ " .-"+ "\n" + ingredienser +"\n";
  }
}