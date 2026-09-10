import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilGameWorld extends World
{
    private static final String WELCOME_TEXT = "Rhello!";
    private static final int WELCOME_X = 200;
    private static final int WELCOME_Y = 300;
    private static final String LEVEL_TXT = "Level: ";

    public EvilGameWorld()
    {    
        
        super(900, 600, 1); 
        int realLevel = 5;
        Label lvlLabel = new Label(LEVEL_TXT + realLevel, 34);
        addObject(lvlLabel,830,40);
        
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
        
        Label l = new Label(WELCOME_TEXT, 34);
        addObject(l,WELCOME_X,WELCOME_Y);
        
        for(int i = 0; i<10;i++){
            Cactus ca = new Cactus();
            int x = Greenfoot.getRandomNumber(880);
            int y = Greenfoot.getRandomNumber(580);
            addObject(ca,x,y);
        }
        //Horse h = new Horse();
        
    }
}
