package dAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domaine.Client;
import domaine.Login;

public class LoginDAO {
	public Login VerificationLogin(Login login) {
		try {
			Statement stmt = Connexion.connexion().createStatement();

			String s = "Select employe.profession, employe.idEmploye from employe inner Join Login on employe.idEmploye = login.idEmploye where login = '"
					+ login.getIdentifiant() + "' && motDePasse = " + login.getMotDePasse();
			ResultSet rs = stmt.executeQuery(s);
			rs.next();
			login.setProfessionEmploye(rs.getString("profession"));
			login.setIdEmploye(rs.getInt("idEmploye"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			login.setProfessionEmploye(null);
			login.setIdEmploye(0);
		}
		return login;

	}

}
