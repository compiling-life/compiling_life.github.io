// ******************123456******************
// Programmer: Faris Farag
// Due Date: 05/02/2024
// Project: Quadratic Formula
// Description: Asking the user for coefficients and then programming it to figure out the root.
// ************************************

import java.util.Scanner;
public class Lab11QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Introduction/Questions
        System.out.println("Given a quadratic equation in the form of :: y = a*x^2 + b*x + c");
        System.out.println();

        System.out.print("What is the value of the coefficient \"a\"? ");
        double coeA = scan.nextDouble();
        System.out.print("What is the value of the coefficient \"b\"? ");
        double coeB = scan.nextDouble();
        System.out.print("What is the value of the coefficient \"c\"? ");
        double coeC = scan.nextDouble();
        
        // Discriminant and quadratic function
        double discriminant = findDiscriminant(coeA, coeB, coeC);

        System.out.println();
        System.out.println("The quadratic function y = " + coeA + "*x^2 + " + coeB + "*x + " + coeC + "");
        
        // Calculations depending on the discriminant
        if (discriminant > 0) 
        {
            double root1 = firstRoot(coeA, coeB, coeC);
            double root2 = secondRoot(coeA, coeB, coeC);
            System.out.println("has two roots, they are:  x = " + root1 + " & x = " + root2 + "");
        } 
        
        else if (discriminant == 0) 
        {
            double root = -coeB / (2 * coeA);
            System.out.println("has only one root, it is:  x = " + root + "");
        } 
        
        else 
        {
            System.out.println("has no real roots, they are imaginary.");
        }
    }
    
    // Methods for the roots and discriminant
    public static double findDiscriminant(double coeA, double coeB, double coeC) 
    {
        return (coeB * coeB - 4 * coeA * coeC);
    }

    public static double firstRoot(double coeA, double coeB, double coeC) 
    {
        double discriminant = findDiscriminant(coeA, coeB, coeC);
        return (-coeB + Math.sqrt(discriminant)) / (2 * coeA);
    }

    public static double secondRoot(double coeA, double coeB, double coeC) 
    {
        double discriminant = findDiscriminant(coeA, coeB, coeC);
        return (-coeB - Math.sqrt(discriminant)) / (2 * coeA);
    }
}
