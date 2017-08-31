/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author Laci
 */
public class OneLargeObjectToFill extends Rectangle {
    
    private int coveredArea=0;

    private final boolean filledAreas[][];

    private final ArrayList<Deck> deckList = new ArrayList();
    
    private final ArrayList<NumberedDeck> numbDeckList = new ArrayList();

    private final ArrayList<SmallObjectToPlace> placesSmallObjects = new ArrayList();

    public OneLargeObjectToFill(int aLength, int aWidth) {
        super(aLength, aWidth);
        filledAreas = new boolean[aLength][aWidth];
        deckList.add(new Deck(0, aWidth, true));
        deckList.add(new Deck(aLength, aWidth, true));
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < aWidth; j++) {
                filledAreas[i][j] = false;
            }
        }
    }

    public boolean possibleToPlace(Deck aDeck, SmallObjectToPlace aSmallObject) {
        //TODO code here
        if (!areTheOtherCornersFree(aDeck, aSmallObject)) {
            return false;
        } else if (!areTheBordersFree(aDeck, aSmallObject)) {
            return false;
        }
        return true;
    }

    private boolean areTheOtherCornersFree(Deck aDeck, SmallObjectToPlace aSmallObject) {
        int otherDeck2x, otherDeck3x, otherDeck4x;
        int otherDeck2y, otherDeck3y, otherDeck4y;
        if (aDeck.leftSided) {
            otherDeck2x = aDeck.getxCoordonate() + aSmallObject.getLength();
            otherDeck3x = aDeck.getxCoordonate();
            otherDeck4x = aDeck.getxCoordonate() + aSmallObject.getLength();

            otherDeck2y = aDeck.getyCoordonate();
            otherDeck3y = aDeck.getyCoordonate() - aSmallObject.getWidth();
            otherDeck4y = aDeck.getyCoordonate() - aSmallObject.getWidth();

        } else {
            otherDeck2x = aDeck.getxCoordonate() - aSmallObject.getLength();
            otherDeck3x = aDeck.getxCoordonate();
            otherDeck4x = aDeck.getxCoordonate() - aSmallObject.getLength();

            otherDeck2y = aDeck.getyCoordonate();
            otherDeck3y = aDeck.getyCoordonate() - aSmallObject.getWidth();
            otherDeck4y = aDeck.getyCoordonate() - aSmallObject.getWidth();
        }

        if (!filledAreas[otherDeck2x][otherDeck2y]||!filledAreas[otherDeck3x][otherDeck3y]||
           !filledAreas[otherDeck4x][otherDeck4y]) {
            return false;
        }

        return true;
    }

    private boolean areTheBordersFree(Deck aDeck, SmallObjectToPlace aSmallObject) {

        for(int i=0;i<aSmallObject.getLength();i++){
            if(aDeck.leftSided()){
                if(filledAreas[aDeck.getxCoordonate()+i][aDeck.getyCoordonate()]||
                filledAreas[aDeck.getxCoordonate()+i][aDeck.getyCoordonate()-aSmallObject.getWidth()]){
                    return false;
                }
            }else{
                if(filledAreas[aDeck.getxCoordonate()-i][aDeck.getyCoordonate()]||
                filledAreas[aDeck.getxCoordonate()-i][aDeck.getyCoordonate()-aSmallObject.getWidth()]){
                    return false;
                }
            }
        }
        
        for(int i=0;i<aSmallObject.getWidth();i++){
            if(aDeck.leftSided()){
                if(filledAreas[aDeck.getxCoordonate()][aDeck.getyCoordonate()-i]){
                    return false;
                }
            }else{
                if(filledAreas[aDeck.getxCoordonate()][aDeck.getyCoordonate()-i]){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public void coverTheArea(Deck aDeck,SmallObjectToPlace aSmallObject){
        coveredArea+=aSmallObject.getSurface();
        for (int i=0;i<aSmallObject.rLength;i++){
            for(int j=0;j<aSmallObject.rWidth;j++){
                if(aDeck.leftSided()){
                   filledAreas[aDeck.getxCoordonate()+i][aDeck.getyCoordonate()+j]=true;
                }else{
                   filledAreas[aDeck.getxCoordonate()-i][aDeck.getyCoordonate()-j]=true;
                }
            }
        }
        
    }

    public int getCoveredArea(){
        return coveredArea;
    }
    
    private void renArrangeDecks(Deck aDeck){
        
    }
    
}
