import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilWombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilWombat extends Actor
{
    private int steps = 0;
    private int health = 100;
    public void act()
    {
        move(6);
        if(steps == 25){
            turn();
            steps = 0;
        }
        steps++;
        health--;
        checkFood();
        if(health <= 0){
            die();
        }
        
    }
    
    private void turn(){
        int rng = Greenfoot.getRandomNumber(360)-180;
        turn(rng);
    }
    
    public void die(){
        getWorld().removeObject(this);
    }
    
    private void checkFood(){
        Child c = (Child)getOneIntersectingObject(Child.class);
        if(c != null)
        {
            getWorld().removeObject(c);
            health = health + c.getFattyness();
        }
    }
}
