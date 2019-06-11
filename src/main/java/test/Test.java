package test;

import java.util.*;

import metier.*;

public class Test {

	public static void main(String[] args) {
		Sort s1 = new Sort();
		s1.setLibelle("Lumos");
		s1.setTypeSort(TypeSort.Sortilège);
		
		Sort s2 = new Sort();
		s2.setLibelle("Experiarmus");
		s2.setTypeSort(TypeSort.Sortilège);
		
		List<Sort> sorts = new ArrayList();
		sorts.add(s1);
		sorts.add(s2);
		
		Matiere m1= new Matiere();
		m1.setSort(sorts);
		m1.setNom("Francais");
		
		List<Matiere> matieres = new ArrayList();
		matieres.add(m1);
		
		Maison ma1= new Maison();
		ma1.setNom("Griffondor");
		
		
		Eleve e1 = new Eleve("Hermione","Granger", 14, Civilite.Sorciere, Patronus.Chat, matieres, ma1);	
		
		System.out.println(e1);
		
	}

}
