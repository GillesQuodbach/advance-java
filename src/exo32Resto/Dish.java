package exo32Resto;

public class Dish {

	private String name;
	private double cost;
	
	public Dish(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return name + ((cost)==0 ? "" :  ": " +cost + "€");
	}
	
}
