import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KadeMuur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KadeMuur extends NonMovingObjects
{
    /**
     * Act - do whatever the KadeMuur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
            hitDetection();
        
    }
    public void hitDetection()
    {
        Actor boot = getOneIntersectingObject(LoodsBoot.class);    
       
    if(boot != null)    
    {    
        getWorld().removeObject(this);
    }
    }
}

