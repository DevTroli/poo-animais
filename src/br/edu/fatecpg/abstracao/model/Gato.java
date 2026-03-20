package br.edu.fatecpg.abstracao.model;

public class Gato {
  public String nome;
  public String temperamento;
  public String corOlhos;
  public boolean caçador;
  public int vidas;

  public Gato(String nome, String temperamento, String corOlhos, boolean caçador, int vidas) {
    this.nome = nome;
    this.temperamento = temperamento;
    this.corOlhos = corOlhos;
    this.caçador = caçador;
    this.vidas = vidas;
  }

  public void miar() {
    System.out.println("🐱 MIAU!");
  }

  public void ronronar() {
    System.out.println("🐾 Prrr prrr prrr...");
  }

  public void saltar() {
    System.out.println("🐈 Pulo ágil!");
  }

  public void infos() {
    System.out.println(
        "🐈 Gato: ["
            + nome
            + " | "
            + temperamento
            + " | Olhos: "
            + corOlhos
            + " | Caçador: "
            + caçador
            + " | Vidas: "
            + vidas
            + "]");
  }
}
