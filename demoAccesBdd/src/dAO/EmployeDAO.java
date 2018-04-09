package dAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domaine.Conseiller;
import domaine.Gerand;
import domaine.Login;

public class EmployeDAO {
	public Gerand getGerand(Login login) {
		Gerand gerand = new Gerand();
		try {
			Statement stmt = Connexion.connexion().createStatement();
			String s = "Select * from Employe where idEmploye = " + login.getIdEmploye();
			ResultSet rs = stmt.executeQuery(s);
			rs.next();
			
			gerand.setIdEmploye(rs.getInt("idEmploye"));
			gerand.setNom(rs.getString("nom"));
			gerand.setPrenom(rs.getString("prenom"));
			gerand.setProfession(rs.getString("profession"));
			gerand.setIdAgenceBancaire(rs.getInt("idAgenceBancaire"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gerand;

	}
		public Conseiller getConseiller(Login login) {
			Conseiller conseiller = new Conseiller();
			try {
				Statement stmt = Connexion.connexion().createStatement();
				String s = "Select * from Employe where idEmploye = " + login.getIdEmploye();
				ResultSet rs = stmt.executeQuery(s);
				rs.next();
				
				conseiller.setIdEmploye(rs.getInt("idEmploye"));
				conseiller.setNom(rs.getString("nom"));
				conseiller.setPrenom(rs.getString("prenom"));
				conseiller.setProfession(rs.getString("profession"));
				conseiller.setIdAgenceBancaire(rs.getInt("idAgenceBancaire"));
				conseiller.setNbClient(rs.getInt("nbClient"));
				conseiller.setIdGerand(rs.getInt("idGerand"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conseiller;

		}
}
