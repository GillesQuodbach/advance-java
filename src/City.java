public class City {
	// attributs
	public String cityName;
	public String countryName;
	private int cityResident;
	static int counter = 0;

	// constructeurs
	public City(String cityName, String countryName, int cityResident) {
		this.cityName = cityName;
		this.countryName = countryName;
		this.cityResident = cityResident;
		counter++;
	}
	
	// Partie 1.3
		public City(String cityName, int cityResident) {
			this.cityName = cityName;
			this.countryName = "unknown";
			this.cityResident = cityResident;
		}
		
		
	// Partie 1.9
		public City(String cityName, String countryName) {
			this.cityName = cityName;
			this.countryName = countryName;
		}
		
		

	// méthodes
	public void displayCity() {
		System.out.println("ville de " + this.cityName + " en " + this.countryName + " ayant " + this.cityResident + " habitants.");
	}

	public static int getCounter() {
		return City.counter;
	}

	// accesseurs

	// City name
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	// Country name
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	// City resident
	public int getCityResident() {
		return cityResident;
	}

	public void setCityResident(int cityResident) throws Exception{
		if (cityResident < 0) {
		 throw new Exception("La population ne peut pas decroitre, merci d'entrer un nombre d'habitant valide !");
			
		} else {
			this.cityResident += cityResident;
		}
	}
	
	

	public String toString() {
	return "Ville de naissance : " + this.cityName + " , " + this.countryName + "" + ((this.cityResident != 0) ? " " : "," + this.cityResident + " habitants.");
	}
	
	

}