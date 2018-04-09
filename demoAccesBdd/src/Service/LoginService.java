package Service;

import dAO.EmployeDAO;
import dAO.LoginDAO;
import domaine.Conseiller;
import domaine.Gerand;
import domaine.Login;

public class LoginService {
	LoginDAO loginDAO = new LoginDAO();
	EmployeDAO employeDAO = new EmployeDAO();


public void Connexion (Login login) {
	loginDAO.VerificationLogin(login);
	if(login.getProfessionEmploye().equals("gerand"))
this.getGerand(login);	
if(login.getProfessionEmploye().equals("conseiller"))
	this.getConseiller(login);	
}

	public Gerand getGerand(Login login) {
	return employeDAO.getGerand(login);
	
}
	public Conseiller getConseiller(Login login) {
		return employeDAO.getConseiller(login);
		
	}
}
