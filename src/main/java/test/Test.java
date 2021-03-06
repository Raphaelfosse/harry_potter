package test;

import java.util.ArrayList;
import java.util.List;

import DAO.*;
import metier.*;

public class Test {

	public static void main(String[] args) {
		DAOEleve daoE = new DAOEleve();
		DAOMatiere daoM= new DAOMatiere();
		DAOProfesseur daoP= new DAOProfesseur();
		DAOSort daoS= new DAOSort();
		DAOMaison daoMa = new DAOMaison();
		
		Matiere m1= new Matiere();
		m1.setNom("Francais");
		
		List<Matiere> matieres = new ArrayList();
		matieres.add(m1);
		
		daoM.insert(m1);
		
		Sort s1 = new Sort();
		s1.setLibelle("Lumos");
		s1.setTypeSort(TypeSort.Sortil�ge);
		
		Sort s2 = new Sort();
		s2.setLibelle("Experiarmus");
		s2.setTypeSort(TypeSort.Sortil�ge);
		
		daoS.insert(s1);
		daoS.insert(s2);
		
		List<Sort> sorts = new ArrayList();
		sorts.add(s1);
		sorts.add(s2);
		
		s1.setMatiere(m1);
		s2.setMatiere(m1);
		
		Professeur p1 = new Professeur();
		p1.setNom("Chourave");
		p1.setMatiere(m1);
		
		daoP.insert(p1);
		
		Maison ma1 = new Maison();
		ma1.setNom("Griffondor");
		daoMa.insert(ma1);
		
		
		Eleve e1 = new Eleve("Granger", "Hermione", 14);
		
		daoE.insert(e1);
		
		System.out.println(s1);
		
	}

}
