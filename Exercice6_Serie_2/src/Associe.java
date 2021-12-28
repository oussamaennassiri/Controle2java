import java.util.Date;

public class Associe extends Employe{
	
	private static double chiffre_affaires;
	private double beneficeNet  ;
    private double pourcentage;



	public Associe(int matricule, String nom, String prenom, Date date_naissance, double chiffre_affaires, double beneficeNet, double pourcentage) {
		super(matricule, nom, prenom, date_naissance);
		this.chiffre_affaires = chiffre_affaires;
		this.beneficeNet = beneficeNet;
		this.pourcentage = pourcentage;
	}


	public String toString() {
		return "Associé [pourcentage=" + pourcentage + "]";
	}


	public  double getChiffre_affaires() {
		return chiffre_affaires;
	}

	public  void setChiffre_affaires(double chiffre_affaires) {
		Associe.chiffre_affaires = chiffre_affaires;
	}


	public double getPourcentage() {
		return pourcentage;
	}


	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}




	public double getSalaire() {
		
		return Math.round( (( beneficeNet*pourcentage/100 ) / 12) )    ;
	}


	public double getBeneficeNet() {
		return beneficeNet;
	}


	public void setBeneficeNet(double beneficeNet) {
		this.beneficeNet = beneficeNet;
	}

	

}