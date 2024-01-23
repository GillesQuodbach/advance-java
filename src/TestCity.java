public class TestCity {

	public static void main(String[] args) {
		
		City toulouse = new City("Toulouse", "France", 500000);
		City marseille = new City("Marseille", "France", 870321);
		City lyon = new City("Lyon", "France", 522228);
		City metz = new City("Lyon", "France", 522228);

		// Sans accesseurs
//		toulouse.displayCity();
//		marseille.displayCity();
//		lyon.displayCity();
//		
//		toulouse.cityResident += 20000;
//		
//		toulouse.displayCity();
		
		// Avec accesseurs
//		toulouse.getCityName();
//		marseille.getCityName();
//		lyon.getCityName();
//		
//		toulouse.getCountryName();
//		marseille.getCountryName();
//		lyon.getCountryName();
//		
//		toulouse.getCityResident();
//		marseille.getCityResident();
//		lyon.getCityResident();
		
//		toulouse.cityResident = -20000;
		
//		System.out.println("La ville de " + toulouse.getCityName() + " a " + toulouse.getCityResident() + " habitants");

		// PARTIE 1.2
		
//		toulouse.setCityResident(-2000);
//		

		// PARTIE 1.3

	City rabat = new City("Rabat", 600000);
	System.out.println("[ville : " + rabat.getCityName() + "] " + "[pays : " + rabat.getCountryName() + "]" + "[nombre d'habitants :" + rabat.getCityResident() + "]");
	
	
	
	rabat.setCountryName("Maroc");
	try {
		rabat.setCityResident(-1000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("[ville : " + rabat.getCityName() + "] " + "[pays : " + rabat.getCountryName() + "]" + "[nombre d'habitants :" + rabat.getCityResident() + "]");
//	System.out.println(rabat);
	
//	toulouse.displayCity();
	
	
	// PARTIE 1.4 -> nous indique l'adresse m�moire de l'objet donc ne peut pas l'afficher
	System.out.println(toulouse);
	
	// PARTIE 1.7;
	System.out.println("Nombre de villes cr��es (attributs de class):" + City.counter);
	System.out.println("Nombre de villes cr��es (m�thode) : " + City.getCounter());
	}

}