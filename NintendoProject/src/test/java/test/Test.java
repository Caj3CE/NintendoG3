package test;

import java.util.ArrayList;
import java.util.List;

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
		//Ajout de 2 clients
		//Faire une liste d'achat Client 1
		List<Jeu> lAchatCl1 = new ArrayList();
		lAchatCl1.add(jeu1);
		lAchatCl1.add(jeu3);
		lAchatCl1.add(jeu4);
		List<Jeu> lAchatCl2 = new ArrayList();
		//Faire une liste d'achat Client 2
		lAchatCl2.add(jeu2);
		lAchatCl2.add(jeu5);
		
		Client cl1 = new Client("Al","Colik",lAchatCl1);
		Client cl2 = new Client("Laure","Dure",lAchatCl2);

		
	}

}
