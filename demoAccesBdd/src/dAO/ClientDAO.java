package dAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;
import domaineCompte.CCourant;
import domaineCompte.CEpargne;
import domaineCompte.Compte;

public class ClientDAO {

	public Client creerClient(Client client) {
		int i = 0;
		try {
			Statement stmt = Connexion.connexion().createStatement();

			String s = "INSERT INTO `client`(`adresse`, `nom`, `prenom`, `codePostal`, `ville`, `situationFinanciere`, `situationProfessionnel`, `idEmploye`, `telephone`, `soldeTotal`) VALUES ('"
					+ client.getAdresse() + "', '" + client.getNom() + "', '" + client.getPrenom() + "', '"
					+ client.getCodePostal() + "', '" + client.getVille() + "', '" + client.getSituationFinanciere()
					+ "', '" + client.getSituationProfessionnel() + "', " + client.getIdEmploye() + ", "
					+ client.getTelephone() + ", "+client.getSoldeTotal()+")";

			i = stmt.executeUpdate(s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (i != 0)
			return client;
		else
			return null;

	}

	public Client getClient(Client client) {
		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "Select * from Client where idClient = " + client.getIdClient();
			// Etape 4 : exécution de la requete
			ResultSet rs = stmt.executeQuery(s);
			// Etape 5 : lecture
			rs.next();
			client.setIdClient(rs.getInt("idClient"));
			client.setAdresse(rs.getString("adresse"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			client.setCodePostal(rs.getString("codePostal"));
			client.setVille(rs.getString("ville"));
			client.setSituationFinanciere(rs.getString("situationFinanciere"));
			client.setSituationProfessionnel(rs.getString("situationProfessionnel"));
			client.setIdEmploye(rs.getInt("idEmploye"));
			client.setTelephone(rs.getInt("telephone"));
			client.setSoldeTotal(rs.getInt("soldeTotal"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;

	}

	public Client updateClient(Client client) {
		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "UPDATE client set adresse = '" + client.getAdresse() + "', nom = '" + client.getNom()
					+ "', prenom = '" + client.getPrenom() + "', CodePostal = '" + client.getCodePostal()
					+ "', ville = '" + client.getVille() + "', situationFinanciere = '"
					+ client.getSituationFinanciere() + "', situationProfessionnel = '"
					+ client.getSituationProfessionnel() + "', idEmploye = " + client.getIdEmploye() + ", telephone = "
					+ client.getTelephone() + ", soldeTotal = " + client.getSoldeTotal();
			stmt.executeUpdate(s);
			s = "Select * from client where idClient = " + client.getIdClient();
			ResultSet rs = stmt.executeQuery(s);
			// Etape 5 : lecture
			rs.first();
			client.setIdClient(rs.getInt("idClient"));
			client.setAdresse(rs.getString("adresse"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			client.setCodePostal(rs.getString("codePostal"));
			client.setVille(rs.getString("ville"));
			client.setSituationFinanciere(rs.getString("situationFinanciere"));
			client.setSituationProfessionnel(rs.getString("situationProfessionnel"));
			client.setIdEmploye(rs.getInt("idEmploye"));
			client.setTelephone(rs.getInt("telephone"));
			client.setSoldeTotal(rs.getInt("soldeTotal"));


		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

	public boolean deleteClient(Client client) {

		int i;
		boolean b = false;
		try {

			Statement stmt = Connexion.connexion().createStatement();
			String s = "DELETE from compte where idClient = " + client.getIdClient();
			i = stmt.executeUpdate(s);
			s = "DELETE from client where idClient = " + client.getIdClient();
			i = stmt.executeUpdate(s);
			if (i != 0)
				b = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	public List<Client> getAll() {
		List<Client> listClient = new ArrayList<Client>();

		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "Select * from Client";
			// Etape 4 : exécution de la requete
			ResultSet rs = stmt.executeQuery(s);
			// Etape 5 : lecture
			while (rs.next()) {
				Client client = new Client();
				client.setIdClient(rs.getInt("idClient"));
				client.setAdresse(rs.getString("adresse"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setCodePostal(rs.getString("codePostal"));
				client.setVille(rs.getString("ville"));
				client.setSituationFinanciere(rs.getString("situationFinanciere"));
				client.setSituationProfessionnel(rs.getString("situationProfessionnel"));
				client.setIdEmploye(rs.getInt("idEmploye"));
				client.setTelephone(rs.getInt("telephone"));
				client.setSoldeTotal(rs.getInt("soldeTotal"));

				listClient.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listClient;
	}

	public List<CCourant> getAllCompte(CompteCourantDAO CCourantDAO, CompteEpargneDAO CEpargneDAO) {

		List<CEpargne> listCEpargne = new ArrayList<CEpargne>();
		List listCompte = new ArrayList<Compte>();
		listCompte.addAll(CCourantDAO.getAllCompte());
		listCompte.addAll(CEpargneDAO.getAllCompte());
		return listCompte;
	}

	public CCourant getCompteCourant(Client client, CCourant compte) {
		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "Select * from compte inner Join client on compte.idClient = client.idClient where typeDeCompte = 'courant' && idClient = "
					+ client.getIdClient();
			ResultSet rs = stmt.executeQuery(s);
			// Etape 5 : lecture
			rs.next();
			compte.setIdCompte(rs.getInt("IdCompte"));
			compte.setNumeroCompte(rs.getInt("numeroCompte"));
			compte.setDecouvert(rs.getDouble("decouvertAutorise"));
			compte.setDateOuverture(rs.getString("dateOuverture"));
			compte.setSolde(rs.getDouble("solde"));
			compte.setTypeCarte(rs.getString("typeCarte"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return compte;
	}

	public CEpargne getCompteEpargne(Client client, CEpargne compte) {
		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "Select * from compte inner Join client on compte.idClient = client.idClient where typeDeCompte = 'épargne' && idClient = "
					+ client.getIdClient();
			ResultSet rs = stmt.executeQuery(s);
			// Etape 5 : lecture
			rs.next();
			compte.setIdCompte(rs.getInt("IdCompte"));
			compte.setNumeroCompte(rs.getInt("numeroCompte"));
			compte.setDateOuverture(rs.getString("dateOuverture"));
			compte.setSolde(rs.getDouble("solde"));
			compte.setTaux(rs.getDouble("tauxInteret"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return compte;
	}
}