package fr.iutvalence.java.mp.linerunner;

import java.util.Random;

/**
 * class who simulate one player
 * 
 * @author rouxan vignandc 
 */
public class Element
{

    /**
     * value who contains one position qualified by a ordonna and abscissa
     */
    private Position position;
    
    /**
     * the height of the element in the grid
     */
    private int height;
    
    /**
     * height by default of one element
     */
    private final static int DEFAULT_HEIGHT=1;
    

/**
 * 
 * @param x0 value in Orderly 
 * @param y0 value in abscissa
 * @param height_define size of the new element created
 * constructor who take into account of the element's size
 */
    public Element(int x0,int y0,int height_define)
    {
        this.position = new Position(x0,y0);
        this.height = height_define;
    }
    
    /***
     * 
     * @param x0 value in Orderly
     * @param y0 value in abscissa
     * constructor by default without to take account of the element's size (default size is one)
     */
    public Element(int x0,int y0)
    {
        this.position = new Position(x0,y0);
        this.height =DEFAULT_HEIGHT;
    }

    
    

    /**
     * @return the value in Orderly and abscissa of the element concerned
     */
    public Position getPosition()
    {
        return this.position;
    }
    
    
    /**
     * this method return true if the player want to jump and false if he
     * doesn't want
     * 
     * @return a Boolean
     */
    // TODO (fixed) rename this method (more explicit)
    public boolean moveUp()
    {
        boolean isjump = false;

        int valeur = new Random().nextInt(4);

        if (valeur == 0)
        {
            isjump = true;
        }
        //System.out.print("\n" + valeur + "\n");

        return isjump;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
     public String toString()
     {
         String result = "";
     
         result += "("+this.position.getX()+","+this.position.getY()+")";
         
         return result;
     }
    
}