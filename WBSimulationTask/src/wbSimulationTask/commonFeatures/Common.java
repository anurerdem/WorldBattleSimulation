package wbSimulationTask.commonFeatures;

import wbSimulationTask.commonFeatures.CommonInterface;

/**
 * This abstract class all the characters have common characteristics they have. Like name, health and location.
 * At the same time this field values are get and set.
 */

public abstract class Common implements CommonInterface {

    private String name;
    private int health;
    private int location;
    private int attackPoint;

	public Common(String name, int health, int attackPoint) {
        setName(name);
        this.health = health;
        this.attackPoint = attackPoint;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return this.location;
    }
    
    public int getAttackPoint() {
		return this.attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

    @Override
    public boolean isAlive() {
        return (getHealth() > 0);
    }
    
}
