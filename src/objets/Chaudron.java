package objets;

public class Chaudron 
{
	int quantitePotion ;
	int forcePotion;
	
	
	public Chaudron(int quantitePotion, int forcePotion) 
	{
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	
	
	
	public void remplirChaudron(int quantite, int forcePotion)
	{
		this.quantitePotion=quantite;
		this.forcePotion=forcePotion;
		
		
		
	}
	
	public boolean resterPotion() 
	{
		return quantitePotion > 0;
		
	}
	
	
	public int prendreLouche() 
	{
	    if (quantitePotion > 0) 
	    {
	        quantitePotion--;        
	        return forcePotion;      
	    }
	    return 0; 
	}

	
	private int effetPotion = 1; 

	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	}


}
