import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public playScreen()
    {    
        super(600, 400, 1); //constructs the world
        Samurai samurai = new Samurai(); //instansiates new samurai object
        addObject(samurai, 100, 100);//adds samurai to the just constructed
        //world
        floor floor = new floor();
        addObject(floor, 300, 400);
    
    }
}
