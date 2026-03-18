
public class Raposa {
	public String especie;
	public String cor;
	public String habitat;
	public float comprimento;
	public float tamanhoCauda;
	
	public Raposa(String especie, String cor, String habitat, float comprimento, float tamanhoCauda) {
		this.especie = especie;
		this.cor = cor;
		this.habitat = habitat;
		this.comprimento = comprimento;
		this.tamanhoCauda = tamanhoCauda;
	}
	
	public void cacar() {
		System.out.println("A raposa se esgueira pelos arbustos e dá o bote na sua presa!");
	}
	
	public void esconder() {
		System.out.println("*pula no buraco* A raposa está perfeitamente camuflada e escondida na sua toca.");
	}
	
	public void emitirSom() {
		System.out.println("Ring-ding-ding-ding-dingeringeding! (What does the fox say?)");
	}
	
	public void infos() {
		System.out.println(
			"🦊 Raposa {\n"
			+ "Espécie: " + especie + "\n"
			+ "Cor: " + cor + "\n"
			+ "Habitat: " + habitat + "\n"
			+ "Comprimento: " + comprimento + "m\n"
			+ "Tamanho da Cauda: " + tamanhoCauda + "m\n"
			+ "}"
		);
	}
}