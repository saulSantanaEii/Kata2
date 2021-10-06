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
        
        String[] data= {"En","un","Lugar","de","la","Ulpgc"};
        
        Histogram<String> histo = new Histogram(data);
        
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (String key: histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}

class Histogram<T>{
    private final T[] data;
    
    public Histogram(T[] data){
        this.data = data;
    }
    public T[] getData(){return this.data;}
    
    public Map getHistogram(){
        HashMap<T, Integer> histogram = new HashMap<>();
        
        for (T key : data) {
            
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            
        }
        return histogram;
    }
    
    
}