package br.edu.fatecpg.abstracao.model;

public class Tubarao {
  public boolean guelras;
  public String barbatana;
  public String sangueFrio;
  public String oviparo;
  public boolean carnivoro;

  public Tubarao(String barbatana, String sangueFrio, String oviparo, boolean carnivoro, boolean guelras) {
      this.barbatana = barbatana;
      this.sangueFrio = sangueFrio;
      this.oviparo = oviparo;
      this.carnivoro = carnivoro;
      this.guelras = guelras;
  }

  public void nadar() {
    System.out.println("*O Tubarao nada em busca de presas e outros tubaroes*");
  }

  public void socializar() {
    System.out.println("O Tubarao acha outros tubaroes e formam um grupo para caçar");
  }

  public void cacar() {
    System.out.println("Os Tubaroes acham e caçam sua presa ferozmente");
  }

  public void infos() {
    System.out.println(
    	"Tubarao {\n"
    		 + "Guelras: " + guelras + "\n"
    		 + "Barbatana: " + barbatana + "\n"
    		 + "Sangue Frio: " + sangueFrio + "\n"
    		 + "Carnivoro: " + carnivoro + "\n"
    		 + "Oviparo: " + oviparo + "\n"
    		 + "}"
    );
  }
}
