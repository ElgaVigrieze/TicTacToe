package com.company;

public class Main {


    public static void main(String[] args) throws Exception {
        var game = new Game();
        Player player = new Player(game.playerChooseId());
        Player computer = new Player(game.determineComputerID(player));

        game.playGame(player, computer);
        }






















    }





