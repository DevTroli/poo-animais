package br.edu.fatecpg.abstraçao.view;

import br.edu.fatecpg.abstraçao.model.Macaco;
import br.edu.fatecpg.abstraçao.model.Girafa;
import br.edu.fatecpg.abstraçao.model.Jacare;
import br.edu.fatecpg.abstraçao.model.Camelo;

public class Main {
  public static void main(String[] args) {

    Macaco chimpanze = new Macaco("Mamifero", "Onivoro", "Bipede", true, true);
    chimpanze.infos();
    chimpanze.braquiar();

    Girafa girafaMasal =  new Girafa("Mamifero", "Herbivoro", "Quadrupede", 3, true);
    girafaMasal.infos();
    girafaMasal.superCoraçao();

    Jacare jacareAçu = new Jacare("Reptil", "Carnivoro", "Quadrupede", true, 80);
    jacareAçu.infos();
    jacareAçu.tomarSol();

    Camelo cameloBactriano = new Camelo("Mamifero", "Herbivoro", "Quadrupede", 2, true);
    cameloBactriano.infos();
    cameloBactriano.cuspir();

  }
}
