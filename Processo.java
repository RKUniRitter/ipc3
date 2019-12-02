class Processo implements Runnable {

	private static boolean ca, cb;
	String nome;

	public Processo(String nome) {
			this.nome = nome;
			ca = false;
			cb = false;
		}

	public void run() {
		if (nome == "A")
			for (int i=0; i<250; i++) {
				ca = true;
				while (cb) ; 
				System.out.println("A dentro da sessão crítica");
				Shared.count++;
				ca = false;
				System.out.println("A saiu da sessão crítica");
			} 
		else
			for (int i=0; i<250; i++) {
				cb = true;
				while (ca) ;
				System.out.println("B dentro da sessão crítica");
				Shared.count++;
				cb = false;
				System.out.println("B saiu da sessão crítica");
			}
	}

}
