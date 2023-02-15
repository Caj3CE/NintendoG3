package model;

public class Boutique {
	private String nom;
	private String numero;
	private String voie;
	private String ville;
	private String cp;
	private String pays;
	public Boutique(String nom, String numero, String voie, String ville, String cp, String pays) {
		this.nom = nom;
		this.numero = numero;
		this.voie = voie;
		this.ville = ville;
		this.cp = cp;
		this.pays = pays;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", numero=" + numero + ", voie=" + voie + ", ville=" + ville + ", cp=" + cp
				+ ", pays=" + pays + "]";
	}
	
	
	

}
