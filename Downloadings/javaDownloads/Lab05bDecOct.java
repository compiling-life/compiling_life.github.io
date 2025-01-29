// ******************123456******************
// Programmer: Faris Farag
// Due Date: 1/17/2024
// Project: Decimal to Octal.
// Description: Making a code to convert decimal numbers to octal.
// ************************************

import java.util.Scanner;

public class Lab05bDecOct
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Asks the user to enter their base ten number.
        System.out.println("*** Number Converter ***\n");
        System.out.print("Enter a base ten number (1-32,768): ");
        int decimalNumber = scanner.nextInt();

        // Prints out the decimal number they entered.
        System.out.print("\nYou entered decimal number " + decimalNumber + ", in octal the number is ");

        // Variables and loop to figure out the octal of the base ten number.
        int OctalValue = 4096;
        while (OctalValue >= 1) {
            int digit = decimalNumber / OctalValue;
            decimalNumber %= OctalValue;
            OctalValue /= 8;

            // Prints out the octal number and the period.
            System.out.print(digit);
        }

        System.out.println(".");
    }
}