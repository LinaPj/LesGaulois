package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import objets.Chaudron;

public class TestGaulois 
{
	
	
	
	
	public static void main(String[] args) 
	{
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romain minus = new Romain("Minus",6); //car Nom + force idem pour Gaulois

        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ça te dirais d'aller chasser des sangliers ?)");
        asterix.parler("Oui très bonne idée.");
        System.out.println("Dans la forêt" + asterix.toString() + "et" + obelix.toString() + "tombent nez à nez sur le romain Minus");
        asterix.frapper(minus);
        asterix.frapper(minus);
        asterix.frapper(minus);
        minus.parler("J'abandonne");
        
        
        // partie 2 
        
        Romain brutus = new Romain("Brutus", 14);
        Chaudron chaudron = new Chaudron(0, 0);
        Druide panoramix = new Druide("Panoramix", 2, chaudron);

        // préparer potion
        panoramix.fabriquerPotion(4, 3);

        // booster Obélix
        panoramix.boosterGaulois(obelix);

        // booster Astérix
        panoramix.boosterGaulois(asterix);

        // Astérix frappe Brutus 3 fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }

		
	}

}
