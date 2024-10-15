package tp5;

public class Test {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[3];
        Personne titulaire1 = new Personne("eya", "allel", "soliman");
        comptes[0] = new Compte(titulaire1, 800, 1000);
        
        Personne titulaire2 = new Personne("amine", "chrigui", "soliman");
        comptes[1] = new Compte(titulaire2, 500, 800);
        
        Personne titulaire3 = new Personne("jassem", "allel", "soliman");
        comptes[2] = new Compte(titulaire3, 1000, 1500);

        
        comptes[0].crediter(500); 
        comptes[1].crediter(300); 

     
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }

      
        double montant = 200; 
        comptes[0].virement(montant, comptes[1]);

        
        System.out.println(" après le virement ");
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }

        
        Compte compteMax = comptes[0];
        for (int i = 1; i < comptes.length; i++) {
            if (comptes[i].getSolde() > compteMax.getSolde()) {
                compteMax = comptes[i];
            }
        }
        System.out.println("Titulaire avec le solde le plus élevé :");
        System.out.println(compteMax.getTitulaire());
    }
}



