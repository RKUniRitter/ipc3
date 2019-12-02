public class Main {

	public static void main(String[] args) {

		//Cria doduasis threads concorrentes
		Thread ta = new Thread(new Processo ("A"));
		Thread tb = new Thread(new Processo ("B"));

		//Inicia a execução das threads
		ta.start();
		tb.start();
		
		//Sincroniza as threads
		try {
			ta.join();
			tb.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Count: " +Shared.count);

	}

}
