import java.util.Arrays;

public class RepiseExoOperation{	
	public static void mul(double arg1, double arg2) {
		try {
		double total = arg1 * arg2;
		System.out.println(total);
		} catch (Exception e) {
		System.out.println("Oups quelque chose de bizarre est arrivé...");
		}
		
	}
	
	// Utilisation de throw et throws
	public static void div(double arg1, double arg2) throws ArithmeticException {
		if(arg2 == 0) throw new ArithmeticException("**La division par 0 est imposible**");
		double total = arg1 / arg2;
		System.out.println(total);
	}
	

	public static void calcArray(Integer[] array) {
		Arrays.sort(array);
		int sum = (array[array.length - 1] + array[array.length - 2]);
		System.out.println("La somme des 2 nombres max est: " + sum);
	}
	
	
	public static void main(String[] args) {
		
		Integer[] testArray = {78,6,-250,2,12,9};
		System.out.println(Arrays.toString(testArray));
		
//		add(10,10);
//		sub(10,5);
//		mul(2,10);
		div(10,0);
		
		calcArray(testArray);
	}

}
