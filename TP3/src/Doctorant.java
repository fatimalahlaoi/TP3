
public class Doctorant extends Etudiant implements salarie {

	String SujetThese;
	professeur  encadrant;
	
	
	
	public Doctorant(String nom, String email, Integer nummerEtudiant, String sujetThese, professeur encadrant) {
		super(nom, email, nummerEtudiant);
		SujetThese = sujetThese;
		this.encadrant = encadrant;
	}


	public Doctorant() {
		
	}
	
public String getSujetThese() {
		return SujetThese;
	}


	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}


	public professeur getEncadrant() {
		return encadrant;
	}


	public void setEncadrant(professeur encadrant) {
		this.encadrant = encadrant;
	}


	public double calculeSalaire(Integer NbrHeurs) {
		int s;
		double salaire;
		
	if(NbrHeurs<=32) {
		s=400*NbrHeurs;
		salaire=s-(s*0.34)+5000;
		return salaire;
	}
	else
	{int j,i;
	j=NbrHeurs-32;
		s=j*600;
		i=s+32*400;
	salaire=i-(i*0.17)+5000;
	return salaire;
	
	}}

	@Override
	public int calculeVacances(int Nbrjours) {
int s =0;
s=(int)Nbrjours/10;
return s;

}


	@Override
	public double calculeSalaire() {
		
		return 0;
	}}
