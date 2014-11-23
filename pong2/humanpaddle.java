import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class humanpaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class humanpaddle extends paddles
{
   
    /**
     * Act - do whatever the humanpaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movepaddle();
        onscreen();
    } 
    public void movepaddle(){
        if (Greenfoot.isKeyDown("right")){
        move(10);
    }
        if (Greenfoot.isKeyDown("left")){
        move(-10);
    }
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