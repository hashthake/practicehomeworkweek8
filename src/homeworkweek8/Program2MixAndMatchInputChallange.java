package homeworkweek8;

import java.util.Scanner;

public class Program2MixAndMatchInputChallange {

    public static void findMinAndMaxNumbers() {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //while loop
        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scan.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scan.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
