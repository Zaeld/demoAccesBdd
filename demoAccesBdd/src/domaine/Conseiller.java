package domaine;

public class Conseiller {
	private int idEmploye;
	private String nom;
	private String prenom;
	private String profession;
	private int idAgenceBancaire;
	private int nbClient;
	private int idGerand;

	public Conseiller() {
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

	public int getNbClient() {
		return nbClient;
	}

	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}

	public int getIdGerand() {
		return idGerand;
	}

	public void setIdGerand(int idGerand) {
		this.idGerand = idGerand;
	}
	
}
