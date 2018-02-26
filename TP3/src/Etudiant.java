/**
 * 
 * @author lahlaoi fatima ezzahra
 *
 */
public class Etudiant extends personne implements collection{

	private Integer  nummerEtudiant;
	 module tableauModule[];
	
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	/**
	 * constructeur de la classe etudiant
	 * @param nom
	 * @param email
	 * @param nummerEtudiant
	 */
public Etudiant(String nom, String email, Integer nummerEtudiant) {
		super(nom, email);
		this.nummerEtudiant = nummerEtudiant;
		tableauModule= new module[6];
		for (int i = 0; i < 6; i++) {
        this.tableauModule[i]=new module();}
	}
	/**
	 * constructeur sans parametres
	 */
public Etudiant() {
	super();
}

	public String toString() {
		return "Etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant + ", email=" + email + "]";
	}
	
	
	public void afficher()
	{
		System.out.println(toString());
	}
public Boolean addObject(Object o, int i) {
		
		tableauModule[i]= (module) o;
		return true;
	}

	public Boolean removeObject(Object o, int i) {
		tableauModule[i]= null;
		return true;
	}

	public Object getObject(int i) {
	return tableauModule[i];
	}
	
	

}
