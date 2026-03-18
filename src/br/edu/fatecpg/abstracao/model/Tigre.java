package br.edu.fatecpg.abstracao.model;

public class Tigre {
    
    public String quadrupede;
    public String rapido;
    public String calda;
    public boolean listrado;
    public boolean garras;

    public Tigre(String quadrupede, String rapido, String calda, boolean listrado, boolean garras){
        this.quadrupede = quadrupede;
        this.rapido = rapido;
        this.calda = calda;
        this.listrado = listrado;
        this.garras = garras;
    }

    public void cacar() {
        System.out.println("**Caçando**");
    }

    public void nadar() {
        System.out.println("**Nadando**");
    }

    public void camuflar() {
        System.out.println("**Se camuflando na selva**");
    }
    
    public void infos() {
        System.out.println("🐅 Tigre: {\n"
            + quadrupede + "\n"
            + "É: " + rapido + "\n"
            + "Tem: " + calda + "\n"
            + "Listrado: " + listrado + "\n"
            + "Tem Garras: " + garras + "\n"
            + "}"
        );
    }
}
