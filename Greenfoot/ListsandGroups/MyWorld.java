import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends World
{
    private int tics = 0;
    private int dx=0;
    private int dy=0;
    private List<List<Burger>> listCollection = new ArrayList();

    public MyWorld()
    {    
        super(800, 600, 1); 

        for(int i=0;i<100;i++){
            int randX = Greenfoot.getRandomNumber(800);
            int randY = Greenfoot.getRandomNumber(600);
            int swarmSize = Greenfoot.getRandomNumber(20-5)+5;
            List<Burger> burgerSwarm = createBurgerSwarm(swarmSize, randX, randY);
            listCollection.add(burgerSwarm);
        }
        
        Burger burger = new Burger();
        GreenfootImage bi = burger.getImage();
        int size = Greenfoot.getRandomNumber(20)+10;
        bi.scale(150, 150);
        addObject(burger, 500, 500);
    }

    private List<Burger> createBurgerSwarm(int amount, int x, int y){
        List<Burger> burgers = new ArrayList();

        for(int i=0;i<amount;i++){
            int dx = Greenfoot.getRandomNumber(100);
            int dy = Greenfoot.getRandomNumber(100);
            Burger burger = new Burger();
            GreenfootImage bi = burger.getImage();
            int size = Greenfoot.getRandomNumber(20)+10;
            bi.scale(size, size);
            addObject(burger, x+dx, y+dy);
            burgers.add(burger);
        }
        return burgers;
    }

    public void act(){
        tics++;

        if(tics>90){
            dx = Greenfoot.getRandomNumber(9)-4;
            dy = Greenfoot.getRandomNumber(9)-4;
            tics = 0;
        }
        
        for(List<Burger> list: listCollection){
            for(Burger b: list){
                int x = b.getX();
                int y = b.getY();
                b.setLocation(x+dx,y+dy);
            }
        }

    }
}
