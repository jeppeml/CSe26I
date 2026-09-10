import java.util.*;
import greenfoot.Actor;

/**
 * Write a description of class Utility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Horse extends Actor 
{
    public int hp = 0; // copied to every instance
    private static int countHorses = 0; // only on the class
    
    // returns the closest Actor, null is none found
    public Actor getClosestActor(Actor a, int range){
        
        return null;
    }
    
    public Horse(){
        countHorses++;
    }
    
    public void act(){
        hp++;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
