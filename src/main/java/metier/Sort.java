package metier;

import javax.persistence.*;

@Entity

public class Sort {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String libelle;
	@ManyToOne
	private Matiere matiere;
	@Enumerated(EnumType.STRING)
	private TypeSort typeSort;
	
	public Sort(){	
	}
	
	public void add (Sort s){	
	}

	public Sort(String libelle, Matiere matiere, TypeSort typeSort) {
		this.libelle = libelle;
		this.matiere = matiere;
		this.typeSort = typeSort;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Enum getTypeSort() {
		return typeSort;
	}

	public void setTypeSort(TypeSort typeSort) {
		this.typeSort = typeSort;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "sort [libelle=" + libelle + ", typeSort=" + typeSort + "]";
	}		

}
