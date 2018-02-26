
public class departement implements collection{
	professeur chefDepartement;
	String nom;
	personne tabMembre[];
	public professeur getChefDepartement() {
		return chefDepartement;
	}
	public void setChefDepartement(professeur chefDepartement) {
		this.chefDepartement = chefDepartement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public departement(String nom,professeur chefDepartement) {
		super();
		this.nom=nom;
		this.chefDepartement=chefDepartement;
		tabMembre=new personne[12];
	}
	public Boolean addObject(Object o, int i) {
		if( o instanceof professeur) {
			tabMembre[i]=(professeur) o;}
		else tabMembre[i]=(Doctorant) o;
		return true;
	}
public Boolean removeObject(Object o, int i) {
		if( o instanceof professeur) {tabMembre[i]=null;}
		else tabMembre[i]=null;	
		return true;
	}
	public Object getObject(int i) {
		 return tabMembre[i];
	}
	public double masseSalariale() {
		double sal =0;
		for(int i=0;i<12;i++) {
			if (tabMembre[i] instanceof professeur)
			sal+=((professeur) tabMembre[i]).calculeSalaire();
			}
		
		return sal;
	}
	

}
