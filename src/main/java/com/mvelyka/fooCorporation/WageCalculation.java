package com.mvelyka.fooCorporation;

/**
 * Created by mvelyka on 8/29/17.
 */
public class WageCalculation {
    private static double wagePerHour = 8.0;
    private static double coefficient = 1.5;
    private static double maxHours = 40.0;
    private static double maxOvertime = 60.0;

    public static double wageCount(double workingHours) {
        validatePositive(workingHours);
        double wage = 0;
        if (workingHours <= maxHours) {
            wage = wagePerHour * workingHours;
        } else if (workingHours > maxHours && workingHours <= maxOvertime) {
            wage = wagePerHour * workingHours * coefficient;

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
