package com.mvelyka.fooCorporation;


import static com.mvelyka.ocw.Main.parseDouble;

public class Main {

    public static void main(String[] args) {

        double workingHours = 0;
        double wage = 0;
        if (args.length == 1) {
            workingHours = parseDouble(args[0]);
        }
        else {
            System.err.println("Argument is not provided. Please provide workingHours.");
        }
        wage = WageCalculation.wageCount(workingHours);
        System.out.println("Wage is: " + wage);

    }


}
