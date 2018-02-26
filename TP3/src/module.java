
public class module {

	private String libelle;
	private Integer coefficient;
	public Integer  nbrHeures;
	private professeur enseignent;
	

	public module(String libelle, Integer coefficient, Integer nbrHeures, professeur enseignent) {
		super();
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrHeures = nbrHeures;
		this.enseignent = enseignent;
	}
	public module() {
		super();
		
	}
	 
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeures() {
		return nbrHeures;
	}
	public void setNbrHeures(Integer nbrHeures) {
		this.nbrHeures = nbrHeures;
	}
	public professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(professeur enseignent) {
		this.enseignent = enseignent;
	}

	
	public String toString() {
		return "Module [libelle=" + libelle + ", coefficient=" + coefficient + ", nbrHeures=" + nbrHeures
				+ ", enseignent=" + enseignent + "]";
	}
	
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
}

