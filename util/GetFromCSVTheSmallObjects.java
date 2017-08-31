/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class GetFromCSVTheSmallObjects {
    public static ArrayList <SmallObjWithCardinality> getTheObjects(String csvFile){
        ArrayList <SmallObjWithCardinality> smallObjList = new ArrayList();
        
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] smc = line.split(cvsSplitBy);
                
                smallObjList.add(new SmallObjWithCardinality(Integer.parseInt(smc[1]),
                        Integer.parseInt(smc[2]),
                        Boolean.parseBoolean(smc[3]),
                        Integer.parseInt(smc[4])));
//                System.out.println(smc[1]+" "+smc[2]+" "+smc[3]+smc[4]);
            }

        } catch (IOException e) {
        }
        
        return smallObjList;
    }
}
