import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keepoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keepoints  extends points
{
    public keepoints(String text)
    {
        GreenfootImage img =new GreenfootImage(200,30);
        img.drawString(text,2,20);
        setImage(img);
    }
   
    public void setText(String text)
    {
        GreenfootImage img=getImage();
        img.clear();
        img.drawString(text,2,20);
    }
    
}