import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
    
    private double getDistance(Actor a1, Actor a2){
        int x1 = a1.getX();
        int y1 = a1.getY();
        
        int x2 = a2.getX();
        int y2 = a2.getY();
        
        double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return distance;
    }
    
    public void act()
    {
        List<Food> visibleChildren = getObjectsInRange(2000, Food.class);
        double closestDistance=99999;
        Actor closest = null;
        for(int i=0;i<visibleChildren.size();i++){
            Actor c = visibleChildren.get(i);
            double distance = getDistance(this, c);
            if(distance<closestDistance){
                closestDistance = distance;
                closest = c;
            }
        }
        if(closest!=null)
            turnTowards(closest.getX(), closest.getY());
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
        Food f = (Food)getOneIntersectingObject(Food.class);
        if(f != null)
        {
            getWorld().removeObject(f);
            health = health + f.getFattyness();
        }
    }
}
