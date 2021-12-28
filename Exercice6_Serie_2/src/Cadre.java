import java.util.Date;

public class Cadre extends Employe {
	private int indice ;
	
	//constructeur avec parametres 
	
	public Cadre(int matricule, String nom, String prenom, Date date_naissance, int indice) {
		super(matricule, nom, prenom, date_naissance);
		this.indice = indice;
	}
	
	

	//getters setters
	
	public double getSalaire() {
		double salaire = 0 ; 
		
		switch(indice) {
		case 1 : salaire = 12000 ; 
			break ;
		case 2 : salaire = 14000 ; 
			break ;
		case 3 :  salaire = 16000 ; 
			break ;
		case 4 : salaire = 18000 ;  
			break ;
		default : 
			System.out.print("indice invalid"); 
		
		}
		return salaire ;
	}

	
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}



	public String toString() {
		return "Cadre [indice=" + indice + "]";
	}
	

}