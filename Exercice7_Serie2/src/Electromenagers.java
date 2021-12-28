
public class Electromenagers extends Article implements Susceptible  {
	private String marque;
	private double voltage;
	
	
	
	public Electromenagers(String marque, double voltage) {
		this.marque = marque;
		this.voltage = voltage;
	}

	public Electromenagers(double prixAchat, double prixVente, String nom, String fournisseur, double qte,String marque, double voltage) {
		super(prixAchat,prixVente,nom,fournisseur,qte);
		this.marque = marque;
		this.voltage = voltage;
		
	}

	@Override
	public String affichageCaracteristiquesProduit() {
		return ""+super.affichageCaracteristiquesProduit()+
				" marque " +getMarque()+" voltage "+getVoltage();
	}
	@Override
	public double calculateurTauxRendement() {
		return super.getPrixVente()-super.getPrixAchat();
	}

	public void lancerSolde(double pourcentageBaisse) {
		double prixApresReduit;
		prixApresReduit=this.getPrixVente()-(this.getPrixVente()*pourcentageBaisse)/100;
		this.setPrixVente(prixApresReduit);
	}
	
	public void terminerSolde(double pourcentageAugmente) {
		double prixSansReduit;
		prixSansReduit=this.getPrixVente()-(this.getPrixVente()*pourcentageAugmente)/100;
		this.setPrixVente(prixSansReduit);
		
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}



	
	
	
 
}
