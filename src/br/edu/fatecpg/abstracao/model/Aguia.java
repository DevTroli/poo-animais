package br.edu.fatecpg.abstracao.model;

public class Aguia {

  public String penas;
  public String bico;
  public boolean carnivoro;
  public String oviparo;
  public String asas;

  public Aguia(String penas, String bico, String asas, String oviparo, boolean carnivoro) {
    this.penas = penas;
    this.bico = bico;
    this.asas = asas;
    this.oviparo = oviparo;
    this.carnivoro = carnivoro;
  }

  public void voar() {
    System.out.println("*Levanta voo*");
    System.out.println("*Pousa perto de sua presa*");
  }

  public void cacar() {
    System.out.println("A aguia vigia e captura sua presa");
  }

  public void comer() {
    System.out.println("A aguia come sua presa recem capturada");
  }

  public void infos() {
    System.out.println(
        "Aguia {\n"
            + "Asas: "
            + asas
            + "\n"
            + "Penas: "
            + penas
            + "\n"
            + "Bico: "
            + bico
            + "\n"
            + "Carnivoro: "
            + carnivoro
            + "\n"
            + "Oviparo: "
            + oviparo
            + "\n"
            + "}");
  }
}
