

public class Main {

    public static void main(String[] args) {

        Gravity gravity = new Gravity();

        double firstArg = 0.0;
        double secondArg = 0.0;
        double thirdArg = 0.0;
        if (args.length == 3) {
            for (int i = 1; i < 4; i++)
            try {
                firstArg = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.err.println("Argument - " + args[i] + " must be a double.");
                System.exit(1);
            }
        } else {
            System.err.println("Not all arguments are provided");
        }

        double finalPosition = gravity.getFinalPosition(firstArg, secondArg, thirdArg);

        System.out.println("test = " + finalPosition);

        //check number of params, type, print usage
        //pmd plugin - styles
        //add params
        //different tests - check invalid params, invalid input data, exception in tests

    }

}
