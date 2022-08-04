package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.Field.availableSquares;
import static com.company.Field.squares;

public class PlayerMoves {

    public void playerMove(Player player) {
        String playerChoice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Your move, please choose a square " + Arrays.toString(availableSquares));
            playerChoice = input.nextLine();

            try {
                int pc = Integer.parseInt(playerChoice);
                if ((pc > 0) && (pc <= 9)) {
                    break;
                }else{
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect input, input in range 1-9");
                System.out.println();
            }
        } while (true);
        playerSquare(playerChoice, player);
    }

    public void playerSquare(String playerChoice, Player player){
        String playerChoice1 = availableSquares[Integer.parseInt(playerChoice)-1];

        switch (playerChoice1) {
            case "1" -> {
                squares[0] = player.getId();
                availableSquares[0] = "n/a";
            }
            case "2" -> {
                squares[1] = player.getId();
                availableSquares[1] = "n/a";
            }
            case "3" -> {
                squares[2] = player.getId();
                availableSquares[2] = "n/a";
            }
            case "4" -> {
                squares[3] = player.getId();
                availableSquares[3] = "n/a";
            }
            case "5" -> {
                squares[4] = player.getId();
                availableSquares[4] = "n/a";
            }
            case "6" -> {
                squares[5] = player.getId();
                availableSquares[5] = "n/a";
            }
            case "7" -> {
                squares[6] = player.getId();
                availableSquares[6] = "n/a";
            }
            case "8" -> {
                squares[7] = player.getId();
                availableSquares[7] = "n/a";
            }
            case "9" -> {
                squares[8] = player.getId();
                availableSquares[8] = "n/a";
            }
            case "n/a" -> {
                System.out.println("Square already taken, please choose another one");
                playerMove(player);
            }
        }
    }
}
