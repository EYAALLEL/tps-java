package tp4_2;

public class Salarie {
	protected int matricule;
	protected String nom;
	protected int recrutement;
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getRecrutement() {
		return recrutement;
	}
	public void setRecrutement(int recrutement) {
		this.recrutement = recrutement;
	}
	@Override
	public String toString() {
		return "Salarie matricule=" + matricule + ", nom=" + nom + ", recrutement=" + recrutement ;
	}
	public void affiche() {
		System.out.println(toString());
	}
	public double salaire() {
		if (recrutement<2005) {
			return 400;
	
		}
		else {
			return 280;
		}
		
	}
	public Salarie(int matricule, String nom, int recrutement) {
		this.matricule = matricule;
		this.nom = nom;
		this.recrutement = recrutement;
	}
	
	
	

}
