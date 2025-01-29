import java.util.Scanner;

public class TicTacToe
{
    public static char[][] board = new char[3][3];

    public static char currentPlayer = 'X';
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        initializeBoard();
        
        while (true)
        {
            printBoard();
            playerMove(scanner);
            
            if (isWinner())
            {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            
            if (isBoardFull())
            {
                printBoard();
                System.out.println("It's a tie!");
                break;
            }
            
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        
        scanner.close();
    }
    
    public static void initializeBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = ' ';
            }
        }
    }
    
    public static void printBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);

                if (j < 2)
                {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2)
            {
                System.out.println("---------");
            }
        }
    }
    
    public static void playerMove(Scanner scanner)
    {
        int row, col;
        
        while (true)
        {
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ')
            {
                board[row][col] = currentPlayer;
                break;
            }
            
            else
            {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
    
    public static boolean isWinner()
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
            {
                return true;
            }
            
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
            {
                return true;
            }
        }
        
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
        {
            return true;
        }
        
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
        {
            return true;
        }
        
        return false;
    }
    
    public static boolean isBoardFull()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        return true;
    }
}
