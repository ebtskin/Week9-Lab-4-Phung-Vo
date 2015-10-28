
// Lab 4 Random number class used for RandomNumber class.
public class Random
{

    public int GetANumber_Between_1_and_10()
    {
        int gameNum = 0 + (int)(Math.random()*10);
        return gameNum;
    }
}

