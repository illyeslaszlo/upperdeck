/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Laci
 */
public class Deck {
    protected int xCoordonate=0;
    protected int yCoordonate=0;
    protected boolean leftSided=true;
    
    public Deck(int xCoord,int yCoord, boolean leftSide){
        xCoordonate=xCoord;yCoordonate=yCoord;leftSided=leftSide;
    }
    
    public void setxCoordonate(int anXCoord){
        xCoordonate=anXCoord;
    }
    
    public void setyCoordonate(int anyCoord){
        yCoordonate=anyCoord;
    }
    
    public void setRightSize(){
        leftSided=false;
    }
    
    public int getxCoordonate(){
        return xCoordonate;
    }
    
    public int getyCoordonate(){
        return yCoordonate;
    }
    
    public boolean leftSided(){
        return leftSided;
    }
    
}
