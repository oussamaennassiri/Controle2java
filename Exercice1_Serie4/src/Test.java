
public class Test {
	
public static void main(String[] args) throws PilePleine{
	int[] myStringArray = {1, 2 , 3, 4 , 5 , 6 , 7 , 8, 9, 10 , 11 , 12 , 13};
		
		Pile p = new Pile();

		
		for ( int i=0; i<myStringArray.length; i++ ) {
		    System.out.print( myStringArray[ i ] );
		}
		
	try {
		
			for(int i=0;i<myStringArray.length;i++)
				p.empile(myStringArray[i]);
				
				
				
}

catch(PilePleine e) {
	System.out.println(" : pile pleine"); 
	
};

try {
	
for(;;) {
	 
	System.out.print(p.depile());
}

}

catch(PileVide e) { 
	System.out.println(); 
	}
}







}



