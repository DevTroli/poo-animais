package br.edu.fatecpg.abstraçao.model;

public class Coruja {

  public String asas;
  public String penas;
  public String bico;
  public boolean visaoNoturna;
  public boolean garrasAfiadas;

  public Coruja(String asas, String penas, String bico, boolean visaoNoturna, boolean garrasAfiadas) {
    this.asas = asas;
    this.penas = penas;
    this.bico = bico;
    this.visaoNoturna = visaoNoturna;
    this.garrasAfiadas = garrasAfiadas;
  }

  public void voo() {
    System.out.println("A coruja voa pela noite procurando o sentido da sua existência perante às trevas...");
  }

  public void caca() {
    System.out.println("A Coruja caça sua presa indefesa na calada da noite sem dar chance de reação");
  }

  public void piar() {
    System.out.println("HOOT... HOOT... sim igual o pokemon");
  }

  public void infos() {
    System.out.println(
        "🦉 Coruja {\n"
        + "Asas: " + asas + "\n"
        + "Penas: " + penas + "\n"
        + "Bico: " + bico + "\n"
        + "Visão Noturna: " + visaoNoturna + "\n"
        + "Garras Afiadas: " + garrasAfiadas + "\n"
        + "}"
    );
  }
}