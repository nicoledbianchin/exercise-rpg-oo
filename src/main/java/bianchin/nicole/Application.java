package main.java.bianchin.nicole;

import main.java.bianchin.nicole.service.CharacterCreatorService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterCreatorService characterCreatorService = new CharacterCreatorService();

        System.out.println("Escolha o tipo de personagem: ");
        System.out.println("1 - Personagem de defesa");
        System.out.println("2 - Personagem de ataque");

        int entrada = scanner.nextInt();

        if (entrada == 1){
            System.out.println(characterCreatorService.createDefenseCharacter());
        } else {
            System.out.println(characterCreatorService.createAttackCharacter());
        }
    }

}
