

public class Coelho {

    public String raca;
    public String corDaPelagem;
    public int idade;
    public float peso;
    public float comprimento;
    
    public Coelho(String raca, String corDaPelagem, int idade, float peso, float comprimento) {
    	this.raca = raca;
    	this.corDaPelagem = corDaPelagem;
    	this.idade = idade;
    	this.peso = peso;
    	this.comprimento = comprimento;	
    }

    public void pular() {
        System.out.println("Bunny hop! *sai pulando por ai*");
    }
    
    public void comer() {
    	System.out.println("Comendo cenoura...");
    	System.out.println("acabou a cenoura");
    }
    
    public void fazerToca() {
    	System.out.println("Começa a escavar...");
    	try {
    		for (int i = 0; i < 3; i++) {
    			Thread.sleep(1000);
    			System.out.println("ainda escavando...");
    		}
    		
    		Thread.sleep(500);
    		System.out.println("toca feita!");
    	} catch (InterruptedException e) {
    		System.out.println("o coelho foi embora, não sei o motivo...");
    		Thread.currentThread().interrupt();
    	}
    }
    
    public void infos() {
        System.out.println(
            "🐰 Coelho {\n"
            + "Raça: " + raca + "\n"
            + "Cor da Pelagem: " + corDaPelagem + "\n"
            + "Idade: " + idade + " anos\n"
            + "Peso: " + peso + "kg\n"
            + "Comprimento: " + comprimento + "cm\n"
            + "}"
        );
    }
    
    
}
