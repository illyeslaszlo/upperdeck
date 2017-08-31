/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Laszlo
 */
public class SmallObjWithCardinality extends SmallObjectToPlace{
    
    private int cardinality=1;
    
    public SmallObjWithCardinality(int aLength, int aWidth,boolean canRot, int card){
        super(aLength,aWidth,canRot);
        cardinality=card;
    }
    
    public void setCardinality(int aCard){
        cardinality=aCard;
    }
    
    public int getCardianlity(){
        return cardinality;
    }
}
