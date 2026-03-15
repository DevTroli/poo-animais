package br.edu.fatecpg.abstraçao.model;

public class Jacare {
  public String taxonomia;
  public String dieta;
  public String locomoçao;
  public boolean temCauda;
  public int dentes;

  public Jacare(String taxonomia, String dieta, String locomoçao, boolean temCauda, int dentes){
    this.taxonomia = taxonomia;
    this.dieta = dieta;
    this.locomoçao = locomoçao;
    this.temCauda = temCauda;
    this.dentes = dentes;
  }

  public void caçar() {
    System.out.println("**Jacare em modo caça**");
  }

  public void tomarSol() {
    System.out.println("**Tomando uma vitamina D ☀️**");
  }

  public void nadar() {
    System.out.println("Chua Chua Chuaaa");
  }

  public void infos() {
    System.out.println(
        "🐊: "
            + taxonomia
            + " "
            + locomoçao
            + " com "
            + dentes
            + " dentes e uma dieta como "
            + dieta);
  }
}
