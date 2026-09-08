import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{
    private int horizontalOpponentCount = 5;
    private int verticalOpponentCount = 2;
    private int horizontalSpacing = 74;
    private int verticalSpacing = 80;
    
    public SpaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        for(int i=0;i<horizontalOpponentCount;i++){
            for(int k=0;k<verticalOpponentCount;k++){
                Opponent op = new Opponent();
                addObject(op,130 + i * horizontalSpacing, k*verticalSpacing + 45);
            }
        }
        
        Player p = new Player();
        addObject(p, 300, 350);
        p.setRotation(270);
    }
}
