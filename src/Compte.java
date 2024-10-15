package tp5;

public class Compte {
    private static int compteur = 0; 
    private int numero;
    private double solde = 0.0;
    private Personne titulaire;
    private double decouvertMax = 800;
    private double debitMax = 1000;

    
    public Compte(Personne titulaire) {
        this.numero = ++compteur;
        this.titulaire = titulaire;
    }

 
    public Compte(Personne titulaire, double decouvertMax, double debitMax) {
        this(titulaire);
        this.decouvertMax = decouvertMax;
        this.debitMax = debitMax;
    }

  
    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public double getDebitMax() {
        return debitMax;
    }


    public void setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public void setDebitMax(double debitMax) {
        this.debitMax = debitMax;
    }

    
    @Override
    public String toString() {
        return "Compte N°" + numero + " | Titulaire: " + titulaire + 
               "| Solde: " + solde + " | Découvert Max: " + decouvertMax + 
               "|Débit Max: " + debitMax;
    }


    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
        }
    }

   
    public boolean debiter(double montant) {
        if (montant > 0 && montant <= debitMax && (solde - montant + decouvertMax > 0)) {
            solde -= montant;
            return true;
        }
        return false;
    }

    
    public boolean estADecouvert() {
        return solde < 0;
    }

   
    public double montantDecouvert() {
        return Math.abs(Math.min(solde, 0));
    }

    public void virement(double montant, Compte autreCompte) {
        if (this.debiter(montant)) {
            autreCompte.crediter(montant);
        }
    }

    public static void virement(double montant, Compte source, Compte destination) {
        if (source.debiter(montant)) {
            destination.crediter(montant);
        }
    }}
