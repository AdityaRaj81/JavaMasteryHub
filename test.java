public class test
{
    public static void main(String[] args)
    {

        // if-else Statement

        int age = 19;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        // Loops
        // a. for Loop

        for (int i = 9; i <= 15; i++) {
            System.out.println("Iteration: " + i);
        }

        // b. while Loop

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // c. do-while Loop
        int num = 21;
        do {
            System.out.println(num);
            num++;
        } while (num <= 25);

        // switch Statement

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}

// Output: