import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        cobra serpente = new cobra();
        addObject(serpente, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        maça apple = new maça();
        addObject(apple, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(500));
    }
}
