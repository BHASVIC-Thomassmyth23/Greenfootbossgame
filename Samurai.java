import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Samurai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Samurai extends Actor
{
    public int vSpeed;
    private boolean onGround;
    /**
     * Act - do whatever the Samurai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move(); 
       jump(); 
       //System.out.println(onGround);
    }
    public void move() {
        if (Greenfoot.isKeyDown("A")) 
        {
            move (-10); //when right arrow key is pressed, 
            //move character to the right
        }
        if (Greenfoot.isKeyDown("D")) 
        {
            move(10);
            move(10);//when left arrow key is pressed,
            //move character to the left
        }
    }
    public void jump() {
        vSpeed++;
        setLocation(getX(), getY() + vSpeed);
        if (vSpeed < 0) {
            if (isTouching(null)) {
                vSpeed = 0; vSpeed = 0;
            }
        }
        if (isTouching(floor.class)) {
            onGround = true;
        }
        if (Greenfoot.isKeyDown ("Space") && onGround == true) {
            vSpeed -=  20;
            onGround = false;
        }
    }
    
}
