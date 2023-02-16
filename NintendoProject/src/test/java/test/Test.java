package test;

import model.*;

public class Test {

	public static void main(String[] args) {

		Portable c1 = new Portable("Nintendo DS");
		Adresse a1 = new Adresse(1,"rue du Jeu", "Lyon");
		Boutique b1 = new Boutique("Micromania", a1);
		
		Jeu jeu1 = new Jeu("New Super Mario Bros", c1,b1);
		Jeu jeu2 = new Jeu("The Legend Of Zelda", c1,b1);
		Jeu jeu3 = new Jeu("Animal Crossing : Wild World", c1,b1);
		Jeu jeu4 = new Jeu("Pokemon Rubis", c1,b1);
		Jeu jeu5 = new Jeu("Sims City", c1,b1);
		
		System.out.println(jeu1);

		
	}

}
