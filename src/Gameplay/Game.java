package Gameplay;


import java.awt.*;

class Game{


    /*
     _ Save Game System:
     _ 1. Connect with MongoDB
     _ _ _ Player state, Opponent states
     _ _ _ Body, Health, Physics, View, Weapon
     _ _ _ Time, Map coordinates
     _ 2. Save everything in MongoDB
     _ 3. Save to Main List
     */

    // GAME STATES
    private boolean paused;
    private boolean playing;
    private boolean gameOver;

    // GAME VARIABLES
    private String name = "default_game";

    // CONSTRUCTOR
    public Game(String name){
        this.name = name;
        this.gameCreated(name);
    }

    // BASIC METHODS
    private void gameCreated(String gameName){
        System.out.println("Created a new Game : " + gameName);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                '}';
    }

    // GAME LOGIC METHODS
    private void gameStarts(){
        this.paused = false;
        this.playing = true; // paused still == playing
        this.gameOver = false;
    }
    private void gameEnds(){ this.gameOver = true; }
    private void togglePause(){ this.paused = !this.paused; }
    private void saveGame() {
        // TODO : save game functionality after database integration.
    }
    boolean gameValidated(Main.validationHelper validator){
        return validator.helpValidation();
    }
    void gameInitialize(){
        // TODO : 1) Reset everything to zero or continue
        // TODO : 2) Get all the data from the database about a game state.
        // TODO : 3) If new game then continue
    }

    // GAME STARTS
    public void gameLoop(){
        /*
        EVERYTHING that happens during the game happens in
        this function
         */
        gameStarts();

    }
}




































