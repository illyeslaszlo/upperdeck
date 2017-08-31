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
    
    int populationSize=1000;
    int XOverPercent = 100;
    int mutationPercent = 1;
    
    public static void main(String[] args) {
        // TODO code application logic here
        GetFromCSVTheSmallObjects.getTheObjects("D:/proba.csv");
    }
    
    private void getCSV(){
    }
    
    private void genLargObjects(){
    
    }
    
    private ArrayList<OneLargeObjectToFill> Xover( OneLargeObjectToFill firstParent, OneLargeObjectToFill secondParent){
        ArrayList<OneLargeObjectToFill> twoOffSprings = new ArrayList();
        // TODO the crossover here
        return twoOffSprings;
    }
}
