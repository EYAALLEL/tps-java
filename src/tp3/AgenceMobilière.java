package tp3;

public class AgenceMobilière {
	private véhicule tab[];
	private int max;
	private int nb;

	public AgenceMobilière(int max) {
		this.tab = new véhicule[max];
		this.max =max;
	}

	public void ajoutVéhicule(véhicule v) {
		if (nb < max) {
			tab[nb] = v;
			nb++;
		} else {
			System.out.println("pas de taille disponible");
		}

	}

	public void selection(int n) {
		if (n > 0 && n < nb) {
			tab[n - 1].descisVehicule();

		} else {
			System.out.println("la taille de tableau n'est pas disponible  ");

		}
	}

	public void selection(String mq) {
		int i;
		int nbm = 0;
		for (i = 0; i < nb; i++) {
			if (tab[i].getMarque().equals(mq)) {
				tab[i].descisVehicule();
				nbm++;
			}
		}
		if (nbm == 0) {
			System.out.println("n'a pas de voiture avec cette marque ");
		}
	}

	public void selection(Double px) {
		int i;
		int nbp = 0;
		for (i = 0; i < nb; i++) {

			if (tab[i].getPrix() < px) {
				tab[i].descisVehicule();
				nbp++;
			}
		}
		if (nbp == 0) {
			System.out.println("n'a pas de voiture avec cette prix ");
		}
	}

	public void affiche() {
		int i;
		for (i = 0; i < nb; i++) {
			tab[i].descisVehicule();
		}

	}
	public void plusancienne() {
		véhicule ancien =tab[0];
		int i;
		for (i=1;i<nb;i++) {
			if( ancien.getAnnée()>tab[i].getAnnée()) {
				ancien=tab[i];
			}
		}
		System.out.println(ancien);
	}
	

}
