package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    // Constructeur
    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        assert isInvariantVerified() : "Force négative à la création !";
    }

    // Getters
    public String getNom() {
        return nom;
    }

    // Méthode parler
    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }

    // Recevoir un coup
    public void recevoirCoup(int forceCoup) {
        // Précondition
        assert forceCoup > 0 : "Force du coup non positive !";

        int ancienneForce = force;
        force -= forceCoup;

        if (force <= 0) {
            force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }

        // Postcondition
        assert force < ancienneForce : "La force n'a pas diminué !";
        assert isInvariantVerified() : "Invariant non respecté (force < 0)";
    }

    // Vérification de l’invariant
    private boolean isInvariantVerified() {
        return force >= 0;
    }

    
    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    equipements[nbEquipement] = equipement;
                    nbEquipement++;
                    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                }
                break;
            case 0:
                equipements[nbEquipement] = equipement;
                nbEquipement++;
                System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
                break;
        }
    }

    // Pour test
    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);

       

        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
    }
}

