
public enum Civilite {
	Sorcier ("Sorcier"), Sorciere ("Sorciere"), Moldu ("Moldu");

	private String libelle;
	
	private Civilite (String civ){
		libelle = civ;
	}
	public String getlibelle(){
		return libelle;
	}
	
}
