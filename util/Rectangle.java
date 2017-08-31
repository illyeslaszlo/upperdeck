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
public class Rectangle {
    protected int rLength=0;
    protected int rWidth=0;
    
    public Rectangle(int aLength,int aWidth){
        rLength=aLength;
        rWidth=aWidth;
    }
    
    public void setLength(int aLength){
        rLength=aLength;
    }
    
    public void setWidth(int aWidth){
        rWidth=aWidth;
    }
    
    public int getWidth(){
        return rWidth;
    }
    
    public int getLength(){
        return rLength;
    }
    
    public int getSurface(){
        return rLength*rWidth;
    }
}
