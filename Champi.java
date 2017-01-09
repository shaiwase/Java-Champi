import java.util.Scanner;

	public class Champi {
		
		public static void main(String[] args) {
	        
	        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
	        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
	        System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
	        Scanner clavier = new Scanner(System.in);
	        boolean place = clavier.nextBoolean();
	    
	        if (place == true) {
	            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
	            boolean convexe = clavier.nextBoolean();
	            
	            if (convexe == true) {
	                System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
	                boolean anneaux = clavier.nextBoolean();
	                
	                if (anneaux == true) {
	                    System.out.print("==> Le champignon auquel vous pensez est ");
	                    System.out.print("l'amanite tue-mouches");
	                    
	                } else {
	                    System.out.print("==> Le champignon auquel vous pensez est ");
	                    System.out.print("le pied bleu");
	                    }
	                
	             } else {
	                System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
	                boolean lamelles = clavier.nextBoolean();
	                
	                if (lamelles == true) {
	                    System.out.print("==> Le champignon auquel vous pensez est ");
	                    System.out.print("la girolle");
	                    
	                } else {
	                    System.out.print("==> Le champignon auquel vous pensez est ");
	                    System.out.print("le cèpe de Bordeaux");
	                }
	            }
	            
	           } else {
	            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
	            boolean convexe2 = clavier.nextBoolean();
	            
	            if (convexe2 == true) {
	                System.out.print("==> Le champignon auquel vous pensez est ");
	                System.out.print("l'agaric jaunissant");
	                
	            } else {
	                System.out.print("==> Le champignon auquel vous pensez est ");
	                System.out.print("le coprin chevelu");
	            }
	        }
	        clavier.close();
	    }
	}

