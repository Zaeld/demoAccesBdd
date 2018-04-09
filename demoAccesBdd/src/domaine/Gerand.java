package domaine;

public class Gerand {
private int idEmploye;
private String nom;
private String prenom;
private String profession;
private int idAgenceBancaire;

public Gerand() {
	super();

}

public int getIdEmploye() {
	return idEmploye;
}

public void setIdEmploye(int idEmploye) {
	this.idEmploye = idEmploye;
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

public String getProfession() {
	return profession;
}

public void setProfession(String profession) {
	this.profession = profession;
}

public int getIdAgenceBancaire() {
	return idAgenceBancaire;
}

public void setIdAgenceBancaire(int idAgenceBancaire) {
	this.idAgenceBancaire = idAgenceBancaire;
}

}
