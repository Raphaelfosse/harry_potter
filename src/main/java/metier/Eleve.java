package metier;
import java.util.*;

public class Eleve extends Sorcier {
	private List<Matiere> matiere; 
	private Maison maison;
	
	public Eleve() {
	}
	
	public Eleve(String nom, String prenom, Integer age, Enum civ, Enum patronus, List<Matiere> matiere, Maison maison) {
		super(nom, prenom, age, civ, patronus);
		this.matiere = matiere;
		this.maison = maison;
	}
	public List<Matiere> getMatiere() {
		return matiere;
	}
	public void setMatiere(List<Matiere> matiere) {
		this.matiere = matiere;
	}
	public Maison getMaison() {
		return maison;
	}
	public void setMaison(Maison maison) {
		this.maison = maison;
	}

	@Override
	public String toString() {
		return "Eleve [getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge() + ", getCiv()="
				+ getCiv() + ", getPatronus()=" + getPatronus() + ", toString()=" + super.toString() + "]";
	} 
	
}
