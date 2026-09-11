import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Burger extends Actor
{
    public void act()
    {
        move(1);
        turn(Greenfoot.getRandomNumber(45));
    }
}
