package tp4_2;

public class Entreprise {

	private static final Vendeur NULL = null;

	public static void main(String[] args) {
		Salarie tabSalarie[]=new Salarie[5];
		tabSalarie[0]=new Employe(12345, "walid",2002, 15, 4);
		tabSalarie[1]=new Vendeur(23445, "Yassine",2007, 1000, 0.1);
		tabSalarie[2]=new  Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3]=new Employe(87698,"Aymen",2003,19,5);
		tabSalarie[4]=new Employe(12345,"Khaled",2008,7,4);
		System.out.println("liste des employe");
		for(int i =0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Employe) {
				tabSalarie[i].affiche();
				
			}
			
		}
		System.out.println("liste des vendeurs");
		for(int i =0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Vendeur) {
				tabSalarie[i].affiche();
				
			}
			
		}
		String n=tabSalarie[0].getNom();
		int min=tabSalarie[0].getRecrutement();
		for (int i =1;i<tabSalarie.length;i++) {
			if(min>tabSalarie[i].getRecrutement()) {
				min=tabSalarie[i].getRecrutement();
				n=tabSalarie[i].getNom();
				
			}
			
		}
		System.out.println( "le plus ancien salarie est "+n);
		Salarie maxv=NULL;
		for(int i=0;i<tabSalarie.length;i++) {
			if (tabSalarie[i] instanceof Vendeur) {
				if(maxv==NULL) {
					maxv=tabSalarie[i];
					
				}
				else if( tabSalarie[i].salaire()>maxv.salaire()) {
					maxv=tabSalarie[i];
				}
			}			
		}
		System.out.println( "Matricule du vendeur disposant du plus grand salaire "+maxv.getMatricule()+" le salaire est "+maxv.salaire());
		
	}
	
	
	

}
