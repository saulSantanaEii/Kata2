/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author 34674
 */
public class main {
    
    public static void main(String[] args){
        
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            
        }
        
        for (Integer key: histogram.keySet()){
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
