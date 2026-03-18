package br.edu.fatecpg.abstracao.model;

public class Papagaio {
	public String corPena;
	public String[] palavraAprendida;
	public float tamanhoBico;
	public int idade;
	public boolean isDomesticado;
	
	public Papagaio(String corPena, String[] palavraAprendida, float tamanhoBico, int idade, boolean isDomesticado) {
		this.corPena = corPena;
		this.palavraAprendida = palavraAprendida;
		this.tamanhoBico = tamanhoBico;
		this.idade = idade;
		this.isDomesticado = isDomesticado;
	}
	
	public void voar() {
		System.out.println("*bate as asas*");
		System.out.println("*voa em círculos e pousa*");
	}
	
	public void repetirPalavra(String palavra) {
        System.out.println("o papagaio diz: prrrr! " + palavra + "!" + " " + palavra + "! *bate as asas*");
    }
	
	public void bicar() {
		System.out.println("prrr prrr... *começa a bicar o chão*");
	}
	
	public void infos() {
		String palavras = (palavraAprendida != null) ? String.join(", ", palavraAprendida) : "Nenhuma";

		System.out.println(
			"🦜 Papagaio {\n"
			+ "Cor da pena: " + corPena + "\n"
			+ "Palavras aprendidas: [" + palavras + "]\n"
			+ "Tamanho do bico: " + tamanhoBico + "\n"
			+ "Idade: " + idade + " anos\n"
			+ "Domesticado: " + isDomesticado + "\n"
			+ "}"
		);
	}
}
