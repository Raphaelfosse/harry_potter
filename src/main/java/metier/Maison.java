package metier;
import java.util.*;

import javax.persistence.*;
@Entity

public class Maison {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Integer score;
	@OneToOne
	private Professeur professeur;
	@OneToMany(mappedBy="maison")
	private List<Eleve> eleves = new ArrayList();
	
	
	public Maison(){}
	
	public Maison(String nom, Integer score){
		this.nom = nom;
		this.score = score;
}
	
	public Maison(String nom, Integer score, Professeur professeur, List<Eleve> eleves) {
		this.nom = nom;
		this.score = score;
		this.professeur = professeur;
		this.eleves = eleves;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void addScore(int score) {
		int scorem = getScore();
		scorem += score;
		this.setScore(scorem);
	}
	
//	public void addEleve(List<Eleve> eleves) {
//		this.setEleve(eleves);
//	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Maison [nom=" + nom + ", score=" + score + "Prof" + getProfesseur() + "]";
	}
	
	

}
