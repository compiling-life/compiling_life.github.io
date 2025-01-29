import java.util.Scanner;

public class AdvancedCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String continueCalc = "yes";
        
        while (continueCalc.equalsIgnoreCase("yes"))
        {
            System.out.println("Welcome to the Advanced Calculator!");
            System.out.println("Choose an operation:");
            System.out.println("1. Basic Arithmetic (+, -, *, /)");
            System.out.println("2. Factorial");
            System.out.println("3. Exponentiation");
            System.out.println("4. Square Root");
            System.out.println("5. Trigonometric Functions (sin, cos, tan)");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            
            double result = 0;
            
            switch (choice)
            {
                case 1:
                    result = performArithmetic(scanner);
                    break;
                
                case 2:
                    result = calculateFactorial(scanner);
                    break;
                
                case 3:
                    result = calculateExponentiation(scanner);
                    break;
                
                case 4:
                    result = calculateSquareRoot(scanner);
                    break;
                
                case 5:
                    result = performTrigonometry(scanner);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            System.out.println("Result: " + result);
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalc = scanner.next();
        }
        
        scanner.close();
        System.out.println("Thank you for using the Advanced Calculator!");
    }
    
    // Basic Arithmetic
    public static double performArithmetic(Scanner scanner)
    {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (operator)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                {
                    result = num1 / num2;
                }
                else
                {
                    System.out.println("Error: Cannot divide by zero.");
                    result = Double.NaN;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
        
        return result;
    }
    
    // Factorial
    public static double calculateFactorial(Scanner scanner)
    {
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        
        if (num < 0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
            return Double.NaN;
        }
        
        long factorial = 1;
        
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        
        return factorial;
    }
    
    // Exponentiation
    public static double calculateExponentiation(Scanner scanner)
    {
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        
        return Math.pow(base, exponent);
    }
    
    // Square Root
    public static double calculateSquareRoot(Scanner scanner)
    {
        System.out.print("Enter a number to find its square root: ");
        double num = scanner.nextDouble();
        
        if (num < 0)
        {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
            return Double.NaN;
        }
        
        return Math.sqrt(num);
    }
    
    // Trigonometric Functions (sin, cos, tan)
    public static double performTrigonometry(Scanner scanner)
    {
        System.out.println("Choose a trigonometric function:");
        System.out.println("1. Sine (sin)");
        System.out.println("2. Cosine (cos)");
        System.out.println("3. Tangent (tan)");
        System.out.print("Enter your choice (1-3): ");
        int trigChoice = scanner.nextInt();
        
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        
        double result = 0;
        
        switch (trigChoice)
        {
            case 1:
                result = Math.sin(radians);
                break;
            case 2:
                result = Math.cos(radians);
                break;
            case 3:
                result = Math.tan(radians);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        return result;
    }
}
