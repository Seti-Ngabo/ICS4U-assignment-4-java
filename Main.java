/*
* This program reads a single integer from the user
*  and prints stars
*
* @author  Seti Ngabo
* @version 1.0
* @since   2022-21-11
*/

// Import
import java.util.Scanner;

/**
 * Class Main
 */

final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
     * This is the hour glass function.
     *
     * @param userInt length of the hourglass.
     * @param center middle of the hourglass.
     */
    static void stars(final int userInt, final int center) {

        String compString = "";
        int count;
        int loopCount;

        for (count = 0; count < center; count++) {
            compString += " ";
        }

        for (loopCount = 0; loopCount < userInt; loopCount++) {
            compString += "* ";
        }
        System.out.println(compString);

        if (userInt > 1) {
            stars(userInt - 1, center + 1);
        }
        System.out.println(compString);
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final Scanner userString = new Scanner(System.in);
        try {
            System.out.print("Enter an integer : ");
            final int userInt = userString.nextInt();

            if (userInt <= 0) {
                System.out.println("\nThis is not a positive integer, try again.");
            } else {
                System.out.println("");
                stars(userInt, 0);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid input entered.");
        }
        System.out.println("\nDone.");
    }
}
