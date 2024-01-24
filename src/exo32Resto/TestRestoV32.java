package exo32Resto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
import java.util.Map.Entry;


public class TestRestoV32 {
	public static void main(String[] args) {
		
		//Liste des choix des clients
		HashMap<Integer, Dish[]> choicesList = new HashMap<>();
		
		//Tableau des plats
		List<Dish> listeEntrees = new ArrayList<Dish>();
		List<Dish> listePlats = new ArrayList<Dish>();
		List<Dish> listeAccompagnements = new ArrayList<Dish>();
		List<Dish> listeBoissons = new ArrayList<Dish>();
		List<Dish> listeDesserts = new ArrayList<Dish>();
		
		//Liste des entrée
		listeEntrees.add(new Dish("SALADE", 12.0));
		listeEntrees.add(new Dish("SOUPE", 15.0));
		listeEntrees.add(new Dish("QUICHE", 13.0));
		listeEntrees.add(new Dish("AUCUNE", 0.0));
		//Liste des plats
		listePlats.add(new Dish("POULET", 20.0));
		listePlats.add(new Dish("BOEUF", 30.0));
		listePlats.add(new Dish("POISSON", 35.0));
		listePlats.add(new Dish("VEGETARIEN", 25.0));
		listePlats.add(new Dish("VEGAN", 50.0));
		listePlats.add(new Dish("AUCUN", 0.0));
		//Les des accompagnements
		listeAccompagnements.add(new Dish("RIZ", 5.0));
		listeAccompagnements.add(new Dish("PATES", 5.0));
		listeAccompagnements.add(new Dish("FRITES", 8.0));
		listeAccompagnements.add(new Dish("LEGUMES", 10.0));
		listeAccompagnements.add(new Dish("AUCUN", 0.0));
		//Liste des boissons
		listeBoissons.add(new Dish("EAU PLATE", 5.0));
		listeBoissons.add(new Dish("EAU GAZEUSE", 6.0));
		listeBoissons.add(new Dish("SODA", 5.0));
		listeBoissons.add(new Dish("VIN", 8.0));
		listeBoissons.add(new Dish("AUCUN", 0.0));
		//Liste des desserts
		listeDesserts.add(new Dish("TARTE MAISON", 10.0));
		listeDesserts.add(new Dish("MOUSSE AU CHOCOLAT", 10.0));
		listeDesserts.add(new Dish("TIRAMISU", 10.0));
		listeDesserts.add(new Dish("AUCUN", 10.0));
		System.out.println("********TEST ENTREE******" + listeEntrees.get(0));

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

		Scanner scan = new Scanner(System.in);

		int numberOfMenu = scan.nextInt();

		for (int i = 0; i < numberOfMenu; i++) {

			int key = i + 1;

			System.out.println("Commande numéro " + (i + 1));

			System.out.println("Choix entrée :");
			RestoV32.displayMenu(listeEntrees);

			System.out.println("Que souhaitez vous comme entrée ? [saisir le chiffre correspondant]");
			choixEntree = scan.nextInt();

			while (choixEntree > listeEntrees.size()) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixEntree = scan.nextInt();

			}

			System.out.println("Choix plats :");
			RestoV32.displayMenu(listePlats);
			System.out.println("Que souhaitez vous comme plats ? [saisir le chiffre correspondant]");
			choixPlats = scan.nextInt();

			while (choixEntree > listePlats.size()) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixPlats = scan.nextInt();

			}

			System.out.println("Choix accompagnements :");
			RestoV32.displayMenu(listeAccompagnements);
			System.out.println("Que souhaitez vous comme accompagnements ? [saisir le chiffre correspondant]");
			choixAccompagnements = scan.nextInt();

			while (choixAccompagnements > listeAccompagnements.size()) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixAccompagnements = scan.nextInt();

			}
			System.out.println("Choix boissons :");
			RestoV32.displayMenu(listeBoissons);
			System.out.println("Que souhaitez vous comme boissons ? [saisir le chiffre correspondant]");
			choixBoissons = scan.nextInt();

			while (choixBoissons > listeBoissons.size()) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixBoissons = scan.nextInt();

			}

			System.out.println("Choix desserts :");
			RestoV32.displayMenu(listeDesserts);
			System.out.println("Que souhaitez vous comme desserts ? [saisir le chiffre correspondant]");
			choixDesserts = scan.nextInt();

			while (choixDesserts > listeDesserts.size()) {
				System.out.println("!!! saisie incorrect, merci de la modifier: !!!");
				choixDesserts = scan.nextInt();

			}

			Dish[] orderToAdd = { listeEntrees.get(choixEntree - 1), listePlats.get(choixPlats - 1),
					listeAccompagnements.get(choixPlats - 1), listeBoissons.get(choixBoissons - 1),
					listeDesserts.get(choixDesserts - 1) };

			choicesList.put(i + 1, orderToAdd);
for(int index = 0; index < orderToAdd.length;index++) {
	System.out.println("********" + orderToAdd[i]);
}
			// Exercice 3.1 => fichier menu

			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter("order.txt"));

				for (Entry<Integer, Dish[]> entry : choicesList.entrySet()) {
					int orderNbr = entry.getKey();
					Dish[] values = entry.getValue();
					writer.write("****************Résumé de la commande N" + orderNbr + "********************");
					writer.write("\n");
					writer.write(values[0] + "\n");
					writer.write(values[1] + "\n");
					writer.write(values[2] + "\n");
					writer.write(values[3] + "\n");
					writer.write("\n\n");
				}

			} catch (Exception e) {
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
		}
		;

	}

}
