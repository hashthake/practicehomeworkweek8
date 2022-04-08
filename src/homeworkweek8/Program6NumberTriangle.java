package homeworkweek8;

import java.util.Scanner;

public class Program6NumberTriangle {

    public static void numTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        //calls static method
        numTriangle(scan.nextInt());
        // closing the scanner object
        scan.close();
    }
}
