import java.util.Date;

public class AdvEx1Excep {

	public static void main(String[] args) {
	// Exercice 1.1
		// getClass() vient de la class Object
		
		Date date = null;
		Date today = new Date();
		try {
			System.out.println(date.getClass().getName());
			System.out.println(today.getClass().getName());
		} catch (NullPointerException e){
			System.out.println("Oups, votre date n'existe pas !");
		} finally {
			System.out.println(today.getClass().getName());
		}
	}

}
