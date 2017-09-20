package com.mvelyka.fooCorporation;

public class Main {

    public static void main(String[] args) {

        double workingHours = 0;
        if (args.length == 1) {
            workingHours = parseDouble(args[0]);
        }
        else {
            System.err.println("Argument is not provided. Please provide workingHours.");
        }
        WageCalculation wageCalculation = new WageCalculation();
        double wage = wageCalculation.wageCount(workingHours);
        System.out.println("Wage is: " + wage);

    }

    public static double parseDouble(String arg) {
        double argDouble = 0;
        try {
            argDouble = Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            System.err.println("Argument - " + argDouble + " must be a double.");
            System.exit(1);
        }
        return argDouble;
    }

}
