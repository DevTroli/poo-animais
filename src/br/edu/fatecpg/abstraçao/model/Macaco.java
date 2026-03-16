package br.edu.fatecpg.abstraçao.model;

public class Macaco {
  public String taxonomia;
  public String dieta;
  public String locomoçao;
  public boolean pelagem;
  public boolean rabo;

  public Macaco(String taxonomia, String dieta, String locomoçao, boolean pelagem, boolean rabo){
    this.taxonomia = taxonomia;
    this.dieta = dieta;
    this.locomoçao = locomoçao;
    this.pelagem = pelagem;
    this.rabo = rabo;
  }

  public void braquiar() {
   System.out.println("**Pulando de Cipo em Cipo**"); 
  }

  public void escalar() {
    System.out.println("**Subindo na arvore**");
  }

  public void acrobacia() {
    System.out.println("**Fazendo um Mortal duplo carpado**");
  }

  public void infos() {
    System.out.println("🐒: " + taxonomia + " "  + locomoçao + " com uma dieta de " + dieta);
  }
}
