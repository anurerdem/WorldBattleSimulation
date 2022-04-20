package wbSimulationTask.survivors;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.commonFeatures.CommonInterface;

/*
* One of the enemy characters
*/

public class Lion  extends Common implements CommonInterface {

    private int health;
    private int attackPoint;

    public Lion(int health, int attackPoint) {
        super("Lion", health, attackPoint);
        this.health = health;
        this.attackPoint = attackPoint;
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
    public void setLocation(int location) {
        super.setLocation(location);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }
    
    @Override
    public void setAttackPoint(int attackPoint) {
        super.setAttackPoint(attackPoint);
    }
    
    @Override
    public int getAttackPoint() {
        return super.getAttackPoint();
    }
    
    @Override
    public void health(int decrease) {
        this.health = health - decrease;
        setHealth(health);
    }

}
