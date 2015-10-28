//lab 4 RandomNumber Class Method and Parameter

public class RandomNumber {
    
    
    Random myRandomNumber = new Random();
    int compNum;
    
    public int GetANumber(int high)
    
    {
        compNum = myRandomNumber.GetANumber_Between_1_and_10();
        System.out.print("The number you enter is: "+high+" and the number the computer number is: "+compNum+" !");
        return high;
        
    }
}
