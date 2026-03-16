package br.edu.fatecpg.abstraçao.model;

public class Urso {

  public String focinho;
  public String garrasAfiadas;
  public String orelhasRedondas;
  public boolean temDentes;
  public boolean temPelagem;

  public Urso(String focinho, String garrasAfiadas, String orelhasRedondas, boolean temDentes, boolean temPelagem) {
    this.focinho = focinho;
    this.garrasAfiadas = garrasAfiadas;
    this.orelhasRedondas = orelhasRedondas;
    this.temDentes = temDentes;
    this.temPelagem = temPelagem;
  }

  public void hibernar() {
    System.out.println("Hoompiuu... hoompiuuu... zzz...");
  }

  public void coletar() {
    System.out.println("mexe mexe e coleta coisas do chao");
  }

  public void cacar() {
    System.out.println("UAAA NADA PEIXE VOU TE PEGAR");
  }

  public void infos() {
    System.out.println(
        "🐻 Urso {\n"
        + "Focinho: " + focinho + "\n"
        + "Garras: " + garrasAfiadas + "\n"
        + "Orelhas: " + orelhasRedondas + "\n"
        + "Tem dentes: " + temDentes + "\n"
        + "Tem pelagem: " + temPelagem + "\n"
        + "}"
    );
  }
}