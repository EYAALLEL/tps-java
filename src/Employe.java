package tp4_2;

public class Employe extends Salarie {
	private double hsupp;
	private double pHsupp;
	
	public double getHsupp() {
		return hsupp;
	}

	public void setHsupp(double hsupp) {
		this.hsupp = hsupp;
	}

	public double getpHsupp() {
		return pHsupp;
	}

	public void setpHsupp(double pHsupp) {
		this.pHsupp = pHsupp;
	}

	public Employe(int matricule, String nom, int recrutement, double hsupp, double pHsupp) {
		super(matricule, nom, recrutement);
		this.hsupp = hsupp;
		this.pHsupp = pHsupp;
	}
	@Override
	public String toString() {
		return " Employe hsupp=" + hsupp + ", pHsupp=" + pHsupp ;
	}
	public  void affiche() {
		
		System.out.println(super.toString()+toString());
		
	}
	public  double salaire() {
		double a;
		a=super.salaire();
		return a+pHsupp*hsupp;
		
	}
	
	
	

	
	
	

}
