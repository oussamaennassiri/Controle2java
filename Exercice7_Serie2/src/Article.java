
public class Article {
	private double prixAchat;
	private double prixVente;
	private String nom;
	private String fournisseur;
	private double qte;
	public Article() {
		
	}
	
	
	public Article(String nom, double qte) {
		
		this.nom = nom;
		this.qte = qte;
	}


	public Article(double prixAchat, double prixVente, String nom, String fournisseur, double qte) {
		
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.nom = nom;
		this.fournisseur = fournisseur;
		this.qte = qte;
	}
	public double calculateurTauxRendement() {
		return getPrixVente()-getPrixAchat();
	}
	
	public String affichageCaracteristiquesProduit () {
		return "le prix d'achat "+getPrixAchat()+
				" le prix de vente "+getPrixVente()+" Nom :"+
				getNom()+" fournisseur "+getFournisseur() +" qte :" + getQte();
	}
   

	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	public double getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public double getQte() {
		return qte;
	}
	public void setQte(double qte) {
		this.qte = qte;
	}
	
	
	

}
