package main.java.bianchin.nicole.domain;

public class Weapon {

    private String name;
    private int attackPoints;

    public Weapon(String name, int attackPoints){
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

}
