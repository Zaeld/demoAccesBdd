package Service;

import java.util.List;

import dAO.CompteEpargneDAO;
import domaine.Client;
import domaineCompte.CEpargne;

public class CompteEpargneService {
	CompteEpargneDAO dao = new CompteEpargneDAO();

	public CEpargne creerCompte(Client client, CEpargne compte) {
		return dao.creerCompte(client, compte);
	
	}

	public CEpargne getCompte(CEpargne compte) {
		return dao.getCompte(compte);
	}

	public CEpargne updateCompte(CEpargne compte) {
		return dao.updateCompte(compte);
	}

	public boolean deleteCompte(CEpargne compte) {
		return dao.deleteCompte(compte);
	}

	public List<CEpargne> getAllCompte(CEpargne compte) {
		return dao.getAllCompte();
		}
}
