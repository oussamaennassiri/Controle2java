import java.util.Date;

public class Test {

	public static void main (String [] args) {
		
		Associe oussama = new Associe(200 , "ENNASSIRI", "Oussama",  new Date(2001 , 02 , 14 ), 8000, 10000, 50) ;
		Cadre anas = new Cadre (500 , "ENNASSIRI", "Anas", new Date(1996 , 12 , 30), 4) ;
		Ouvrier amine = new Ouvrier(700 ,"ENNASSIRI", "Amine",  new Date(1990 , 06 , 22),new Date ( 2012 , 12 , 24 ) ) ; 
		 
		System.out.println("le salaire de l'asssocie : " + oussama.getNom()+ "  " + oussama.getPrenom() + "  " + oussama.getSalaire()) ; 
		System.out.println("le salaire du cadre : " + anas.getNom()+ "  " +anas.getPrenom()+ "  " +anas.getSalaire()) ; 
		System.out.println("le salaire du ouvrier : " +amine.getNom()+ "  " +amine.getPrenom()+ "  " +amine.getSalaire()) ; 
		
	}

	
	
	
}