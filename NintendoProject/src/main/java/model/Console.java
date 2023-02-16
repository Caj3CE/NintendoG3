package model;

public abstract class Console {

	private String nom;
	private int prix;
	private String dateDeSortie;


	public Console(String nom, int prix, String dateDeSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateDeSortie = dateDeSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(String dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateDeSortie=" + dateDeSortie + "]";
	}
	
	
}
