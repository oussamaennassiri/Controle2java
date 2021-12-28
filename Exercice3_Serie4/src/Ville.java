public class Ville {

	private String nom ; 
	private double population ;
	private String pays ; 
	
	// methode contenue l'exception 
	
	public void Exception_population(double population) {
		
		Exception PopulationException = new Exception ("La populationn doit etre un nombre positif") ;
		try {
			if(population < 0 ) {
				throw(PopulationException) ; 	
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage()) ;
		}
	
	}
	
	// constructeur avec parametre
	
	public Ville(String nom, double population, String pays) {
		
		this.nom = nom;
		this.pays = pays;		
		Exception_population(population);
		this.population = population;
		
}
	// constructeur sans parametre
	
	public Ville() {}
	
	// getter et setters 
	
public void setPopulation(double population) {
		
		Exception_population(population);
		this.population = population;
	}



	public double getPopulation() {
		return population;
	}
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
	




}
