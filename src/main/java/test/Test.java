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
		
		Professeur p1 = new Professeur();
		p1.setNom("Chourave");
		
		Matiere m1= new Matiere();
		m1.setNom("Francais");
		m1.setProfesseur(p1);
		Matiere m2= new Matiere();
		m2.setNom("SVT");
		m1.setProfesseur(p1);
		Matiere m3= new Matiere();
		m3.setNom("Potion");
		m1.setProfesseur(p1);
		Matiere m4= new Matiere();
		m4.setNom("Cuisine");
		m1.setProfesseur(p1);
		
		List<Matiere> matieres = new ArrayList();
		matieres.add(m1);
		matieres.add(m2);
		matieres.add(m3);
		matieres.add(m4);
		
		daoP.insert(p1);
		
		daoM.insert(m1);
		daoM.insert(m2);
		daoM.insert(m3);
		daoM.insert(m4);
		
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
		
		Maison ma1 = new Maison();
		ma1.setNom("Griffondor");
		ma1.setProfesseur(p1);
		daoMa.insert(ma1);

		
		
		Eleve e1 = new Eleve("Granger", "Hermione", 14);
		e1.setMaison(ma1);
		e1.setCiv(Civilite.Sorciere);
		e1.setPatronus(Patronus.Chat);
		e1.setMatiere(matieres);
		
		
		daoE.insert(e1);
		
		
		System.out.println(s1);
		
		System.out.println(e1);
		
		for(Eleve e : daoE.selectAllWithMatiere()) {
			System.out.println(e);
		}
	}

}
