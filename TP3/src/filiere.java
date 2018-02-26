
public class filiere implements collection{
	Integer numeroSection;
	professeur chefSection;
	Etudiant tabEtudiant[];
	public Integer getNumeroSection() {
		return numeroSection;
	}
	public void setNumeroSection(Integer numeroSection) {
		this.numeroSection = numeroSection;
	}
	public professeur getChefSection() {
		return chefSection;
	}
	public void setChefSection(professeur chefSection) {
		this.chefSection = chefSection;
	}
	public Etudiant[] getTabEtudiant() {
		return tabEtudiant;
	}
	public filiere()
	{
	tabEtudiant = new Etudiant[36];
	for (int i = 0; i < 40; i++) {
	    this.tabEtudiant[i]=new Etudiant();}
	}
	public Boolean addObject(Object o, int i) {
		tabEtudiant[i]= (Etudiant) o;
		return true;
	}
	public Boolean removeObject(Object o, int i) {
		tabEtudiant[i]= null;
		return true;
	}
	public Object getObject(int i) {
	return tabEtudiant[i];
	}
}
