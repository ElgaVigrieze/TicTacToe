package com.company;

public class Field {
    static String[] squares =  {" ", " "," "," "," "," "," "," "," "};
    static String[] availableSquares = {"1","2","3","4","5","6","7","8","9"};

    static void printField(){
        for (int i = 0; i < 3; i++) {
            System.out.print(squares[i] + "\t");
        }
        System.out.println(" ");
        for (int i = 3; i < 6; i++) {
            System.out.print(squares[i] + "\t");
        }
        System.out.println(" ");
        for (int i = 6; i < 9; i++) {
            System.out.print(squares[i] + "\t");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
