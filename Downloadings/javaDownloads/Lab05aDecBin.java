// ******************123456******************
// Programmer: Faris Farag
// Due Date: 1/17/2024
// Project: Decimal to Binary.
// Description: Making a code to convert decimal numbers to binary.
// ************************************

import java.util.Scanner;

public class Lab05aDecBin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their base ten number.
        System.out.println("*** Number Converter ***\n");
        System.out.print("Enter a base ten number (1-2047): \n");
        int decimalNumber = scanner.nextInt();

        // Prints out the decimal number they entered.
        System.out.print("You entered decimal number " + decimalNumber + ", in binary the number is ");

        // Variables and loop to figure out the binary of the base ten number.
        int binaryValue = 1024;
        while (binaryValue >= 1) {
            int digit = decimalNumber / binaryValue;
            decimalNumber %= binaryValue;
            binaryValue /= 2;

            // Prints out the binary number and the period.
            System.out.print(digit);
        }

        System.out.println(".");
    }
}