package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Camelo;
import br.edu.fatecpg.abstracao.model.Coelho;
import br.edu.fatecpg.abstracao.model.Coruja;
import br.edu.fatecpg.abstracao.model.Elefante;
import br.edu.fatecpg.abstracao.model.Girafa;
import br.edu.fatecpg.abstracao.model.Jacare;
import br.edu.fatecpg.abstracao.model.Leao;
import br.edu.fatecpg.abstracao.model.Macaco;
import br.edu.fatecpg.abstracao.model.Papagaio;
import br.edu.fatecpg.abstracao.model.Pinguim;
import br.edu.fatecpg.abstracao.model.Raposa;
import br.edu.fatecpg.abstracao.model.Tigre;
import br.edu.fatecpg.abstracao.model.Urso;
import br.edu.fatecpg.abstracao.model.Zebra;

public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Quadrupede", "Juba", "Forte", "Dentes Grandes", true);
        leao.infos();
        leao.liderar();

        Tigre tigre = new Tigre("Quadrupede", "Rápido", "Calda", true, true);
        tigre.infos();
        tigre.camuflar();

        Elefante elefante = new Elefante("Quadrupede", "Grande", "Pesado", true, true);
        elefante.infos();
        elefante.pegarobjetos();

        Macaco chimpanze = new Macaco("Mamifero", "Onivoro", "Bipede", true, true);
        chimpanze.infos();
        chimpanze.braquiar();

        Girafa girafaMasal = new Girafa("Mamifero", "Herbivoro", "Quadrupede", 3, true);
        girafaMasal.infos();
        girafaMasal.superCoraçao();

        Jacare jacareAçu = new Jacare("Reptil", "Carnivoro", "Quadrupede", true, 80);
        jacareAçu.infos();
        jacareAçu.tomarSol();

        Camelo cameloBactriano = new Camelo("Mamifero", "Herbivoro", "Quadrupede", 2, true);
        cameloBactriano.infos();
        cameloBactriano.cuspir();

        Urso urso = new Urso("longo", "afiadas", "redondas", true, true);
        urso.infos();
        urso.cacar();

        Coruja coruja = new Coruja("grandes", "macias", "curvo", true, true);
        coruja.infos();
        coruja.caca();

        Pinguim pinguim = new Pinguim("curto", "nadadeira", true, "curta", "pequenas");
        pinguim.infos();
        pinguim.nadar();

        System.out.println("🦜 PAPAGAIO");
        String[] palavrasLoroJose = {"Olá", "Ronaldo", "Palmeiras"};
        Papagaio meuPapagaio = new Papagaio("Verde e Amarelo", palavrasLoroJose, 3.5f, 10, true);
        meuPapagaio.infos();
        meuPapagaio.repetirPalavra("Biscoito");

        System.out.println("🦊 RAPOSA");
        Raposa minhaRaposa = new Raposa("Raposa-vermelha", "Laranja", "Floresta Temperada", 0.9f, 0.4f);
        minhaRaposa.infos();
        minhaRaposa.emitirSom();

        System.out.println("🦓 ZEBRA");
        Zebra minhaZebra = new Zebra("Listras grossas", 300.5f, 1.4f, 6, 65.5f);
        minhaZebra.infos();
        minhaZebra.coice();

        System.out.println("🐰 COELHO");
        Coelho meuCoelho = new Coelho("Cabeça de Leão", "Branco com manchas pretas", 2, 2.5f, 30.0f);
        meuCoelho.infos();
        meuCoelho.fazerToca();
    }
}
