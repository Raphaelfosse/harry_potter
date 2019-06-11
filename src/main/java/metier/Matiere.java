
package metier;
import java.util.List;
>>>>>>> ccf450aa778e4281731933587245cfc00bbcc817:src/main/java/metier/Matiere.java

public class Matiere {
	private String nom;
	private List<Sort> sort; 
	private Professeur professeur;
	
	public Matiere(){
		
	}
	
	
	public Matiere(String nom, List<Sort> sort, Professeur professeur) {
		this.nom = nom;
		this.sort = sort;
		this.professeur = professeur;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Sort> getSort() {
		return sort;
	}
	public void setSort(List<Sort> sort) {
		this.sort = sort;
	}
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	} 
	
	
}
