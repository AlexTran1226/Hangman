package com.company;

import java.util.Random;
public class Main {

    public static void main(String[] args) {

        //an array of strings
        String[] consoles = {
                "genesis",
                "xbox",
                "saturn",
                "atari",
                "gamecube",
                "playstation",
        };

        //gets a random number
        //consoles[1000]
        Random random = new Random();
        //int randomIndex = random.nextInt(consoles.length);
        String chosenConsole = consoles[random.nextInt(consoles.length)];

        // write your code here
        Game game = new Game("hello");
        Prompter prompter = new Prompter(game);


        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }

        prompter.displayOutcome();
    }
}

