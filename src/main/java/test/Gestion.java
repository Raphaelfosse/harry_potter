package test;


import java.util.Scanner;

import DAO.DAOMaison;
import metier.Maison;

public class Gestion {

	public static void main(String[] args) {
		menu();

	}

	static void insertMaisons() {

		DAOMaison daoMa = new DAOMaison();

		Maison gryf = new Maison ("Gryffondor", 0);
		Maison serp = new Maison ("Serpentard", 0);
		Maison pouf = new Maison ("Poufsouffle", 0);
		Maison serd = new Maison ("Serdaigle", 0);

		daoMa.insert(gryf);
		daoMa.insert(serp);
		daoMa.insert(pouf);
		daoMa.insert(serp);

	}

	static void menu() {


		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Faites votre choix\n1. Consulter une maison\n2. Gestion des eleves\n3. Gestion des professeurs\n4. Gestion des matieres");
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
		}
	}


	static void menuMaison() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir une maison\n1. Gryffondor\n2. Serpentard\n3. Poufsouffle\n4. Serdaigle");
		int choixmaison = clavierint.nextInt();

		System.out.println("Maison : " + choixmaison + "\n1. Ajouter points\n 2. Ajouter Eleve\n 3. Modifier professeur");
		int choixactionmaison = clavierint.nextInt();

		menuActionMaison(choixactionmaison);	
	}



	static void menuActionMaison(int choix) {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		switch (choix) {

		case 1:
			System.out.println("Combien de points voulez-vous ajouter ?");
			int nbpoint = clavierint.nextInt();
			//ajouterpoint(nbpoint);
			break;

		case 2:
			System.out.println("Saisir le nom de l'eleve a ajouter");
			String eleve = clavierstr.nextLine();
			//recherche eleve;
			break;

		case 3:
			System.out.println("Saisir le nom du professeur a modifier");
			String prof = clavierstr.nextLine();
			//recherche prof;
			break;
		}

	}

	static void menuEleve() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Choisir l'action a realiser\n1. Ajouter un eleve\n2. Modifier un eleve");
		int choixeleve = clavierint.nextInt();

		switch (choixeleve) {
		case 1:
			//ajoutereleve();
			break;

		case 2:
			menuModifEleve();
			break;

		}
	}



	static void menuModifEleve() {

		Scanner clavierint = new Scanner(System.in);
		Scanner clavierstr = new Scanner(System.in);

		System.out.println("Quel eleve voulez-vous modifier ?");
		String choixeleve = clavierint.nextLine();
		//Eleve e = rechercheeleve();

		System.out.println("Faites votre choix\n 1. Changer de maison\n2. Suivre matiere\n3. Lister les sorts");
		int choixactioneleve = clavierint.nextInt();

		switch (choixactioneleve) {
		case 1:
			System.out.println("Choissisez la maison a integrer");
			String changmais=clavierstr.nextLine();
			//changmaiseleve(changmais, e);
			break;

		case 2:
			System.out.println("Choissisez la matiere");
			String changmat=clavierstr.nextLine();
			//changmateleve(changmat, e);
			break;

		case 3:
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

