
public class TestRunnable implements Runnable {
	
	@Override
	public void run() {
		// Affichage des colones
		for (int i = 1; i < 10;i++) {
			char symbol = (char) ('\u0020' + i);
			System.out.print(symbol);
			// Affichage des lignes
			for (int j = 0;j < i;j++) {
				System.out.print("*");
			}
			System.out.println(symbol);
		}
	}
	
	public static void main(String[] args) {
		
Thread thread = new Thread(new TestRunnable());
thread.start();
	}

}
