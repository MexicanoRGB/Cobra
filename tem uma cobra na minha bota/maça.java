import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maça here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class maça extends Actor
{
    /**
     * Act - do whatever the maça wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if (getOneIntersectingObject(cobra.class)!=null){
       int x=Greenfoot.getRandomNumber(getWorld().getWidth());
       int y=Greenfoot.getRandomNumber(getWorld().getHeight());
       }
    }
}