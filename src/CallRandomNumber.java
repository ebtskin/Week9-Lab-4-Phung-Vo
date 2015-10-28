//lab 4, using 2 class with parameter

import java.util.Scanner;

public class CallRandomNumber
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        RandomNumber Lab4 = new RandomNumber();
        
        System.out.print("Please enter a number 0-10:");
        int userNum = input.nextInt();
        System.out.println();
        
        Lab4.GetANumber(userNum);
        
        
    }
}