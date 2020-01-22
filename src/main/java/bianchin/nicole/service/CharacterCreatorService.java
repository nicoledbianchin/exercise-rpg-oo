package main.java.bianchin.nicole.service;

import main.java.bianchin.nicole.domain.Armor;
import main.java.bianchin.nicole.domain.Characters;
import main.java.bianchin.nicole.domain.Points;
import main.java.bianchin.nicole.domain.Weapon;

public class CharacterCreatorService {

    public Characters createDefenseCharacter(){
        Points characterPoints = new Points(50, 30, 2, 10);
        Weapon weapon = new Weapon("Faca de cozinha enferrujada", 30);
        Armor armor = new Armor("Armadura de Couro de Capivara", 50);
        Characters defenseCharacter = new Characters("Gaete, o monstro", characterPoints, weapon, armor);
        return defenseCharacter;
    }

}
