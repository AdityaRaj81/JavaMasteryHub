/*Type casting is when you assign a value of one primitive data type to another type.

    In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
*/


public class casting {
    public static void main(String[] args) {

        byte b = 127;
        System.out.println("byte: " + b);

        /*Widening casting is done automatically when passing a smaller size type to a larger size type:*/
        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic casting: int to double
        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0

        /*Narrowing casting must be done manually by placing the type in parentheses () in front of the value:*/
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        // Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 423;
        /* Calculate the percantage of the user's score in relation to the maximum available score. Convert userScore
         to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is " + percentage);

        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}
