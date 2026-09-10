import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilGameWorld extends World
{

    public EvilGameWorld()
    {    
        super(900, 600, 1); 
        EvilWombat chad = new EvilWombat();
        addObject(chad,100,300);
        for(int i = 0; i<20;i++){
            Child baby = new Child();
            int x = Greenfoot.getRandomNumber(880);
            int y = Greenfoot.getRandomNumber(580);
            addObject(baby,x,y);
        }
        for(int i = 0; i<20;i++){
            AltChild baby = new AltChild();
            int x = Greenfoot.getRandomNumber(880);
            int y = Greenfoot.getRandomNumber(580);
            addObject(baby,x,y);
        }
        
        for(int i = 0; i<10;i++){
            Cow cow = new Cow();
            int x = Greenfoot.getRandomNumber(880);
            int y = Greenfoot.getRandomNumber(580);
            addObject(cow,x,y);
        }
        
        for(int i = 0; i<10;i++){
            Cactus ca = new Cactus();
            int x = Greenfoot.getRandomNumber(880);
            int y = Greenfoot.getRandomNumber(580);
            addObject(ca,x,y);
        }
    }
}
