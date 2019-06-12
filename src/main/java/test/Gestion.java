package test;


import java.util.*;


import DAO.*;
import application.Context;
import metier.*;

public class Gestion {
	

	static DAOMaison daoMa = new DAOMaison();
	static DAOProfesseur daoP = new DAOProfesseur();
	static DAOSort daoS = new DAOSort();
	static DAOMatiere daoM = new DAOMatiere();
	
	public static void main(String[] args) {
		menu();


	}

	
	public static void menu() {


		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Faites votre choix\n1. Consulter une maison\n2. Gestion des eleves\n3. Gestion des professeurs\n4. Gestion des matieres\n5. Quitter");
		int choix = clavierint.nextInt();

		switch (choix) {
		case 1:
			menuMaison();
			break;

		case 2:
			menuEleve();
			break;

		case 3:
			menuprof();
			break;

		case 4:
			menumatiere();
			break;
		case 5:
			Context.destroy();
			break;
		case 999:
			Professeur p1 = new Professeur("Rogue", "Severus", 45, Civilite.Sorcier, Patronus.Fouine);
			Professeur p2 = new Professeur("Flitwick", "Fillius", 78, Civilite.Sorcier, Patronus.Lapin);
			Professeur p3 = new Professeur("Chourave", "Pomona", 58, Civilite.Sorciere, Patronus.Cerf);
			Professeur p4 = new Professeur("McGonagall", "Minerva", 63, Civilite.Sorciere, Patronus.Chat);
			Professeur p5 = new Professeur("Dumbledore", "Albus", 108, Civilite.Sorcier, Patronus.Phoenix);
			Professeur p6 = new Professeur("Serpentard", "Salazar", 154, Civilite.Sorcier, Patronus.Serpent);
			Professeur p7 = new Professeur("Gryffondor", "Godrick", 243, Civilite.Sorcier, Patronus.Lion);
			Professeur p8 = new Professeur("Sinistra", "Aurora", 43, Civilite.Sorciere, Patronus.Cygne);
			Professeur p9 = new Professeur("Lupin", "Remus", 53, Civilite.Sorcier, Patronus.Loup);
			Professeur p10 = new Professeur("Binns", "Cuthbert", 105, Civilite.Sorcier, Patronus.Serpent);
			Professeur p11 = new Professeur("Bibine", "Rolenda", 35, Civilite.Sorciere, Patronus.Aigle);
			
			daoP.insert(p1);
			daoP.insert(p2);
			daoP.insert(p3);
			daoP.insert(p4);
			daoP.insert(p5);
			daoP.insert(p6);
			daoP.insert(p7);
			daoP.insert(p8);
			daoP.insert(p9);
			daoP.insert(p10);
			daoP.insert(p11);
			
			
			Sort s1 = new Sort ("Divination",TypeSort.Enchantement);
			Sort s2 = new Sort ("Pousse Plante", TypeSort.Sortilège);
			Sort s3 = new Sort ("Avada Kedavra", TypeSort.Maléfice);
			Sort s4 = new Sort ("Expelliarmus", TypeSort.Maléfice);
			Sort s5 = new Sort ("Passus", TypeSort.Transplanage);
			Sort s6 = new Sort ("Animagie", TypeSort.Métamorphose);
			Sort s7 = new Sort ("Polynectar", TypeSort.Métamorphose);
			Sort s8 = new Sort ("Wingardium Lefiosa", TypeSort.Sortilège);
			Sort s9 = new Sort ("Wake up", TypeSort.Enchantement);
			
			daoS.insert(s1);
			daoS.insert(s2);
			daoS.insert(s3);
			daoS.insert(s4);
			daoS.insert(s5);
			daoS.insert(s6);
			daoS.insert(s7);
			daoS.insert(s8);
			daoS.insert(s9);	
			
			Maison gryf = new Maison ("Gryffondor", 0);
			Maison serp = new Maison ("Serpentard", 0);
			Maison pouf = new Maison ("Poufsouffle", 0);
			Maison serd = new Maison ("Serdaigle", 0);
			
			
			daoMa.insert(gryf);
			daoMa.insert(serp);
			daoMa.insert(pouf);
			daoMa.insert(serd);
			
			Matiere m1 = new Matiere("Astronomie");
			m1.setProfesseur(p8);
			Matiere m2 = new Matiere("Botanique");
			m2.setProfesseur(p3);
			Matiere m3 = new Matiere("Defense contre les forces du Mal");
			m3.setProfesseur(p9);
			Matiere m4 = new Matiere("Histoire de la Magie");
			m4.setProfesseur(p10);
			Matiere m5 = new Matiere("Metamorphose");
			m5.setProfesseur(p4);
			Matiere m6 = new Matiere("Potion");
			m6.setProfesseur(p1);
			Matiere m7 = new Matiere("Sortilège");
			m7.setProfesseur(p2);
			Matiere m8 = new Matiere("Vol sur balai");
			m8.setProfesseur(p11);
			
			daoM.insert(m1);
			daoM.insert(m2);
			daoM.insert(m3);
			daoM.insert(m4);
			daoM.insert(m5);
			daoM.insert(m6);
			daoM.insert(m7);
			daoM.insert(m8);
		}
	}


	public static void menuMaison() {
		
	
		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir une maison\n1. Gryffondor\n2. Serpentard\n3. Poufsouffle\n4. Serdaigle");
		String choixmaison = clavierint.nextLine();

		System.out.println("Maison : " + choixmaison + "\n1. Ajouter points\n 2. Ajouter Eleve\n 3. Modifier professeur");
		int choixactionmaison = clavierint.nextInt();

		menuActionMaison(choixactionmaison,choixmaison);
	}
		
		
	static void menuActionMaison(int choix, String choixmaison) {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		switch (choix) {

		case 1:
			System.out.println("Combien de points voulez-vous ajouter ?");
			
			int nbpoint = clavierint.nextInt();
				switch (choixmaison) {
					case "Gryffondor":
						Maison maison_gryf = daoMa.selectById(1);
						maison_gryf.addScore(nbpoint);
						daoMa.update(maison_gryf);
						System.out.println(maison_gryf);
						break;
					case "Serpentard":
					Maison maison_serp = daoMa.selectById(2);
						maison_serp.addScore(nbpoint);
						daoMa.update(maison_serp);
						System.out.println(maison_serp);
						break;
					case "Poufsouffle":
						Maison maison_pouf = daoMa.selectById(3);
						maison_pouf.addScore(nbpoint);
						daoMa.update(maison_pouf);
						System.out.println(maison_pouf);
						break;
					case "Serdaigle":
						Maison maison_serd = daoMa.selectById(4);
						maison_serd.addScore(nbpoint);
						daoMa.update(maison_serd);
						System.out.println(maison_serd);
						break;
				}
			break;

		case 2:
			System.out.println("Saisir le nom de l'eleve a ajouter");
			String eleve_nom = clavierstr.nextLine();
			System.out.println("Saisir le prenom de l'eleve a ajouter");
			String eleve_prenom = clavierstr.nextLine();
			System.out.println("Saisir l'âge de l'eleve a ajouter");
			int eleve_age = clavierint.nextInt();
				switch(choixmaison) {
					case "Gryffondor":
						
						Eleve e1 = new Eleve(eleve_nom, eleve_prenom, eleve_age);
						e1.setMaison(gryf);
						System.out.println(e1);
						break;
						
					case "Serpentard":
						
						Eleve e2 = new Eleve(eleve_nom, eleve_prenom, eleve_age);
						e2.setMaison(serp);
						System.out.println(e2);
						break;
						
					case "Poufsouffle":
						
						Eleve e3 = new Eleve(eleve_nom, eleve_prenom, eleve_age);
						e3.setMaison(pouf);
						System.out.println(e3);
						break;
						
					case "Serdaigle":
						
						Eleve e4 = new Eleve(eleve_nom, eleve_prenom, eleve_age);
						e4.setMaison(serd);
						System.out.println(e4);
						break;
				}
			break;

//		case 3:
//			System.out.println("Saisir le nom du professeur a modifier");
//			String prof = clavierstr.nextLine();
//			Professeur profprincipal=null;
//			System.out.println(list_prof.isEmpty());
//			for(Professeur p : list_prof) {
//			System.out.println(p.getNom());
//			}
//	
//			
//			for (int i =0; i<list_prof.size();i++){
//			Professeur p0 = list_prof.get(i);
//			if (prof.equals(p0.getNom())) {
//				System.out.println("entrée boucles");
//				profprincipal = p0;
//				System.out.println(profprincipal);
//			}
//			
//		}
//				switch(choixmaison) {
//					case "Gryffondor":
//						gryf.setProfesseur(profprincipal);
//						System.out.println(gryf);
//						break;
//						
//					case "Serpentard":
//						serp.setProfesseur(profprincipal);
//						break;
//						
//					case "Poufsouffle":
//						pouf.setProfesseur(profprincipal);
//						break;
//						
//					case "Serdaigle":
//						serd.setProfesseur(profprincipal);
//						break;
//						
//				}
//			break;
		}
	}

	public static void menuEleve() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir l'action a realiser\n1. Ajouter un eleve\n2. Modifier un eleve");
		int choixeleve = clavierint.nextInt();

		switch (choixeleve) {
		case 1:
			ajouterEleve();
			break;

		case 2:
			menuModifEleve();
			break;

		}
	}


	
	
	public static void ajouterEleve() {
		
	
		DAOEleve daoE = new DAOEleve();
		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);
		
		System.out.println("Saisir le nom de l'eleve a ajouter");
		String eleve_nom = clavierstr.nextLine();
		System.out.println("Saisir le prenom de l'eleve a ajouter");
		String eleve_prenom = clavierstr.nextLine();
		System.out.println("Saisir l'âge de l'eleve a ajouter");
		int eleve_age = clavierint.nextInt();
		System.out.println("Saisir la civilite de l'eleve a ajouter");
		String eleve_civilite = clavierstr.nextLine();
		System.out.println("Saisir le patronus de l'eleve a ajouter");
		String eleve_patronus = clavierstr.nextLine();
		
		Eleve e = new Eleve(eleve_nom, eleve_prenom, eleve_age,Civilite.valueOf(eleve_civilite),Patronus.valueOf(eleve_patronus));
		list_eleve.add(e);
		daoE.insert(e);
	}



	public static void menuModifEleve() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

//		System.out.println("Quel eleve voulez-vous modifier ?");
//		String choixeleve = clavierint.nextLine();
//		
//		Eleve eleverech = new Eleve();
//		for (int i =0; i<list_eleve.size();i++){
//			Eleve e0 = list_eleve.get(i);
//			if (eleverech.equals(e0.getNom())) {
//				eleverech = e0;
//			}
//		}

		System.out.println("Faites votre choix\n 1. Suivre matiere\n2. Lister les sorts");
		int choixactioneleve = clavierint.nextInt();
		
		for (Matiere m : list_mat){
			System.out.println(m.getNom());
		}
		
		String choixmatiere = clavierstr.nextLine();
		
		switch (choixmatiere) {
		
		}

		switch (choixactioneleve) {
		
		case 1:
			System.out.println("Choissisez la matiere");
			String changmat=clavierstr.nextLine();
			//changmateleve(changmat, e);
			break;

		case 2:
			//affichesort(e);

		}
	}

	static void menuprof() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir l'action a realiser\n1. Ajouter un professeur\n2. Modifier un professeur");
		int choixprof = clavierint.nextInt();

		switch (choixprof) {
		case 1:
			//ajouterprof();
			break;

		case 2:
			menuModifProf();
			break;
		}
	}



	static void menuModifProf() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Quel professeur voulez-vous modifier ?");
		String choixprof = clavierint.nextLine();
		//Professeur p = rechercheprof();

		System.out.println("Faites votre choix\n 1. Changer de maison\n2. Suivre matiere");
		int choixactionprof = clavierint.nextInt();

		switch (choixactionprof) {
		case 1:
			System.out.println("Choissisez la maison a integrer");
			String changmais=clavierstr.nextLine();
			//changmaisprof(changmais, p);
			break;

		case 2:
			System.out.println("Choissisez la matiere");
			String changmat=clavierstr.nextLine();
			//changmatprof(changmat, p);
			break;
		}
	}

	static void menumatiere() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir l'action a realiser\n1. Ajouter une matiere\n2. Modifier une matiere");
		int choixmatiere = clavierint.nextInt();

		switch (choixmatiere) {
		case 1:
			//ajoutermatiere();
			break;

		case 2:
			menuModifMatiere();
			break;
		}
	}


	static void menuModifMatiere(){
	
	Scanner clavierint = new Scanner(System.in);
	Scanner clavierstr = new Scanner(System.in);

	System.out.println("Quelle matiere voulez-vous modifier ?");
	String choixmatiere = clavierint.nextLine();
	//Matiere m = recherchemat();

	System.out.println("Faites votre choix\n1. Ajouter sort\n2. Changer professeur\n3. Supprimer sort");
	int choixactionmat = clavierint.nextInt();

	switch (choixactionmat) {
	case 1:
		//ajoutersort();
		break;

	case 2:
		System.out.println("Choissisez le nouveau professeur");
		String changprof=clavierstr.nextLine();
		//Professeur p = rechercheprof();
		//changprofmat(changprof, p);
		break;
		
	case 3:
		//supprimersort();
		break;
	}

	}

}

