import java.util.*;

public class Ouvrier extends Employe  {
	
	private Date date_entree  ;
	private final double  SMIG = 3000 ;
	
	// constructeur avec parametres 
	
	public Ouvrier(int matricule, String nom, String prenom, Date date_naissance, Date date_entree) {
		super(matricule, nom, prenom, date_naissance);
		this.date_entree = date_entree;
	}

	// getsalaire()
	
	public double getSalaire() {
		
        double salaire;
        Date dateactuel = new Date();
        int Anciennete = dateactuel.getYear() + 1900 - date_entree.getYear();
    
        if (SMIG + Anciennete * 100 <= 2 * SMIG)
            salaire = SMIG + Anciennete * 100;
        else
            salaire = SMIG * 2;
        return salaire;  
     
	}
	
 // get date d'entree

	public Date getDate_entree() {
		return date_entree;
	}
// set date d'entree

	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}

// get smig
	
	public double getSMIG() {
		return SMIG;
	}


	
	

}