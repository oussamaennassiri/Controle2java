import java.lang.Exception;

public class Enfant {

	private int age  ; 
	
	public Enfant() {
	}
	
	

	public Enfant(int age) {
		//Exception dans le Constructeur 
		
		Exception AgeEnfantException = new Exception ("[ "+age+" ] ans n'est pas un âge valide !") ;
		
		
		
		try {
			if (age<1 || age>10) {
				throw(AgeEnfantException) ; 
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage()) ;
		}
			
			this.age=age;
		}


	public int getAge() {
		return age;
	}

	//Exception n'est pas dans le Constructeur 
	
	public void setAge(int age) {
		
		Exception AgeeEnfantException = new Exception ("[ "+age+" ] ans n'est pas un âge valide !") ;
		try {
			if(age<1 || age>10) {
				throw(AgeeEnfantException) ; 
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage()) ;
		}
		this.age = age;
	}


	
	

	
	
}
