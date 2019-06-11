
public class Sort {
	
	private String libelle;
	private Matiere matiere;
	private Enum typeSort;
	
	public Sort(){	
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
	
	@Override
	public String toString() {
		return "sort [libelle=" + libelle + ", typeSort=" + typeSort + "]";
	}		

}
