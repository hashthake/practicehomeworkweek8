package homeworkweek8;

import java.util.Scanner;

public class Program7FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int r, rev = 0, fd, ld, s;
        ld = number % 10;
        while (number > 0) {
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd = rev % 10;
        s = fd + ld;
        return s;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scan.nextInt();
        System.out.println("The sum of first & last digit is: " + sumFirstAndLastDigit(a));
        // closing the scanner object
        scan.close();
    }
}
