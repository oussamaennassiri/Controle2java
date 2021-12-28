import java.util.ArrayList;



public class Magasin extends Article{
	private ArrayList<Double> qteStock = new ArrayList<Double>();
	private int nbrPieceElectro;
	private int nbrKiloPrimeurs;
	private ArrayList<Article> produitsVendus = new ArrayList<Article>();
	private ArrayList<Article> produitsEnStock = new ArrayList<Article>();
	private ArrayList<Article> artRupture = new ArrayList<Article>();
	
	
	public Magasin(ArrayList<Double> qteStock, int nbrPieceElectro, int nbrKiloPrimeurs,
			ArrayList<Article> produitsVendus, ArrayList<Article> produitsEnStock) {
		
		this.qteStock = qteStock;
		this.nbrPieceElectro = nbrPieceElectro;
		this.nbrKiloPrimeurs = nbrKiloPrimeurs;
		this.produitsVendus = produitsVendus;
		this.produitsEnStock = produitsEnStock;
	}
	public Magasin() {
		
	}
	
	public void remplirTabProduitsEnStock(Article article) {
		produitsEnStock.add(article);
	}
	public void remplirTabProduitsVendu(Article article) {
		produitsVendus.add(article);
	}
	public void remplirTabQteStock(Article article) {
		qteStock.add(article.getQte());
	}
	
	public void vendreArticles(String nom,double qte) {
		for(int i=0;i<getProduitsEnStock().size();i++) {
			if(this.getProduitsEnStock().get(i).getNom()==nom && this.getQteStock().get(i)>=qte) {
				this.getProduitsVendus().add(this.getProduitsEnStock().get(i));
				this.getArtRupture().add(this.getProduitsEnStock().get(i));
				this.getProduitsEnStock().remove(i);
				
				if(this.getQteStock().get(i)==qte) {
					this.getQteStock().remove(i);
				}
				else {
					double q;
				   q=this.getQteStock().get(i)-qte;
				   this.getQteStock().remove(i);
				   this.getQteStock().add(q);
				}
				}		
			}	//		
		}	
	
    public void approvisionner(String nom,double qte) {
    	Article art=new Article(nom, qte);
        //Article art=new Article(0, 0, nom,null, qte);
    	this.remplirTabProduitsEnStock(art);
    	this.remplirTabQteStock(art);
    	
    }
	
    
   public void listerArticlesRuptureEnStock() {
	   if(this.getArtRupture()==null){
			System.out.println("aucun Article rupture");	
		}
		else {
			for(int i=0;i<getArtRupture().size();i++) {
				System.out.println(this.getArtRupture().get(i).affichageCaracteristiquesProduit());
				
			}
		}
				
	}
   public void listerLesArticlesDisponibleEnStock() {
	   if(this.getProduitsEnStock()==null)	{
			System.out.println("aucun produit en stock");
			
		}
		else {
			for(int i=0;i<getProduitsEnStock().size();i++) {
				
				System.out.println(this.getProduitsEnStock().get(i).affichageCaracteristiquesProduit());
			}
			
		}
		
	}
   
   public void quantitEnStockParArticle(String nom) {
	   for(int i=0;i<getProduitsEnStock().size();i++) {
		   if(this.getProduitsEnStock().get(i).getNom()==nom) {
			   System.out.println("la Quantité en stock de l'article nommé "+nom+" est "+this.getProduitsEnStock().get(i).getQte());
			  
		   }
	   }
   }
    
   public void descriptionEtatMagasin() {
	   System.out.println("Etat Magasin");
	   System.out.println("les articles Disponible en Stock : ");
	   this.listerLesArticlesDisponibleEnStock();
	   System.out.println("les articles Vendu:");
	   this.listerArticlesRuptureEnStock();
   }
   
   public double calculateurDuTauxDeRendement() {
	   double sommePrixEnVent = 0;
	   double sommePrixEnAchat = 0;
	   for(int i=0;i<getProduitsVendus().size();i++) {
		   sommePrixEnVent += getProduitsVendus().get(i).getPrixVente();
	   }
	   for(int i=0;i<getProduitsVendus().size();i++) {
		   sommePrixEnAchat += this.getProduitsVendus().get(i).getPrixAchat();
		   }
	  return sommePrixEnVent-sommePrixEnAchat;
	  
	   
   }
		
	
	public ArrayList<Double> getQteStock() {
		return qteStock;
	}
	public void setQteStock(ArrayList<Double> qteStock) {
		this.qteStock = qteStock;
	}
	public int getNbrPieceElectro() {
		return nbrPieceElectro;
	}
	public int getNbrKiloPrimeurs() {
		return nbrKiloPrimeurs;
	}
	public void setNbrKiloPrimeurs(int nbrKiloPrimeurs) {
		this.nbrKiloPrimeurs = nbrKiloPrimeurs;
	}
	public ArrayList<Article> getProduitsVendus() {
		return produitsVendus;
	}
	public void setProduitsVendus(ArrayList<Article> produitsVendus) {
		this.produitsVendus = produitsVendus;
	}
	public ArrayList<Article> getProduitsEnStock() {
		return produitsEnStock;
	}
	public void setProduitsEnStock(ArrayList<Article> produitsEnStock) {
		this.produitsEnStock = produitsEnStock;
	}
	public void setNbrPieceElectro(int nbrPieceElectro) {
		this.nbrPieceElectro = nbrPieceElectro;
	}
	public ArrayList<Article> getArtRupture() {
		return artRupture;
	}
	public void setArtRupture(ArrayList<Article> artRupture) {
		this.artRupture = artRupture;
	}
	

	
	
	

}
