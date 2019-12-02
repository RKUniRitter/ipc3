public class Main {

	public static void main(String[] args) {

		Processo pa = new Processo("A");
		Processo pb = new Processo("B");

		Thread ta = new Thread(new Processo ("A"));
		Thread tb = new Thread(new Processo ("B"));

		ta.start();
		tb.start();
		
		try {
			ta.join();
			tb.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Count: " +Shared.count);

	}

}
