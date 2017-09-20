package com.mvelyka.fooCorporation;

public class WageCalculation {
    private double wagePerHour = 8.0;
    private double overtimeCoefficient = 1.5;
    private double standardWorkingHours = 40.0;
    private double maxWorkingHours = 60.0;

    public double wageCount(double workingHours) {
        validatePositive(workingHours);
        double wage = 0;
        if (workingHours <= standardWorkingHours) {
            wage = wagePerHour * workingHours;
        } else if (workingHours > standardWorkingHours && workingHours <= maxWorkingHours) {
            wage = wagePerHour * workingHours * overtimeCoefficient;

        } else {
            wage = 0;
        }
        return wage;
    }

    /**
     * Validates if input param is positive value.
     * shall I reuse?
     */
    public static void validatePositive(double value) {
        if (value < 0)
            throw new ArithmeticException("Parameter is not positive");
    }
}
