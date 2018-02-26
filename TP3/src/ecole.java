/**
 * 
 * @author lahlaoi fatima ezzahra
 *
 */
public class ecole {
	
	
public static void main(String[] args) {
	
	professeur p1 = new professeur("lahlaoi","lahlaoi@gmail.com",6,"grade1");
	professeur p2 = new professeur("hacham","hacham@gmail.com",7,"grade2");
	
	Doctorant d1 = new Doctorant("fatima","fatima@gmail.com",14,"These1",p1);

	Etudiant a = new Etudiant("zineb,","zineb@gmail.com",2);
	Etudiant b = new Etudiant("siham","siham@gmail.com",1);
	
	module m1 = new module("M1",1,25,p1);
	module m2 = new module("M2",2,30,p2);
	departement dep1 = new departement("informatique",p1);
	
	filiere f1 = new filiere();

	p1.addObject(m1, 1);
    p2.addObject(m2, 2);
	
	System.out.println("le module de professeur "+p1.nom +" est "+ p1.getObject(1));
	System.out.println("le module de professeur "+ p2.nom +" est "+p2.getObject(2));
	
	dep1.addObject(p1, 0);
	dep1.addObject(p2, 1);
	dep1.addObject(d1, 2);
	System.out.println("le departement dep1 contient :");
	for (int i=0; i<3; i++) 
	{ 
	  System.out.println(dep1.getObject(i));
	}
	System.out.println("le salaire total de dep1 est "+dep1.masseSalariale());
 
	a.addObject(m1, 0);
	a.addObject(m2, 1);
	System.out.println("l'etudiante zineb a comme modules :");
	System.out.println(a.getObject(0));
	System.out.println(a.getObject(1));
	f1.addObject(a, 0);
	//f1.removeObject(a,0);
	f1.addObject(b, 1);

	System.out.println("La filiere f1 contient: ");
	System.out.println(f1.getObject(0));
	System.out.println(f1.getObject(1));

	

	
	}}
