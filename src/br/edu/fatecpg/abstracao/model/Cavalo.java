package br.edu.fatecpg.abstracao.model;

public class Cavalo {
    public String tipoCrina;
    public double velocidadeMax;
    public String pelagem;
    public boolean ferradura;
    public int idade;

    public Cavalo(String tipoCrina, double velocidadeMax, String pelagem, boolean ferradura, int idade) {
        this.tipoCrina = tipoCrina;
        this.velocidadeMax = velocidadeMax;
        this.pelagem = pelagem;
        this.ferradura = ferradura;
        this.idade = idade;
    }

    public void galopar() {
        System.out.println("🐎 Pocotó! Pocotó! Pocotó!");
    }

    public void relinchar() {
        System.out.println("🐴 IIIHIIIHHIIII!");
    }

    public void pastar() {
        System.out.println("🌿 Nhac... nhac... comendo grama.");
    }

    public void infos() {
        System.out.println("🐎 Cavalo: ["
            + "Crina: " + tipoCrina + " | " 
            + "Velocidade: " + velocidadeMax + " km/h" + " | " 
            + "Pelagem: " + pelagem + " | " 
            + "Tem Ferradura: " + ferradura + " | " 
            + "Idade: " + idade + " anos"
            + "]"
        );
    }
}