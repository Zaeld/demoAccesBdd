package Service;

import java.util.List;

import dAO.CompteCourantDAO;
import dAO.CompteEpargneDAO;
import domaine.Client;
import domaineCompte.CCourant;

public class CompteCourantService {
	CompteCourantDAO dao = new CompteCourantDAO();

	public CCourant creerCompte(Client client, CCourant compte) {
		return dao.creerCompte(client, compte);
	
	}

	public CCourant getCompte(CCourant compte) {
		return dao.getCompte(compte);
	}

	public CCourant updateCompte(CCourant compte) {
		return dao.updateCompte(compte);
	}

	public boolean deleteCompte(CCourant compte) {
		return dao.deleteCompte(compte);
	}

	public List<CCourant> getAllCompte(CCourant compte) {
		return dao.getAllCompte();
		}
}
