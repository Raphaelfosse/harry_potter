
public class Eleve extends Sorcier {
	private List<Matieres> matiere; 
	private Maison maison;
	
	public Eleve() {
	}
	
	public Eleve(List<Matieres> matiere, Maison maison) {
		super();
		this.matiere = matiere;
		this.maison = maison;
	}

	public List<Matieres> getMatiere() {
		return matiere;
	}
	public void setMatiere(List<Matieres> matiere) {
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
