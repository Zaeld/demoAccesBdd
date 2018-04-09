package domaine;

public class Login {
private int idLogin;
private String login;
private int motDePasse;
private int idEmploye;
private String professionEmploye;

public Login(String identifiant, int motDePasse) {
	super();
	this.idLogin = 0;
	this.login = identifiant;
	this.motDePasse = motDePasse;
	this.idEmploye = 0;
}

public String getProfessionEmploye() {
	return professionEmploye;
}

public void setProfessionEmploye(String string) {
	this.professionEmploye = string;
}

public int getIdLogin() {
	return idLogin;
}

public void setIdLogin(int idLogin) {
	this.idLogin = idLogin;
}

public String getIdentifiant() {
	return login;
}

public void setIdentifiant(String identifiant) {
	this.login = identifiant;
}

public int getMotDePasse() {
	return motDePasse;
}

public void setMotDePasse(int motDePasse) {
	this.motDePasse = motDePasse;
}

public int getIdEmploye() {
	return idEmploye;
}

public void setIdEmploye(int idEmploye) {
	this.idEmploye = idEmploye;
}



}
