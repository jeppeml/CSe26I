import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Child here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Child extends Food
{
    private int fattyness = 0;
    private int steps = 0;
    public Child(){
        fattyness = Greenfoot.getRandomNumber(100);
    }
    
    public void act(){
        move(6);
        if(steps == 2){
            turn();
            steps = 0;
        }
        steps++;
    }
    
    private void turn(){
        int rng = Greenfoot.getRandomNumber(360)-180;
        turn(rng);
    }
    
}
