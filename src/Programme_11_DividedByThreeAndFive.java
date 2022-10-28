/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */


public class Programme_11_DividedByThreeAndFive {


    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i <= 100; i++) {
            dividedByThree(i);
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("Numbers divisible by 5 are: ");
        for (int x = 1; x <= 100; x++) {
            dividedByFive(x);
        }
    }

    // Divided By Three method
    public static void dividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.print(number + ",");
        }
    }

    // Divided By Five method
    public static void dividedByFive(int number) {
        if (number % 5 == 0) {
            System.out.print(number + ",");
        }
    }
}
