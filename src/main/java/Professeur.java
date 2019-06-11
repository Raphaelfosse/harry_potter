
public class Professeur extends Sorcier{
	
	private String matiere;
	
	
	public Professeur(){}

	
	public Professeur(String nom, String prenom, Integer age,String matiere, Enum civ, Enum patronus) {
		super(nom,prenom,age,civ,patronus);
		this.matiere = matiere;
	}


	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	

}
