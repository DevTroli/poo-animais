package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Aguia;
import br.edu.fatecpg.abstracao.model.Cachorro;
import br.edu.fatecpg.abstracao.model.Camelo;
import br.edu.fatecpg.abstracao.model.Cavalo;
import br.edu.fatecpg.abstracao.model.Coelho;
import br.edu.fatecpg.abstracao.model.Coruja;
import br.edu.fatecpg.abstracao.model.Elefante;
import br.edu.fatecpg.abstracao.model.Gato;
import br.edu.fatecpg.abstracao.model.Girafa;
import br.edu.fatecpg.abstracao.model.Golfinho;
import br.edu.fatecpg.abstracao.model.Jacare;
import br.edu.fatecpg.abstracao.model.Leao;
import br.edu.fatecpg.abstracao.model.Macaco;
import br.edu.fatecpg.abstracao.model.Papagaio;
import br.edu.fatecpg.abstracao.model.Pinguim;
import br.edu.fatecpg.abstracao.model.Raposa;
import br.edu.fatecpg.abstracao.model.Tigre;
import br.edu.fatecpg.abstracao.model.Tubarao;
import br.edu.fatecpg.abstracao.model.Urso;
import br.edu.fatecpg.abstracao.model.Zebra;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("╔══════════════════════════════╗");
    System.out.println("║       🌍 ANIMAL PLANET       ║");
    System.out.println("╚══════════════════════════════╝");
    System.out.println("Escolha um animal para saber mais sobre ele:\n");

    System.out.println("  1.  🦁 Leao");
    System.out.println("  2.  🐯 Tigre");
    System.out.println("  3.  🐘 Elefante");
    System.out.println("  4.  🦅 Aguia");
    System.out.println("  5.  🦈 Tubarao");
    System.out.println("  6.  🐬 Golfinho");
    System.out.println("  7.  🐒 Macaco");
    System.out.println("  8.  🦒 Girafa");
    System.out.println("  9.  🐊 Jacare");
    System.out.println("  10. 🐪 Camelo");
    System.out.println("  11. 🐻 Urso");
    System.out.println("  12. 🦉 Coruja");
    System.out.println("  13. 🐧 Pinguim");
    System.out.println("  14. 🦜 Papagaio");
    System.out.println("  15. 🦊 Raposa");
    System.out.println("  16. 🦓 Zebra");
    System.out.println("  17. 🐰 Coelho");
    System.out.println("  18. 🐶 Cachorro");
    System.out.println("  19. 🐱 Gato");
    System.out.println("  20. 🐎 Cavalo");

    System.out.print("\nDigite o número do animal: ");
    int opcao = sc.nextInt();

    System.out.println("\n══════════════════════════════");

    switch (opcao) {
      case 1:
        System.out.println("🦁 LEAO");
        Leao leao = new Leao("Quadrupede", "Juba", "Forte", "Dentes Grandes", true);
        leao.infos();
        leao.liderar();
        break;

      case 2:
        System.out.println("🐯 TIGRE");
        Tigre tigre = new Tigre("Quadrupede", "Rápido", "Calda", true, true);
        tigre.infos();
        tigre.camuflar();
        break;

      case 3:
        System.out.println("🐘 ELEFANTE");
        Elefante elefante = new Elefante("Quadrupede", "Grande", "Pesado", true, true);
        elefante.infos();
        elefante.pegarobjetos();
        break;

      case 4:
        System.out.println("🦅 AGUIA");
        Aguia aguia = new Aguia("Penas", "Bico", "Asas", "Oviparo", true);
        aguia.infos();
        aguia.cacar();
        break;

      case 5:
        System.out.println("🦈 TUBARAO");
        Tubarao tubarao = new Tubarao("Barbatana", "Sangue Frio", "Oviparo", true, true);
        tubarao.infos();
        tubarao.cacar();
        break;

      case 6:
        System.out.println("🐬 GOLFINHO");
        Golfinho golfinho = new Golfinho("Barbatana", "Sangue Quente", "Mamifero", true, true);
        golfinho.infos();
        golfinho.inteligencia();
        break;

      case 7:
        System.out.println("🐒 MACACO");
        Macaco chimpanze = new Macaco("Mamifero", "Onivoro", "Bipede", true, true);
        chimpanze.infos();
        chimpanze.braquiar();
        break;

      case 8:
        System.out.println("🦒 GIRAFA");
        Girafa girafaMasal = new Girafa("Mamifero", "Herbivoro", "Quadrupede", 3, true);
        girafaMasal.infos();
        girafaMasal.superCoraçao();
        break;

      case 9:
        System.out.println("🐊 JACARE");
        Jacare jacareAçu = new Jacare("Reptil", "Carnivoro", "Quadrupede", true, 80);
        jacareAçu.infos();
        jacareAçu.tomarSol();
        break;

      case 10:
        System.out.println("🐪 CAMELO");
        Camelo cameloBactriano = new Camelo("Mamifero", "Herbivoro", "Quadrupede", 2, true);
        cameloBactriano.infos();
        cameloBactriano.cuspir();
        break;

      case 11:
        System.out.println("🐻 URSO");
        Urso urso = new Urso("longo", "afiadas", "redondas", true, true);
        urso.infos();
        urso.cacar();
        break;

      case 12:
        System.out.println("🦉 CORUJA");
        Coruja coruja = new Coruja("grandes", "macias", "curvo", true, true);
        coruja.infos();
        coruja.caca();
        break;

      case 13:
        System.out.println("🐧 PINGUIM");
        Pinguim pinguim = new Pinguim("curto", "nadadeira", true, "curta", "pequenas");
        pinguim.infos();
        pinguim.nadar();
        break;

      case 14:
        System.out.println("🦜 PAPAGAIO");
        String[] palavrasLoroJose = {"Olá", "Ronaldo", "Palmeiras"};
        Papagaio meuPapagaio = new Papagaio("Verde e Amarelo", palavrasLoroJose, 3.5f, 10, true);
        meuPapagaio.infos();
        meuPapagaio.repetirPalavra("Biscoito");
        break;

      case 15:
        System.out.println("🦊 RAPOSA");
        Raposa minhaRaposa =
            new Raposa("Raposa-vermelha", "Laranja", "Floresta Temperada", 0.9f, 0.4f);
        minhaRaposa.infos();
        minhaRaposa.emitirSom();
        break;

      case 16:
        System.out.println("🦓 ZEBRA");
        Zebra minhaZebra = new Zebra("Listras grossas", 300.5f, 1.4f, 6, 65.5f);
        minhaZebra.infos();
        minhaZebra.coice();
        break;

      case 17:
        System.out.println("🐰 COELHO");
        Coelho meuCoelho =
            new Coelho("Cabeça de Leão", "Branco com manchas pretas", 2, 2.5f, 30.0f);
        meuCoelho.infos();
        meuCoelho.fazerToca();
        break;

      case 18:
        System.out.println("🐶 CACHORRO");
        Cachorro meuDog = new Cachorro("Golden Retriever", "Grande", "Dourado", true, true);
        meuDog.infos();
        meuDog.latir();
        meuDog.farejar();
        break;

      case 19:
        System.out.println("🐱 GATO");
        Gato meuGato = new Gato("Frajola", "Arrisco", "Verde", true, 7);
        meuGato.infos();
        meuGato.miar();
        meuGato.ronronar();
        break;

      case 20:
        System.out.println("🐎 CAVALO");
        Cavalo meuCavalo = new Cavalo("Longa", 60.5, "Marrom", true, 5);
        meuCavalo.infos();
        meuCavalo.galopar();
        meuCavalo.relinchar();
        break;

      default:
        System.out.println("❌ Opção Inválida! Digite um número entre 1 e 20.");
        break;
    }

    System.out.println("══════════════════════════════");
    sc.close();
  }
}
