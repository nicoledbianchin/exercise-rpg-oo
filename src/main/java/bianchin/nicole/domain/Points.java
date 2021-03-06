package main.java.bianchin.nicole.domain;

public class Points {

    private int forcePoints;
    private int agilityPoints;
    private int charismaPoints;
    private int concentrationPoints;

    public Points(int forcePoints, int agilityPoints, int charismaPoints, int concentrationPoints){
        this.forcePoints = forcePoints;
        this.agilityPoints = agilityPoints;
        this.charismaPoints = charismaPoints;
        this.concentrationPoints = concentrationPoints;
    }

    public int getForcePoints() {
        return forcePoints;
    }

    public int getAgilityPoints() {
        return agilityPoints;
    }

    public int getCharismaPoints() {
        return charismaPoints;
    }

    public int getConcentrationPoints() {
        return concentrationPoints;
    }
}
