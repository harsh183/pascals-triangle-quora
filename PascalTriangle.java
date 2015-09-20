import java.io.*;
/**
 * Class to print the following pattern
 * 1 
 * 1 1 
 * 1 2 1 
 * 1 3 3 1 
 * 1 4 6 4 1 
 * 1 5 10 10 5 1 
 * 1 6 15 20 15 6 1
 * 
 * Harsh Deep
 * 20/9/15
 */
public class PascalTriangle
{
    static int factorial(int number)
    {
        //Getting it iteratively
        int factorial = 1;
        for(int counter = 2; counter <= number; counter++)
            factorial *= counter;
            
        return factorial;    
    }
    
    static int combination(int n, int r)
    {
        //Using the formula n! / ( r! (n - r)! )
        int combination = factorial(n) / ( factorial(r) * factorial(n - r));
        
        return combination;
    }
    
    public static void printTriangle(int lines)
    {
        for(int row = 1; row <= lines; row++)
        {
            for(int column = 1; column <= row; column++)
                System.out.print(combination(row - 1,column - 1) + " ");
                
            System.out.println();//Moving to the next line
        }
    }
    
    public static void main(String[] args)
    {
        printTriangle(7);
    }
    
    //If you want to take some user input use this as main instead
//     public static void main(String[] args) throws IOException
//     {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         
//         System.out.println("Enter number of lines for Pascal's triangle.");
//         int lines = Integer.parseInt(br.readLine());
// 
//         printTriangle(lines);
//     }
}
