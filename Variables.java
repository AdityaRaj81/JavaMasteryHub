public class Variables {
    public static void main(String args[]){


        int num = 9;
        byte by = 127;
        short sh = 32767;
        long l  = 9223372036854775807L;

        float f = 234.5f;
        double d = 123.4;

        char c = 'a';    //literals
        boolean b = true;


        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun ? " + isJavaFun);
        System.out.println("Is fish tasty ? " + isFishTasty);

        // Boolean values are mostly used for conditional statements
        int x = 10;
        int y = 9;
        System.out.println("Is x greater than y ? " + (x > y)); // returns true, because 10 is higher than 9
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        String name = "Aditya";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        myNum = 20;  // myNum is now 20
        System.out.println(myNum);

        // final int myNum = 15;
       //  myNum = 20;  // will generate an error: cannot assign a value to a final variable
        System.out.println(myNum);


    }
}
