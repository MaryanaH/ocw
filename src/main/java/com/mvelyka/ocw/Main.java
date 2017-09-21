package com.mvelyka.ocw;

public class Main {

    public static void main(String[] args) {

        Gravity gravity = new Gravity();

        double fallingTime = 0.0;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;
        if (args.length == 3) {
            fallingTime = parseDouble(args[0]);
            initialVelocity = parseDouble(args[1]);
            initialPosition = parseDouble(args[2]);

        } else {
            System.err.println("Not all arguments are provided, please provide following arguments in corresponding order: " +
                    "fallingTime, initialVelocity, initialPosition");
        }

        double finalPosition = gravity.getFinalPosition(fallingTime, initialVelocity, initialPosition);

        System.out.println("Final position = " + finalPosition);


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
