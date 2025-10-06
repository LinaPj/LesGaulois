package personnages;

import objets.Chaudron;


public class Druide
{
	private String nom;
	private int force;
	private Chaudron chaudron;

	
	
	public Druide(String nom, int force,Chaudron chaudron) 
	{
		this.nom = nom;
		this.force = force;
		this.chaudron=chaudron;
	}


	public String getNom() 
	{
		return nom;
	}

	public void parler(String texte) 
	{
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}


	private String prendreParole() 
	{
		
		return "Le Druide " + nom + " : ";
	}
 
	public void fabriquerPotion(int quantite, int forcePotion )
	{
		chaudron.remplirChaudron(quantite, forcePotion);
		
		
	}


	
	
	
	public void boosterGaulois(Gaulois gaulois) {
	    if (!chaudron.resterPotion()) 
	    {
	        parler("Désolé " + gaulois.getNom() + ", il n’y a plus une seule goutte de potion.");
	    } else if (gaulois.getNom().equals("Obélix")) {
	        parler("Non, Obélix ! Tu le sais très bien !");
	    } else 
	    {
	        int forcePotion = chaudron.prendreLouche();
	        gaulois.boirePotion(forcePotion);
	        parler("Tiens, " + gaulois.getNom() + ", un peu de potion magique.");
	    }
	}


}
