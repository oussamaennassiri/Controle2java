import java.time.LocalDate;
import java.time.LocalDate;
import java.util.Date;

public class Primeurs extends Article implements Produits{
	private Date datePeremption;
	

	public Primeurs() {
		
	}
	public Primeurs(Date datePeremption) {
		this.datePeremption = datePeremption;
	}
	
	public Primeurs(double prixAchat, double prixVente, String nom, String fournisseur, double qte,Date datePeremption) {
		super(prixAchat,prixVente,nom,fournisseur,qte);
		this.datePeremption = datePeremption;
		
	}
	
	public Date datePeremption() {
		return datePeremption;
	}
	
	public int joursRestants() {
		
		//LocalDate dateActuel=LocalDate.now();
		Date date=new Date(2021,12,29);
		
		//nbrJours=datePeremption.getYear()-dateActuel.getYear();
		long diff = datePeremption.getTime() - date.getTime();
		
		return (int) (diff / 1000/60/60/ 24);
	}
	
	
	
	public void setDatePeremption(Date datePeremption) {
		this.datePeremption = datePeremption;
	}
	@Override
	public double calculateurTauxRendement() {
		return super.getPrixVente()-super.getPrixAchat();
	}
	@Override
	public String affichageCaracteristiquesProduit() {
		return "Primeurs [" + super.affichageCaracteristiquesProduit()
				+ ", datePeremption = " + datePeremption + "]";
	}
	
	public Date getDatePeremption() {
		return datePeremption;
	}
	
	
	
	

}
