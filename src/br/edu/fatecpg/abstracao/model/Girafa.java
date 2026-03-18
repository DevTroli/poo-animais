package br.edu.fatecpg.abstracao.model;

public class Girafa {
  public String taxonomia;
  public String dieta;
  public String locomoçao;
  public int tamanhoPescoço;
  public boolean temChifre;

  public Girafa(
      String taxonomia, String dieta, String locomoçao, int tamanhoPescoço, boolean temChifre) {
    this.taxonomia = taxonomia;
    this.dieta = dieta;
    this.locomoçao = locomoçao;
    this.tamanhoPescoço = tamanhoPescoço;
    this.temChifre = temChifre;
  }

  public void superCoraçao() {
    System.out.println("💓TUMTUM💓TUMTUM");
  }

  public void comerPlanta() {
    System.out.println("NHAC 🌿");
  }

  public void soneca() {
    System.out.println("💤💤💤💤💤💤💤");
  }

  public void infos() {
    System.out.println(
        "🦒: "
            + taxonomia
            + " "
            + locomoçao
            + " com um pescoço de "
            + tamanhoPescoço
            + " metros e uma dieta como "
            + dieta);
  }
}
