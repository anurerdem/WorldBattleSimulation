package wbSimulationTask.survivors;

import wbSimulationTask.commonFeatures.Common;
import wbSimulationTask.commonFeatures.CommonInterface;

/*
* Our hero character
*/

public class Hero extends Common implements CommonInterface {

    private int health;
    private int attackPoint;

    public Hero(int health, int attackPoint) {
        super("Hero", health, attackPoint);
        this.health = health;
        this.attackPoint = attackPoint;
    }


    @Override
    public int getHealth() {
        return health;
    }
    
    @Override
    public void health(int decrease) {
        this.health = health - decrease;
        setHealth(health);
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    @Override
    public int getAttackPoint() {
        return super.getAttackPoint();
    }
}
