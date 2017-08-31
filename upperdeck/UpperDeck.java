/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upperdeck;
import util.*;
import java.util.ArrayList;

/**
 *
 * @author Laci
 */
public class UpperDeck {

    /**
     * @param args the command line arguments
     */
    
    static int populationSize=1000;
    static int XOverPercent = 100;
    static int mutationPercent = 1;
    
    static int largeObjectLength = 100;
    static int largeObjectWidth = 800;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Importing the Small Objects With Cardinality to main
        ArrayList <SmallObjWithCardinality> smallObjCardList = 
        GetFromCSVTheSmallObjects.getTheObjects("C:/proba.csv");
        
        // Get the whole list with 1 cardinality
        ArrayList<SmallObjectToPlace> smallObjList =
        GenerateObjAndDeckList.smallObjectsToShuffle(smallObjCardList);
        
        smallObjCardList=null;
        
        //Generate the first population
        ArrayList <OneLargeObjectToFill> population = new ArrayList();
        for (int i=0;i<populationSize;i++){
            OneLargeObjectToFill olotf = 
                    new OneLargeObjectToFill(largeObjectLength,largeObjectWidth);
            
        }
        
    }
    
     
    private ArrayList<OneLargeObjectToFill> Xover( OneLargeObjectToFill firstParent, OneLargeObjectToFill secondParent){
        ArrayList<OneLargeObjectToFill> twoOffSprings = new ArrayList();
        // TODO the crossover here
        return twoOffSprings;
    }
}
