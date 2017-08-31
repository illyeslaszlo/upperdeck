/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author user
 */
public class GenerateObjAndDeckList {
    
    public static ArrayList<SmallObjectToPlace> smallObjectsToShuffle(ArrayList<SmallObjWithCardinality> sObjWithNumbers){
        ArrayList<SmallObjectToPlace> sObjList = new ArrayList();
        int aLength,aWidth,cardinal;
        boolean canRot;
        for(SmallObjWithCardinality temp: sObjWithNumbers){
            aLength = temp.getLength();
            aWidth = temp.getWidth();
            canRot = temp.getRotate();
            cardinal = temp.getCardianlity();
            for(int i=0;i<cardinal;i++){
                sObjList.add(new SmallObjectToPlace(aLength,aWidth,canRot));
            }
        }
        
        return sObjList;
    }
            
    public static ArrayList<SmallObjectToPlace> shuffleeSmallObjectList(ArrayList<SmallObjectToPlace> sObjList ){
        Collections.shuffle(sObjList);
        return sObjList;
    }
    
    public static ArrayList<Integer> generateDeckList(int numberOfSmallObjects){
        // Generate the DeckList
        Random rand = new Random();
        ArrayList <Integer> numberOfDeck = new ArrayList();
        
        for(int i=0;i<numberOfSmallObjects;i++){
            numberOfDeck.add(rand.nextInt(i+2)+1);
        }
        
        return numberOfDeck;
    }
    
}
