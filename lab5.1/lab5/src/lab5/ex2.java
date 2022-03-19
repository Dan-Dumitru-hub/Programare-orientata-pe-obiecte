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
public class ex2 {
    static int numar;
    
     static void binaryToDecimal (String binaryString) throws NumberFormatException{ 
     ex2.numar = Integer.parseInt(binaryString,2);
        
   }
 
    static void hexToDecimal (String binaryString) throws NumberFormatException{ 
       ex2.numar = Integer.parseInt(binaryString,16);
        
   }
    int valoare(int []v,int i) throws ArrayIndexOutOfBoundsException{
        return v[i];
    }
    
     public  static void main(String[] args) throws NumberFormatException ,ArrayIndexOutOfBoundsException{
        // TODO code application logic here
        
        String cv="0101A";
        ex2 nr1=new ex2();
        nr1.hexToDecimal(cv);
        System.out.println ( nr1.numar );
      
        
        
        int v[];
        v=new int[50];
        for(int i=0;i<50;i++)
        v[i]=i;
        System.out.println ( nr1.valoare(v,51) );
        
        
    }
}




