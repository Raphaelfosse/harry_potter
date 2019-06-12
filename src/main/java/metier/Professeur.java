package metier;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professeur")

public class Professeur extends Sorcier{

	@OneToOne
	private Matiere matiere;
	
	
	public Professeur(){}
	
	
	public Professeur(Integer id, String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		super(id, nom,prenom,age,civ,patronus);
	}
	
	public Professeur( String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		super(nom,prenom,age,civ,patronus);
	}


	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	

}
