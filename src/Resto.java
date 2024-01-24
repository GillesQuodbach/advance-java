import java.io.*;
import java.util.Scanner;

public class Resto {
	
	public static void displayMenu(String[] menuToDisplay) {
		for (int i = 0; i < menuToDisplay.length; i++) {
			int itemChoiceNumber = i + 1;
			System.out.print("[" + itemChoiceNumber + " - " + menuToDisplay[i] + "]");
		}
		System.out.println();
	}
	
	public static void resumeMenu(String[] menuToDisplay) {
		for (int i = 0; i < menuToDisplay.length; i++) {
			int itemChoiceNumber = i + 1;
			System.out.print("[" + itemChoiceNumber + " - " + menuToDisplay[i] + "]");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] listeEntrees = {"SALADE","SOUPE","QUICHE","AUCUNE"};
		String[] listePlats = {"POULET","BOEUF","POISSON","VEGETARIEN", "VEGAN", "AUCUN"};
		String[] listeAccompagnements = {"RIZ","PATES","FRITES", "LEGUMES","AUCUN"};
		String[] listeBoissons = {"EAU PLATE", "EAU GAZEUSE", "SODA","VIN","AUCUN"};
		String[] listeDesserts = {"TARTE MAISON","MOUSSE AU CHOCOLAT", "TIRAMISU", "AUCUN"};

	
	
		int choixEntree = 0;
		int choixPlats = 0;
		int choixAccompagnements = 0;
		int choixBoissons = 0;
		int choixDesserts = 0;
		
		boolean isChoixEntreeCorrect = false;
		boolean isChoixPlats = true;
		boolean isChoixAccompagnements = true;
		boolean isChoixBoissons = true;
		boolean isChoixDesserts = true;
		
		int counter = 0;
		
		System.out.println("bonjour, combien de menus souhaitez vous ?");
//		
		Scanner scan = new Scanner(System.in);
//		
		int numberOfMenu = scan.nextInt();
		
		for (int i = 0; i < numberOfMenu; i++) {
			System.out.println("Commande numéro " + (i + 1));
			
			System.out.println("Choix entrée :");
			displayMenu(listeEntrees);
			
			System.out.println("Que souhaitez vous comme entrée ? [saisir le chiffre correspondant]");
			choixEntree = scan.nextInt();
			while (choixEntree > listeEntrees.length) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixEntree = scan.nextInt();
			}
		
			System.out.println("Choix plats :");
			displayMenu(listePlats);
			System.out.println("Que souhaitez vous comme plats ? [saisir le chiffre correspondant]");
			choixPlats = scan.nextInt();
			
			while (choixEntree > listePlats.length) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixPlats = scan.nextInt();
			}
			
			System.out.println("Choix accompagnements :");
			displayMenu(listeAccompagnements);
			System.out.println("Que souhaitez vous comme accompagnements ? [saisir le chiffre correspondant]");
			choixAccompagnements = scan.nextInt();
			while (choixAccompagnements > listeAccompagnements.length) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixAccompagnements = scan.nextInt();
			}
			System.out.println("Choix boissons :");
			displayMenu(listeBoissons);
			System.out.println("Que souhaitez vous comme boissons ? [saisir le chiffre correspondant]");
			choixBoissons = scan.nextInt();
			
			while (choixBoissons > listeBoissons.length) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixBoissons = scan.nextInt();
			}
			
			System.out.println("Choix desserts :");
			displayMenu(listeDesserts);
			System.out.println("Que souhaitez vous comme desserts ? [saisir le chiffre correspondant]");
			choixDesserts = scan.nextInt();
			while (choixDesserts > listeDesserts.length) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixDesserts = scan.nextInt();
			}
			
			
			System.out.println("Resumé de la commande" + (counter + 1));
			System.out.println("[" + listeEntrees[choixEntree-1] + 
					", " + listePlats[choixPlats-1] + 
					", " + listeAccompagnements[choixPlats-1]  +
					", " + listeBoissons[choixBoissons-1]  +
					", " + listeDesserts[choixDesserts-1] + "]");
			System.out.println();
			
			
			// Exercice 3.1 => fichier menu
			
			BufferedWriter writer = null;
				try {
					writer = new BufferedWriter(new FileWriter("order.txt"));
					
					//écriture des menus dans le fichier
					writer.write("****************Résumé de la commande N" + counter + 1 + "********************");
					writer.write("\n");
					writer.write(listeEntrees[choixEntree-1] + 
							"\n" + listePlats[choixPlats-1] + 
							"\n" + listeAccompagnements[choixPlats-1]  +
							"\n" + listeBoissons[choixBoissons-1]  +
							"\n" + listeDesserts[choixDesserts-1] + "\n");
					writer.write("\n\n");
				
					
				}catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (writer != null) {
							writer.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				}
		};
		
		
		
	}
	

	
	

}
