import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Missile extends Actor
{
    public void act()
    {
        move(3);
        Actor opponent = getOneIntersectingObject(Opponent.class);
        if(opponent != null){
            getWorld().removeObject(opponent);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
