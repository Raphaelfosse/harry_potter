package metier;
import java.util.*;
public class Maison {
	
	private String nom;
	private Integer score;
	private Professeur professeur;
	private List<Eleve> eleves = new ArrayList();
	
	
	public Maison(){}
	
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
		return "Maison [nom=" + nom + ", score=" + score + "]";
	}
	
	

}