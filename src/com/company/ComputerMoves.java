package com.company;

import java.util.ArrayList;

import static com.company.Field.availableSquares;
import static com.company.Field.squares;


public class ComputerMoves {

    public void computerMove(Player computer, Player user) {
        String compChoice = null;
        String compId = computer.getId();
        String userId = user.getId();
        compChoice = computerSearch(compChoice, compId, userId);

        switch (compChoice) {
            case "1" -> {
                squares[0] = computer.getId();
                availableSquares[0] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "2" -> {
                squares[1] = computer.getId();
                availableSquares[1] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "3" -> {
                squares[2] = computer.getId();
                availableSquares[2] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "4" -> {
                squares[3] = computer.getId();
                availableSquares[3] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "5" -> {
                squares[4] = computer.getId();
                availableSquares[4] = "n/a";
                System.out.println("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "6" -> {
                squares[5] = computer.getId();
                availableSquares[5] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "7" -> {
                squares[6] = computer.getId();
                availableSquares[6] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "8" -> {
                squares[7] = computer.getId();
                availableSquares[7] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "9" -> {
                squares[8] = computer.getId();
                availableSquares[8] = "n/a";
                System.out.print("Computer chooses square No.: ");
                System.out.println(compChoice);
            }
            case "n/a" -> computerMove(computer, user);
        }

    }

    private String computerSearch(String compChoice, String compId, String userId){

        ArrayList<String> cChoice1 = new ArrayList<>();
        ArrayList<String> cChoice2 = new ArrayList<>();
        ArrayList<String> cChoice3 = new ArrayList<>();
        ArrayList<String> cChoice4 = new ArrayList<>();

        int countUserId = 0;
        int countCompId = 0;
        int countNull = 0;


        //round 1 - diagonals

        for (int i = 0; i < 9; i+=4) {
            if(squares[i].equals(userId)){
                countUserId++;
            }
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(" ")){
                countNull++;
            }
        }
        if(countUserId == 2 && countNull == 1) {
            for (int i = 0; i < 9; i += 4) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if(countCompId == 2 && countNull == 1) {
            for (int i = 0; i < 9; i += 4) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        if(countCompId == 1 && countNull == 2) {
            for (int i = 0; i < 9; i += 4) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice3.add(compChoice);
                }
            }
        }

        countUserId = 0;
        countCompId = 0;
        countNull = 0;


        for (int i = 2; i < 7; i+=2) {
            if(squares[i].equals(userId)){
                countUserId++;
            }
            if(squares[i].equals(compId)){
                countCompId++;
            }
            if(squares[i].equals(" ")){
                countNull++;
            }
        }
        if(countUserId == 2 && countNull == 1) {
            for (int i = 2; i < 7; i += 2) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if(countCompId == 2 && countNull == 1) {
            for (int i = 0; i < 7; i += 2) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice2.add(compChoice);
                }
            }
        }

        if(countCompId == 1 && countNull == 2) {
            for (int i = 0; i < 7; i += 2) {
                if (squares[i].equals(" ")) {
                    compChoice = String.valueOf((i + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        countUserId = 0;
        countCompId = 0;
        countNull = 0;




// round 2 - horizontal
        for (int i = 0; i < 3; i++) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }
        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 0; j < 3; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 0; j < 3; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 0; j < 3; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        else if (countNull == 3) {
            for (int j = 0; j < 3; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }
        countNull = 0;
        countCompId = 0;
        countUserId = 0;

        // round 3 - horizontal
        for (int i = 3; i < 6; i++) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
        }

        for (int i = 3; i < 6; i++) {
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }

        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 3; j < 6; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 3; j < 6; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 3; j < 6; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        else if (countNull == 3) {
            for (int j = 3; j < 6; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }
        countNull = 0;
        countCompId = 0;
        countUserId = 0;

        // round 4 - horizontal
        for (int i = 6; i < 9; i++) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }

        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 6; j < 9; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }

        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 6; j < 9; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        } else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 6; j < 9; j++) {
                if (squares[j].equals(" ")) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        } else if (countNull == 3) {
            for (int j = 6; j < 9; j++) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }


        // round 5 - vertical
        for (int i = 0; i < 9; i+=3) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
        }
        for (int i = 0; i < 9; i+=3) {
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }
        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 0; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 0; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 0; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        else if (countNull == 3) {
            for (int j = 0; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }
        countNull = 0;
        countCompId = 0;
        countUserId = 0;

        for (int i = 1; i < 9; i+=3) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
        }
        for (int i = 1; i < 9; i+=3) {
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }
        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 1; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 1; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 1; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        else if (countNull == 3) {
            for (int j = 1; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }
        countNull = 0;
        countCompId = 0;
        countUserId = 0;

        for (int i = 2; i < 9; i+=3) {
            if (squares[i].equals(" ")) {
                countNull++;
            }
            if ((squares[i].equals(compId))) {
                countCompId++;
            }
            if ((squares[i].equals(userId))) {
                countUserId++;
            }
        }
        if ((countNull == 1) && (countUserId == 2)) {
            for (int j = 2; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice1.add(compChoice);
                }
            }
        }
        if ((countNull == 1) && (countCompId == 2)) {
            for (int j = 2; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice2.add(compChoice);
                }
            }
        }
        else if ((countNull == 2) && (countCompId == 1)) {
            for (int j = 2; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice3.add(compChoice);
                }
            }
        }
        else if (countNull == 3) {
            for (int j = 2; j < 9; j+=3) {
                if ((squares[j].equals(" "))) {
                    compChoice = String.valueOf((j + 1));
                    cChoice4.add(compChoice);
                }
            }
        }

        if (cChoice1.size() > 0) {
            int compIndex = (int) ((Math.random() * cChoice1.size()));
            compChoice = cChoice1.get(compIndex);
        } else if (cChoice2.size() > 0) {
            int compIndex = (int) ((Math.random() * cChoice2.size()));
            compChoice = cChoice2.get(compIndex);
        } else if (cChoice3.size() > 0) {
            int compIndex = (int) ((Math.random() * cChoice3.size()));
            compChoice = cChoice3.get(compIndex);
        } else if (cChoice4.size() > 0) {
            int compIndex = (int) ((Math.random() * cChoice4.size()));
            compChoice = cChoice4.get(compIndex);
        }
        return compChoice;
    }
}
