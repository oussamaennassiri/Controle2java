import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//on va cree deux objet primeurs electromenqges
		Primeurs p1=new Primeurs(100, 190, "pomme de tere","fournisseur1", 80, new Date(2022,03,02));
		Electromenagers e1 = new Electromenagers(200, 290, "machine a laver", "siera ", 20, "siera", 220);
		Magasin mag=new Magasin();
		
		System.out.println("taux de rendement  : "+p1.calculateurTauxRendement());
		
		
		System.out.println(e1.affichageCaracteristiquesProduit());
        System.out.println("le nombre de jour rester :");
		System.out.println(p1.joursRestants()+" jours");
		
		
		e1.lancerSolde(10);
		System.out.println(e1.getPrixVente());
		
		
		e1.terminerSolde(30);
        System.out.println("le prix de vente et le solde terminer :");
		System.out.println(e1.getPrixVente());
				
        // approvisionner les produits
		mag.approvisionner(p1.getNom(), p1.getQte());
		mag.approvisionner(e1.getNom(), e1.getQte());
		//vender article
		mag.vendreArticles(p1.getNom(), p1.getQte());
	
		//les articles en rupture en stock
		mag.listerArticlesRuptureEnStock();
		
		//les articles disponibles en stock
		mag.listerLesArticlesDisponibleEnStock();
		
		// quantit En Stock Par nom Article exempne 
		mag.quantitEnStockParArticle("pomme de tere");
		
		// l'état du magasin
		mag.descriptionEtatMagasin();
		
		//calculer du taux de rendement
		
		System.out.println(mag.calculateurDuTauxDeRendement());
		
		
		
		

	}

}
