package br.edu.fatecpg.abstracao.model;

public class Golfinho {

    public String barbatana;
    public String sangueQuente;
    public String mamifero;
    public boolean inteligente;
    public boolean sociavel;

    public Golfinho(String barbatana, String sangueQuente, String mamifero, boolean inteligente, boolean sociavel) {
        this.barbatana = barbatana;
        this.sangueQuente = sangueQuente;
        this.mamifero = mamifero;
        this.inteligente = inteligente;
        this.sociavel = sociavel;
    }


  public void sociavel() {
    System.out.println("O Golfinho faz um grupo com outros golfinhos");
  }

  public void inteligencia() {
    System.out.println("Os Golfinhos encuralam sua presa");
  }

  public void cacar() {
    System.out.println("Os Golfinhos matam e comem sua presa");
  }

  public void infos() {
    System.out.println(
    	"Golfinho {\n"
    		 + "Inteligente: " + inteligente + "\n"
    		 + "Barbatana: " + barbatana + "\n"
    		 + "Sangue Quente: " + sangueQuente + "\n"
    		 + "Sociavel: " + sociavel + "\n"
    		 + "Mamifero: " + mamifero + "\n"
    		 + "}"
    );
  }
}
