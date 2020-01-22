package main.java.bianchin.nicole.service;

import main.java.bianchin.nicole.domain.Armor;
import main.java.bianchin.nicole.domain.Characters;
import main.java.bianchin.nicole.domain.Points;
import main.java.bianchin.nicole.domain.Weapon;

public class CharacterCreatorService {

    public String createDefenseCharacter(){
        Points characterPoints = new Points(50, 30, 2, 10);
        Weapon weapon = new Weapon("Faca de cozinha enferrujada", 30);
        Armor armor = new Armor("Armadura de Couro de Capivara", 50);
        Characters defenseCharacter = new Characters("Gaete, o monstro", characterPoints, weapon, armor);
        return formatOutput(defenseCharacter);
    }

    public String createAttackCharacter(){
        Points characterPoints = new Points(50, 30, 2, 10);
        Weapon weapon = new Weapon("Faca de cozinha enferrujada", 30);
        Armor armor = new Armor("Armadura de Couro de Capivara", 50);
        Characters attackCharacter = new Characters("ROmilda, a destruidora", characterPoints, weapon, armor);
        return formatOutput(attackCharacter);
    }

    public String formatOutput(Characters character){
        String result = character.getName() + "/nForça: " + character.getPoints().getForcePoints() + "/nAgilidade: " + character.getPoints().getAgilityPoints() + "/nCarisma: " + character.getPoints().getCharismaPoints() + "/nConcentração: " + character.getPoints().getConcentrationPoints() + "/nArma: " + character.getWeapon() + "/nArmadura: " + character.getArmor();
        return result;
    }

}
