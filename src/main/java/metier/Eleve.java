package metier;

import java.util.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("eleve")

public class Eleve extends Sorcier {

	@ManyToMany
	@JoinTable(name = "Join_Eleve_Matiere")

	private List<Matiere> matiere;
	@ManyToOne
	private Maison maison;

	public Eleve() {
	}

	public Eleve(Integer id, String nom, String prenom, Integer age, Civilite civ, Patronus patronus, List<Matiere> matiere,
			Maison maison) {
		super(id, nom, prenom, age, civ, patronus);
		this.matiere = matiere;
		this.maison = maison;
	}

	public Eleve(String nom, String prenom, Integer age) {
		super(nom, prenom, age);
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
		return "Titre : " + getCiv() + "Prenom : " + getPrenom() + "Nom : " + getNom() + "Age : " + getAge() + " de la maison " + getMaison() + "Patronus de type: " + getPatronus() + " a choisit les matières suivantes :" + getMatiere() +  " FIN";
	}

}
