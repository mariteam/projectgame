import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pong extends World
{

    /**
     * Constructor for objects of class pong.
     * 
     */
    public pong()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        keepoints label = new keepoints("Press ENTER to start!!!");
       
        addObject(new ball(label), 200, 400);
        addObject(new ball(label), 400, 400);
        addObject(new humanpaddle(), 300, 780);
        addObject(new keepaddle(), 300, 20);
        
        addObject (label,100,400);
       
    }
    
}
