package metier;

import javax.persistence.*;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="type_sorcier")

public abstract class  Sorcier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private Integer age;
	@Enumerated(EnumType.STRING)
	private Civilite civ;
	@Enumerated(EnumType.STRING)
	private Patronus patronus;
	
	
	public Sorcier () {}
	
	public Sorcier(Integer id, String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.patronus = patronus;
	}
	
	public Sorcier(String nom, String prenom, Integer age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Sorcier( String nom, String prenom, Integer age, Civilite civ, Patronus patronus) {
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
	public void setCiv(Civilite civ) {
		this.civ = civ;
	}
	public Enum getPatronus() {
		return patronus;
	}
	public void setPatronus(Patronus patronus) {
		this.patronus = patronus;
	}

	@Override
	public String toString() {
		return "Sorcier [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", civ=" + civ + ", patronus=" + patronus
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sorcier other = (Sorcier) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	
	
	

}
