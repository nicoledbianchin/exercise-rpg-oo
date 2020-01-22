package main.java.bianchin.nicole.domain;

public class Characters {

    private String name;
    private Points points;
    private Weapon weapon;
    private Armor armor;

    public Characters(String name, Points points, Weapon weapon, Armor armor) {
        this.name = name;
        this.points = points;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public Points getPoints() {
        return points;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }
}
