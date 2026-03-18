
public class Zebra {
	public String padraoListras;
	public float peso;
	public float altura;
	public int idade;
	public float velocidade;
	
	public Zebra(String padraoListras, float peso, float altura, int idade, float velocidade) {
		this.padraoListras = padraoListras;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.velocidade = velocidade;
	}
	
	public void correr() {
		System.out.println("*pocotó pocotó* A zebra dispara pela savana em zigue-zague!");
	}
	
	public void pastar() {
		System.out.println("A zebra abaixa a cabeça pacificamente e mastiga um matinho... uma delícia.");
	}
	
	public void coice() {
		System.out.println("POW! A zebra dá um coice poderoso! É super efetivo! -73hp");
	}
	
	public void infos() {
		System.out.println(
			"🦓 Zebra {\n"
			+ "Padrão das Listras: " + padraoListras + "\n"
			+ "Peso: " + peso + "kg\n"
			+ "Altura: " + altura + "m\n"
			+ "Idade: " + idade + " anos\n"
			+ "Velocidade: " + velocidade + "km/h\n"
			+ "}"
		);
	}
}