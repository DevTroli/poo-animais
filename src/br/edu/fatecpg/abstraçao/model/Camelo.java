package br.edu.fatecpg.abstraçao.model;

public class Camelo {
  public String taxonomia;
  public String dieta;
  public String locomoçao;
  public int numeroCorcovas;
  public boolean temPelagem;

  public Camelo(
      String taxonomia, String dieta, String locomoçao, int numeroCorcovas, boolean temPelagem) {
    this.taxonomia = taxonomia;
    this.dieta = dieta;
    this.locomoçao = locomoçao;
    this.numeroCorcovas = numeroCorcovas;
    this.temPelagem = temPelagem;
  }

  public void caminhar() {
    System.out.println("**Caminha...Caminha...Caminha...🐾**");
  }

  public void beberAgua() {
    System.out.println("Glup, Glup, Glup 💧");
  }

  public void cuspir() {
    System.out.println("Pfft! 💦");
  }

  public void infos() {
    System.out.println(
        "🐫:"
            + taxonomia
            + " "
            + locomoçao
            + " com "
            + numeroCorcovas
            + " Corcovas e uma dieta como "
            + dieta);
  }
}
