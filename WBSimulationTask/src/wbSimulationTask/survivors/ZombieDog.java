package wbSimulationTask.survivors;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.commonFeatures.CommonInterface;

/*
* One of the enemy characters
*/

public class ZombieDog extends Common implements CommonInterface {

	
    private int health;
    private int attackPoint;
    public ZombieDog(int health, int attackPoint) {
        super("ZombieDog", health, attackPoint);
        this.health = health;
        this.attackPoint = attackPoint;
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }
    
    @Override
    public void health(int decrease) {
        this.health = health - decrease;
        setHealth(health);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getLocation() {
        return super.getLocation();
    }
    
    @Override
    public void setAttackPoint(int attackPoint) {
        super.setAttackPoint(attackPoint);
    }

    @Override
    public int getAttackPoint() {
        return super.getAttackPoint();
    }
}
