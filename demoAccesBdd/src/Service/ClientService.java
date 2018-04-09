package Service;

import java.util.List;



import dAO.ClientDAO;
import domaine.Client;
import domaineCompte.CCourant;
import domaineCompte.CEpargne;

public class ClientService {
	ClientDAO dao = new ClientDAO();

	public Client creerClient(Client client) {
		return dao.creerClient(client);
	
	}

	public Client getClient(Client client) {
		return dao.getClient(client);
	}

	public Client updateClient(Client client) {
		return dao.updateClient(client);
	}

	public boolean deleteClient(Client client) {
		return dao.deleteClient(client);
	}

	public List<Client> getAll() {
		return dao.getAll();
		}
	
	public Client VerifClientFortune(Client client) {
		String isEntreprise = client.getSituationProfessionnel();
		double totalSolde = 0;
		CCourant compteCourant = new CCourant();
		CEpargne compteEpargne = new CEpargne();
		compteCourant=dao.getCompteCourant(client, compteCourant);
		compteEpargne=dao.getCompteEpargne(client, compteEpargne);

if(compteCourant != null) {totalSolde += compteCourant.getSolde();}
		if(compteEpargne != null) {totalSolde += compteEpargne.getSolde();}
		
		if(isEntreprise.equals("particulier")) {
			if(totalSolde > IGestionClientFortunes.valeurIsRich) {
				client.setSituationFinanciere("riche");
			}else {
				client.setSituationFinanciere("normal");
			}
		
	}
		return client;
	}
}

// domaine.Client client = new Client();
//
// Scanner c = new Scanner(System.in);
// Scanner i = new Scanner(System.in);
//
// System.out.println("Veuillez rentrer le nom du client :");
// client.setNom(c.nextLine());
// System.out.println("Veuillez rentrer le prenom du client :");
// client.setPrenom(c.nextLine());
// System.out.println("Veuillez rentrer l'idConseiller du client :");
// client.setIdConseiller(i.nextInt());
// System.out.println("Veuillez rentrer l'age du client :");
// client.setAge(i.nextInt());
//
