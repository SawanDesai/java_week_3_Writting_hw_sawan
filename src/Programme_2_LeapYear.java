/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        // Scaner declaration for readin gin put from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year :");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        scanner.close();



    }
    // checking is it leap year or not
    public void isItLeapYear(int year){
        if(year %4 ==0 && year %100 !=0 || year %400 ==0){
            System.out.println("The year" + year + "is leap year");
        return;
        }
        System.out.println("The year "+ year + "is not a leap year");
    }

}
