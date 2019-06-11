
package metier;

import java.util.List;

import javax.persistence.*;

@Entity

public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@OneToMany
	private List<Sort> sort;
	@OneToOne
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
