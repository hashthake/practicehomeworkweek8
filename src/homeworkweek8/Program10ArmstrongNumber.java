package homeworkweek8;

import java.util.Scanner;

public class Program10ArmstrongNumber {
    public static void isArmstrongNumber(int num) {
        int number, temp, total = 0;
        number = num;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scan.nextInt();
        isArmstrongNumber(a);
        // closing the scanner object
        scan.close();
    }
}
