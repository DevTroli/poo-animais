package br.edu.fatecpg.abstracao.model;

public class Cachorro {
    public String raca;
    public String porte;
    public String corPelo;
    public boolean amigavel;
    public boolean adestrado;

    public Cachorro(String raca, String porte, String corPelo, boolean amigavel, boolean adestrado) {
        this.raca = raca;
        this.porte = porte;
        this.corPelo = corPelo;
        this.amigavel = amigavel;
        this.adestrado = adestrado;
    }

    public void latir() {
        System.out.println("🐶 AU AU AU!");
    }

    public void farejar() {
        System.out.println("👃 Farejando rastros...");
    }

    public void abanarRabo() {
        System.out.println("🐕 Balançando o rabo de felicidade!");
    }

    public void infos() {
        System.out.println("🐕 Cachorro: ["
            + "Raça: " + raca + " | " 
            + "Porte: " + porte + " | " 
            + "Cor: " + corPelo + " | " 
            + "Amigável: " + amigavel + " | " 
            + "Adestrado: " + adestrado
            + "]"
        );
    }
}