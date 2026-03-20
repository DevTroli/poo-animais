package br.edu.fatecpg.abstracao.model;

public class Leao {

  public String quadrupede;
  public String juba;
  public String forte;
  public String DentesGrandes;
  public boolean Garras;

  public Leao(String quadrupede, String juba, String forte, String DentesGrandes, boolean Garras) {
    this.quadrupede = quadrupede;
    this.juba = juba;
    this.forte = forte;
    this.DentesGrandes = DentesGrandes;
    this.Garras = Garras;
  }

  public void rugir() {
    System.out.println("**Rugindo**");
  }

  public void caçar() {
    System.out.println("**Leão pula em direçao ao alvo sem dar chance ao inimigo**");
  }

  public void liderar() {
    System.out.println("**SOU UM LEAO LIDERANDO O BANDO**");
  }

  public void infos() {
    System.out.println(
        "🦁Leão: {\n"
            + quadrupede
            + "\n"
            + "Tem: "
            + juba
            + "\n"
            + " É: "
            + forte
            + "\n"
            + " Tem: "
            + DentesGrandes
            + "\n"
            + " Tem: "
            + Garras
            + "\n"
            + "}");
  }
}
