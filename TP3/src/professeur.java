/**
 * 
 * @author lahlaoi fatima ezzahra
 *
 */
public class professeur extends personne  implements salarie,collection {

	
	private Integer  nummerSomme;
	private String grade;
	private module tableauModule[];
	/**
	 * constructeur de la classe professeur
	 * @param nom
	 * @param email
	 * @param nummerSomme
	 * @param grade
	 */
	public professeur(String nom, String email, Integer nummerSomme, String grade) {
		super(nom, email);
		this.nummerSomme = nummerSomme;
		this.grade = grade;
		tableauModule= new module [6];
		for (int i = 0; i < 6; i++) {
	            this.tableauModule[i]=new module();}
}
	
	
	public module[] getTableauModule() {
		return tableauModule;
	}
	public void setTableauModule(module[] tableauModule) {
		this.tableauModule = tableauModule;
	}
	
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	/**
	 *  implementation de la methode calculeVacances
	 */
	public int calculeVacances(int NbrJours) {
		int n;
		n=NbrJours/10;
		return n;
	}
	/**
	 * implementation de la methode calculeSalaire
	 */
	public double calculeSalaire(){
		int s,i,somme;
		double salaire;
	    somme=0;
		for(i=0;i<4;i++)
		{
		somme+=tableauModule[i].nbrHeures;}
		
	if(somme<=32) {
		s=400*somme;
		salaire=s-(s*0.34)+5000;
		return salaire;
	}
	else
	{int j;
	j=somme-32;
		s=j*600;
		i=s+32*400;
	salaire=i-(i*0.17)+5000;
	return salaire;
	
	}}
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
	public double calculeSalaire(Integer NbrHeurs) {
		
		return 0;
	}
	
	
	

}