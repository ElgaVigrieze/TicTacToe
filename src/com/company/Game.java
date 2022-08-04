package com.company;

import java.util.*;

import static com.company.Field.*;

public class Game {
    PlayerMoves pm = new PlayerMoves();
    ComputerMoves cm = new ComputerMoves();

    public void playGame(Player player, Player computer) {
        String winner;
        do {
            pm.playerMove(player);
            winner = checkIfGameWon(computer, player);
            printField();
            if (winner != null) {
                whoWins(winner);
                break;
            }
            cm.computerMove(computer, player);
            winner = checkIfGameWon(computer, player);
            printField();
            if (winner != null) {
                whoWins(winner);
                break;
            }
        } while (true);
    }

    String determineComputerID(Player player) {
        if(Objects.equals(player.getId(), "x")){
           return "o";
        }
        if(Objects.equals(player.getId(), "o")){
            return "x";
        }
        return null;
    }

    String playerChooseId() {
       do {
           Scanner input = new Scanner(System.in);
           System.out.println("Please type \"x\" to play with x or \"o\" to play with o");
           String playerChoice = input.nextLine();
           try {
               if (Objects.equals(playerChoice, "x")) {
                   System.out.println("Congratulations, you've chosen x");
                   return "x";
               }
               if (Objects.equals(playerChoice, "o")) {
                   System.out.println("Congratulations, you've chosen o");
                   return "o";
               } else if (!Objects.equals(playerChoice, "o") && !Objects.equals(playerChoice, "x")) {
                   throw new Exception();
               }
           } catch (Exception ex) {
               System.out.println("Invalid input, try again");
           }
       } while(true);
    }

    private String checkIfGameWon(Player computer, Player player){
        String compId = computer.getId();
        String playerId = player.getId();
        String winner = null;

        // horizontal
        int countCompId = 0;
        int countPlayerId = 0;
        for (int i = 0; i < 3; i++) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        countCompId = 0;
        countPlayerId = 0;
        for (int i = 3; i < 6; i++) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        countCompId = 0;
        countPlayerId = 0;
        for (int i = 6; i < 9; i++) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        // vertical
        countCompId = 0;
        countPlayerId = 0;
        for (int i = 0; i < 7; i+=3) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        countCompId = 0;
        countPlayerId = 0;
        for (int i = 1; i < 8; i+=3) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        countCompId = 0;
        countPlayerId = 0;
        for (int i = 2; i < 9; i+=3) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        // diagonal
        countCompId = 0;
        countPlayerId = 0;
        for (int i = 2; i < 7; i+=2) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }

        countCompId = 0;
        countPlayerId = 0;
        for (int i = 0; i < 9; i+=4) {
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(playerId)){
                countPlayerId++;
            }
        }
        if(countCompId == 3){
            winner = "computer";
        }
        if(countPlayerId == 3){
            winner = "player";
        }
        int countAvSq = 0;
        for (String availableSquare : availableSquares) {
            if (availableSquare.equals("n/a")) {
                countAvSq++;
            }
        }
        if(countAvSq == 9){
            winner = "tie";
        }
        return winner;
    }

    private void whoWins(String winner){
        switch (winner) {
            case "player" -> System.out.println("Congratulations! You win!");
            case "computer" -> System.out.println("You lose!");
            case "tie" -> System.out.println("The game is tied!");
        }
    }
}
