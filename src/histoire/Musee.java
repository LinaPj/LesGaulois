package histoire;

import personnages.Gaulois;
import objets.Equipement;

public class Musee {
    private Trophee[] trophees;
    private int nbTrophees;

    public Musee() {
        trophees = new Trophee[200];
        nbTrophees = 0;
    }

    public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
        if (nbTrophees < trophees.length) {
            trophees[nbTrophees] = new Trophee(gaulois, equipement);
            nbTrophees++;
        } else {
            System.out.println("c'est plein ");
        }
    }

    public String extraireInstructionsOCaml() {
        StringBuilder sb = new StringBuilder();
        sb.append("let musee = [\n");
        for (int i = 0; i < nbTrophees; i++) {
            Trophee t = trophees[i];
            sb.append("\"")
              .append(t.donnerNom())
              .append("\", \"")
              .append(t.getEquipement().toString())
              .append("\"");
            if (i < nbTrophees - 1) sb.append(";\n");
        }
        sb.append("\n]");
        return sb.toString();
    }
}
