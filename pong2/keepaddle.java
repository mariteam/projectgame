import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class humanpaddle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keepaddle extends paddles
{
    /**
     * Act - do whatever the humanpaddle2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movepaddle();
        onscreen();
    }   
    
    public void movepaddle(){
        if (Greenfoot.isKeyDown("d"))
        move(10);
        if (Greenfoot.isKeyDown("a"))
        move(-10);
        
        
    }
    
    public void onscreen(){
    if(getX() >=getWorld().getWidth() - getImage().getWidth()/2){
        setLocation(getWorld().getWidth() - getImage().getWidth()/2, getY());
    }
    
    if(getX() == 0 + getImage().getWidth()/2){
        setLocation( 0 + getImage().getWidth()/2, getY());
    }
}
}