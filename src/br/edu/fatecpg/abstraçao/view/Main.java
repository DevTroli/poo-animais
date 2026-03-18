
public class Main {
public static void main(String[] args) {
        
        String[] palavrasLoroJose = {"Olá", "Ronaldo", "Palmeiras"};
        Papagaio meuPapagaio = new Papagaio("Verde e Amarelo", palavrasLoroJose, 3.5f, 10, true);

        Raposa minhaRaposa = new Raposa("Raposa-vermelha", "Laranja", "Floresta Temperada", 0.9f, 0.4f);

        Zebra minhaZebra = new Zebra("Listras grossas", 300.5f, 1.4f, 6, 65.5f);

        Coelho meuCoelho = new Coelho("Cabeça de Leão", "Branco com manchas pretas", 2, 2.5f, 30.0f);

        System.out.println("🦜 PAPAGAIO");
        meuPapagaio.infos();
        meuPapagaio.repetirPalavra("Biscoito");
        System.out.println();


        System.out.println("🦊 RAPOSA");
        minhaRaposa.infos();
        minhaRaposa.emitirSom();
        System.out.println();

        System.out.println("🦓 ZEBRA");
        minhaZebra.infos();
        minhaZebra.coice();
        System.out.println();

        System.out.println("🐰 COELHO");
        meuCoelho.infos();
        
        meuCoelho.fazerToca(); 
    }
}
