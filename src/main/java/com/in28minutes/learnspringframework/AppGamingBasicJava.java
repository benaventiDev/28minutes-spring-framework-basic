package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();
        var packmanGame = new PackmanGame(); //1: Object creation
        var gameRunner = new GameRunner(packmanGame);
        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner class
        //The game is created and it is injected into the game runner class
        gameRunner.run();
    }
}
