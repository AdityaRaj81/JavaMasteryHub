public class dataType {
    public static void main(String[] args) {
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
    }
}