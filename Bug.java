// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bug extends Actor
{

    /**
     * Act - do whatever the Bug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        else {
        }
        eatCherry();
        
    }

    /**
     * Act - do whatever the Bug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void eatCherry()
    {
        if (isTouching(Cherry.class)) {
            
            removeTouching(Cherry.class);
        }
        
    }
}
