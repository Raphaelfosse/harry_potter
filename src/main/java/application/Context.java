package application;

import javax.persistence.*;

public class Context {
	
	private static EntityManagerFactory emf;
	private static Context _instance;

	public Context() {
		emf = Persistence.createEntityManagerFactory("maBase");
	}
	
	//verifier si l'instance existe ou non. 
	//Si elle n'existe pas elle sera null et sinon il y aura un objet.
	public static Context getInstance() {
		if(_instance==null){
			_instance=new Context();
		}
		return _instance;
	}
	
	public EntityManagerFactory getEmf(){
	return emf;	
	}
	
	public static void destroy(){
		if(_instance !=null)
		emf.close();
		_instance=null;
	}

}
