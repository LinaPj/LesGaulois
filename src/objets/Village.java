package objets;

import personnages.Gaulois;

public class Village 
{
	private String nom ;
	private int nbVillageois = 0 ;
	private Gaulois[] villageois;
	private Gaulois chef;
	
    private static final int NB_VILLAGEOIS_MAX = 30;

	
	

	public String getNom() 
	{
		return nom;
	}

	

	public Gaulois getChef() 
	{
		return chef;
	}
	
	
	
	
	public void ajouterVillageois(Gaulois gaulois) 
	{
		if (nbVillageois < NB_VILLAGEOIS_MAX) 
		{       
	        villageois[nbVillageois] = gaulois;        
	        nbVillageois++;                            
	        gaulois.setVillage(this);                  
	    } 
		else 
	    {
	        System.out.println("Le village est plein !");
	    }
	}

	public Gaulois trouverVillageois(int numVillageois) 
	{
		
		
		if (numVillageois >= 0 && numVillageois < nbVillageois) {
	        return villageois[numVillageois];
	    } else {
	        System.out.println("Aucun villageois trouvé à cet indice !");
	        return null;
	    }
		
		
	}
	
	public  void afficherVillage() 
	{
		System.out.println( );
		
	}
	
	
	

	
	
	
	
	
	

}
