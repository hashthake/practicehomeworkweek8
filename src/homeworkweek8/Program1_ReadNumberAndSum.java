package homeworkweek8;

import java.util.Scanner;

public class Program1_ReadNumberAndSum {

    public static void readTenNumbersAndSum() {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scan.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        // closing the scanner object
        scan.close();
    }

    public static void main(String[] args) {
        readTenNumbersAndSum();
    }
}
