import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    public int xSpeed = 0;
    public int ySpeed = 0;
    public int humanpoint = 0;
    public int keepoint = 0;
    private keepoints mykeepoints;
    public ball(keepoints label){
        mykeepoints=label;
    }
    
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        wallbounce();
        paddlebounce();
        points();
        resetgame();
        start();
        ballbounce();
}
    public void resetgame(){
    if (humanpoint==10){
        Greenfoot.setWorld(new pong()); 
    }
    if (keepoint==10){
        Greenfoot.setWorld(new pong()); 
    }
    }
    
    public void move(){
    setLocation(getX() + xSpeed, getY() + ySpeed);
    }
    
    public void start(){
    if (Greenfoot.isKeyDown("enter")){
        xSpeed=3;
        ySpeed=3;
    }
    }
   

public void wallbounce(){
    if(getX() >=getWorld().getWidth() - getImage().getWidth()/2)
    {
      xSpeed = (1+xSpeed)*-1; 
    }
    if(getX() <= 0 + getImage().getWidth()/2)
    {
      xSpeed = (1+xSpeed)*-1; 
    }
    if(getY() >=getWorld().getHeight() - getImage().getHeight()/2)
    {
      xSpeed = (1+xSpeed)*-1; 
    }
    if(getY() <= 0 + getImage().getHeight()/2)
    {
      xSpeed = (1+xSpeed)*-1; 
    }
    
    
}


public void paddlebounce()
{
    Actor hpaddle = getOneIntersectingObject(humanpaddle.class);
    Actor kpaddle = getOneIntersectingObject(keepaddle.class);
    if( hpaddle != null)
        ySpeed = (1+ySpeed)*-1;
        
        
    if( kpaddle != null)
        ySpeed = (1+ySpeed)*-1;
}



public void points(){


    
    if (getY() >= getWorld().getHeight()-1)  
    { // moving left and past left limit  
        super.setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2); // reset position  
        xSpeed = 3;
        ySpeed = 3;
        keepoint++;
        mykeepoints.setText("Speler1: "+ keepoint +" "+"Speler2: " + humanpoint);
    }
    
    
    if (getY() <= getWorld().getHeight()-getWorld().getHeight())  
    { // moving left and past left limit  
        super.setLocation(getX()-getX()+300, 400); // reset position  
        xSpeed = 3;
        ySpeed = 3; 
         humanpoint++;
        mykeepoints.setText("Speler1: "+ keepoint +" "+"Speler2: " + humanpoint);
    }
    
    
      
      
    
    
    
}
public void ballbounce()
{
    Actor pongball = getOneIntersectingObject(ball.class);
    
   
    if( pongball != null){
        ySpeed = (1+ySpeed)*-1;
        xSpeed = (1+xSpeed)/-1;
    }
}  
}





















