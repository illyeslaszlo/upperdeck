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
public class NumberedDeck extends Deck{
    protected int numbers=1;
    
    public NumberedDeck(int xCoord,int yCoord, boolean leftSide,int numb){
        super(xCoord,yCoord,leftSide);
        numbers = numb;
    }
    
    public void setNumbers(int aNumber){
        numbers = aNumber;
    }
    
    
    public int getNumbers(){
        return numbers;
    }
   
}
