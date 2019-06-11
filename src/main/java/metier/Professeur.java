package metier;

import javax.persistence.*;

@Entity
@DiscriminatorValue("professeur")

public class Professeur extends Sorcier{

	@OneToOne
	private Matiere matiere;
	
	
	public Professeur(){}

	
	public Professeur(Integer id, String nom, String prenom, Integer age,Matiere matiere, Enum civ, Enum patronus) {
		super(id, nom,prenom,age,civ,patronus);
		this.matiere = matiere;
	}


	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	

}
