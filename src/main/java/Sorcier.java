
public class Sorcier {
	
	private String nom;
	private String prenom;
	private Integer age;
	private Enum civ;
	private Enum patronus;
	
	
	public Sorcier () {}
	
	public Sorcier(String nom, String prenom, Integer age, Enum civ, Enum patronus) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.patronus = patronus;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Enum getCiv() {
		return civ;
	}
	public void setCiv(Enum civ) {
		this.civ = civ;
	}
	public Enum getPatronus() {
		return patronus;
	}
	public void setPatronus(Enum patronus) {
		this.patronus = patronus;
	}

	@Override
	public String toString() {
		return "Sorcier [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", civ=" + civ + ", patronus=" + patronus
				+ "]";
	}
	
	
	

}
