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
		s1.setTypeSort(TypeSort.Sortilège);
		
		Sort s2 = new Sort();
		s2.setLibelle("Experiarmus");
		s2.setTypeSort(TypeSort.Sortilège);
		s2.setMatiere(m1);
		s1.setMatiere(m1);
		daoS.insert(s1);
		daoS.insert(s2);
		
		
		Professeur p1 = new Professeur();
		p1.setNom("Chourave");
		m1.setProfesseur(p1);
		
		daoP.insert(p1);
		
		Maison ma1 = new Maison();
		ma1.setNom("Griffondor");
		ma1.setProfesseur(p1);
		daoMa.insert(ma1);

		
		
		Eleve e1 = new Eleve("Granger", "Hermione", 14);
		e1.setMaison(ma1);
		
		daoE.insert(e1);
		
		System.out.println(s1);
		
	}

}
