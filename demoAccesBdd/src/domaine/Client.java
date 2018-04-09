package domaine;

import domaineCompte.CCourant;
import domaineCompte.CEpargne;

public class Client {
int idClient;
private String nom;
private String prenom;
private String adresse;
private String codePostal;
private String ville;
private String situationFinanciere;
private String situationProfessionnel;
private int telephone;
private int idEmploye;
private int soldeTotal;


public Client() {

}



public Client(int idClient, String nom, String prenom, int age, int idConseiller) {
	this.idClient = idClient;
	this.nom = nom;
	this.prenom = prenom;
	this.idEmploye = idConseiller;
}




public int getSoldeTotal() {
	return soldeTotal;
}



public void setSoldeTotal(int soldeTotal) {
	this.soldeTotal = soldeTotal;
}



public void setIdClient(int idClient) {
	this.idClient = idClient;
}



public String getAdresse() {
	return adresse;
}



public void setAdresse(String adresse) {
	this.adresse = adresse;
}



public String getCodePostal() {
	return codePostal;
}



public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}



public String getVille() {
	return ville;
}



public void setVille(String ville) {
	this.ville = ville;
}



public String getSituationFinanciere() {
	return situationFinanciere;
}



public void setSituationFinanciere(String situationFinanciere) {
	this.situationFinanciere = situationFinanciere;
}



public String getSituationProfessionnel() {
	return situationProfessionnel;
}



public void setSituationProfessionnel(String situationProfessionnel) {
	this.situationProfessionnel = situationProfessionnel;
}



public int getTelephone() {
	return telephone;
}



public void setTelephone(int telephone) {
	this.telephone = telephone;
}



public int getIdEmploye() {
	return idEmploye;
}



public void setIdEmploye(int idEmploye) {
	this.idEmploye = idEmploye;
}



public int getIdClient() {
	return idClient;
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





public String toString() {
	return  this.nom + " " + this.prenom + " est le client n°" + this.getIdClient() + " avec comme conseiller le conseiller n°" + this.idEmploye + " ";
}
}
