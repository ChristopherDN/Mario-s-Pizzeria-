public class Pizza {
  private int nummer;
  private String navn;
  private String fyld ;
  private int pris;

  public Pizza(int nummer, String navn, String fyld, int pris) {
    this.nummer = nummer;
    this.navn = navn;
    this.fyld = fyld;
    this.pris = pris;
  }

  public int getNummer() {
    return nummer;
  }

  public String getNavn() {
    return navn;
  }

  public String getFyld() {
    return fyld;
  }

  public int getPris() {
    return pris;
  }

  @Override
  public String toString() {
    return "Pizza: " + nummer + "  " + navn +"| "+ fyld  + " \t" + pris+ ".-" ;
  }
}