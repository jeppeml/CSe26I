import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Opponent extends Actor
{
    public void act()
    {
        if(isAtEdge())
            turn(180);

        move(3);
        
    }
}
