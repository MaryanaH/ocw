package com.mvelyka.magicSquares;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Square {
    int[][] square;

    public Square() {
        int[] nums = readFile();
        square = new int[3][3];
        for (int i = 0; i < nums.length; i++) {
            square[i / 3][i % 3] = nums[i];
            System.out.println(square[i / 3][i % 3]);
        }
    }

    public boolean checkSum() {

        for (int i = 0; i < square.length; i++) {
            if (calculateRowSum(i) != 15 || calculateColumnSum(i) != 15) {
                return false;
            }
        }
        if (calculateLeftDiagonal() != 15 || calculateRightDiagonal() != 15) {
            return false;
        }
        return true;
    }

    public int calculateRowSum(int rowNumber) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[rowNumber][i];
        }
        return sum;
    }

    public int calculateColumnSum(int columNumber) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][columNumber];
        }
        return sum;
    }

    public int calculateLeftDiagonal() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    public int calculateRightDiagonal() {
        int sum = square[square.length - 1][0] + square[0][square.length - 1] + square[square.length - 2][square.length - 2];
        return sum;
    }

    private int[] readFile() {
        FileReader fr = null;
        int[] intArray = new int[9];
        String str = "";

        try {
            fr = new FileReader("/Users/mvelyka/JavaLearnig/src/main/resources/square.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                str = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newStr = str.replaceAll("\\s+", "");
        for (int i = 0; i < newStr.length(); i++) {
            intArray[i] = Integer.parseInt(String.valueOf(newStr.charAt(i)));
        }
        return intArray;
    }
}
