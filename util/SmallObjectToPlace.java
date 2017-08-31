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
public class SmallObjectToPlace extends Rectangle{
    
    protected boolean canRotate = false;
    
    public SmallObjectToPlace(int aLength, int aHigh,boolean canRot){
        super(aLength,aHigh);
        canRotate = canRot;
    }
    
    public void setRotate(boolean canOrNot){
        canRotate = canOrNot;
    }
    
    public boolean getRotate(){
        return canRotate;
    }
    
}
