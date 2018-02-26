
/**
 * @author lahlaoi fatima ezzahra
 *
 */
public abstract class personne {
String nom;
String email;

public personne(String nom, String email) {
	super();
	this.nom = nom;
	this.email = email;
}


public personne() {
	
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}

