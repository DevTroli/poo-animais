package br.edu.fatecpg.abstracao.model;

public class Pinguim {

  public String bico;
  public String asaNadadeira;
  public boolean impermeavel;
  public String caudaCurta;
  public String patasPequenas;

  public Pinguim(
      String bico,
      String asaNadadeira,
      boolean impermeavel,
      String caudaCurta,
      String patasPequenas) {
    this.bico = bico;
    this.asaNadadeira = asaNadadeira;
    this.impermeavel = impermeavel;
    this.caudaCurta = caudaCurta;
    this.patasPequenas = patasPequenas;
  }

  public void nadar() {
    System.out.println("O pinguim sozinho pula na água e nada em direção ao eterno azul do oceano");
  }

  public void socializar() {
    System.out.println(
        "O pinguim se questiona, será que um dia terei outros amigos ou serei para sempre solo no"
            + " universo? Enquanto caminha em direção a sua montanha infinita de amigos pinguins"
            + " dançantes");
  }

  public void comer() {
    System.out.println("COME COME o pinguim gosta de comer peixes!");
  }

  public void infos() {
    System.out.println(
        "🐧 Pinguim {\n"
            + "Bico: "
            + bico
            + "\n"
            + "Asa/Nadadeira: "
            + asaNadadeira
            + "\n"
            + "Impermeável: "
            + impermeavel
            + "\n"
            + "Cauda Curta: "
            + caudaCurta
            + "\n"
            + "Patas Pequenas: "
            + patasPequenas
            + "\n"
            + "}");
  }
}
