import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int timer = 30;
    
    public void act(){
        checkKeys();
        timer++;
    }
    
    private void checkKeys(){
        if(Greenfoot.isKeyDown("space"))
            if(timer>30){
                fireMissile();
                timer = 0;
                System.out.println("Missile fired :) timer:" + timer);
            }
        
        if(Greenfoot.isKeyDown("a"))
            setLocation(getX()-6,getY());
        
        if(Greenfoot.isKeyDown("d"))
            setLocation(getX()+6,getY());
    }

    private void fireMissile(){
        Missile m = new Missile();
        m.setRotation(getRotation());
        World w = getWorld();
        w.addObject(m, getX(), getY()-50);
    }

}
