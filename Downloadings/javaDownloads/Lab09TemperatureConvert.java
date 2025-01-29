// ********************123456********************
// Programmer: Faris Farag
// Due Date: 01/01/2024
// Project: Converting Celcius to Farenheit
// Description: We must write code for it to provide a list of converted Celcius temperatures to Farenheit temperatures from a range.
// ****************************************

import java.util.Scanner;

public class Lab09TemperatureConvert
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Asks the user to enter the two numbers
        System.out.print("Enter a negative number between -25 and -5: ");
        int negCelc1 = scan.nextInt();
        
        System.out.print("Enter a positive number between 5 and 25: ");
        int posCelc = scan.nextInt();
        
        // Prints out the table heading
        System.out.println("\n  deg. C\t|\tdeg. F");
        System.out.println("-------------------------");
        
        // Calculations and prints out the table
        for (int negCelc2 = negCelc1; negCelc1 <= posCelc; negCelc1++)
        {
            double farenheit = (9 * negCelc1 + 160) / (5.0);
            
            if (negCelc1 < 0 && farenheit < 0)
            {
                System.out.println("  " + (double)negCelc1 + "\t\t|   " + farenheit + "");
            }
            
            else if (negCelc1 < 0 && farenheit > 0)
            {
                System.out.println("  " + (double)negCelc1 + "\t\t|\t " + farenheit + "");
            }

            else if (negCelc1 >= 0 && negCelc1 <= 10)
            {
                System.out.println("   " + (double)negCelc1 + "\t\t|\t " + farenheit + "");    
            }
            
            else if (negCelc1 >= 10)
            {
                System.out.println("   " + (double)negCelc1 + "\t\t|\t " + farenheit + "");    
            }
        }

        scan.close();
    }
}