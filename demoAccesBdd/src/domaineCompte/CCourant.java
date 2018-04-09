package domaineCompte;

import domaine.Client;

//import java.text.SimpleDateFormat;
//import java.util.Date;



public class CCourant extends Compte {
	
	// propriétés
	private double decouvert;
	private String TypeCarte;
	
	// construtors
	public CCourant() {
		super();
	}

	public CCourant(String formater, Client client) {
		super(formater, client);
		this.decouvert = 1000;
//		super.setNumeroCompte(001);
	}
	
	// getters et setters


	public double getDecouvert() {
		return decouvert;
	}

	public String getTypeCarte() {
		return TypeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		TypeCarte = typeCarte;
	}

	public void setDecouvert(double d) {
		this.decouvert = d;
	}
	
	// toString
	public String toString() {
		return super.toString(this.getNumeroCompte()) + ", a un découvert autorisé de " + this.decouvert + " et est associé à une carte " +this.getTypeCarte();
	}
}
