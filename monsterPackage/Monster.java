package monsterPackage;

/**
 * @author 
 */

public class Monster
{
    //Instance variables

    private double health;
    private double strength;
    private String name;

    //Constructors
    
    public Monster()
    {
        health = 0.0;
        strength = 0.0;
        name = "";
    }

    public Monster(double newHealth, double newStrength, String newName)
    {
        health = newHealth;
        strength = newStrength;
        name = newName;
    }

    //Instance methods
    public String getName()
    {
    	return name;
    }

    public void setName(String newName)
    {
		name = newName;
   
    }
    public double getHealth()
    {
        return health;
    }
    
    public double getStrength()
    {
    	return strength;
    }

    public void setHealth(double newHealth)
    {
        health = newHealth;
    }
    
    public void setStrength(double newStrength)
    {
    	strength = newStrength;
    }
    
    public double attack()
    {
    	return Math.random() * Monster.getStrength();
    }
    
    public void takeDamage(double damage)
    {
    	Monster.setHealth = Monster.getHealth - damage;
    }
    
    public boolean isAlive()
    {
    	if(Monster.getHealth > 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

