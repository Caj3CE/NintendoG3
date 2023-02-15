package model;

import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Jeu> lAchat;
	public Client(String nom, String prenom, List<Jeu> lAchat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.lAchat = lAchat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Jeu> getlAchat() {
		return lAchat;
	}

	public void setlAchat(List<Jeu> lAchat) {
		this.lAchat = lAchat;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", lAchat=" + lAchat + "]";
	}
	
	
}
