/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;
/**
 *
 * @author tipa
 */
public class bonus {
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
         
        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }
    
    public static void outofmemory(){
     Long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemory);
        int[] matrix = new int[(int) (maxMemory + 1)];
        for(int i = 0; i < matrix.length; ++i)
            matrix[i] = i+1;
    }
    
    
 public static void main(String[] args) {
 
         
       
       
        bonus.outofmemory();
        
        bonus.recursivePrint(1);
    }
  

   
}
