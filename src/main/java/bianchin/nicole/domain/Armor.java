package main.java.bianchin.nicole.domain;

public class Armor {

    private String name;
    private int defensePoints;

    public Armor(String name, int defensePoints){
        this.name = name;
        this.defensePoints = defensePoints;
    }

    public String getName() {
        return name;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

}
