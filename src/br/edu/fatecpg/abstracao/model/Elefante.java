package br.edu.fatecpg.abstracao.model;

public class Elefante {

  public String quadrupede;
  public String grande;
  public String pesado;
  public boolean forte;
  public Boolean tromba;

  public Elefante(String quadrupede, String grande, String pesado, boolean forte, Boolean tromba) {
    this.quadrupede = quadrupede;
    this.grande = grande;
    this.pesado = pesado;
    this.forte = forte;
    this.tromba = tromba;
  }

  public void pegarobjetos() {
    System.out.println("**Usando a tromba para pegar objetos**");
  }

  public void comer() {
    System.out.println("**Comendo folhas e frutas com a tromba**");
  }

  public void tomarbanho() {
    System.out.println("**Usando a tromba para tomar banho**");
  }

  public void infos() {
    System.out.println(
        "🐘 Elefante: {\n"
            + quadrupede
            + "\n"
            + "É: "
            + grande
            + "\n"
            + "É: "
            + pesado
            + "\n"
            + "Forte: "
            + forte
            + "\n"
            + "Tem Tromba: "
            + tromba
            + "\n"
            + "}");
  }
}
