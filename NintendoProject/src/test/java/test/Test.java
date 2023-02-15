package test;

import model.*;

public class Test {

	public static void main(String[] args) {

		Console c1 = new Console("Nintendo DS", 50, "2005-10-15");
		Adresse a1 = new Adresse(22, "rue du jeu", "Paris");
		
		Jeu jeu1 = new Jeu("New Super Mario Bros", c1);
		Jeu jeu2 = new Jeu("The Legend Of Zelda", c1);
		Jeu jeu3 = new Jeu("Animal Crossing : Wild World", c1);
		Jeu jeu4 = new Jeu("Pokemon Rubis", c1);
		Jeu jeu5 = new Jeu("Sims City", c1);

		Boutique b1 = new Boutique ("GameStore", a1 );

		
	}

}
