/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author tipa
 */
public class Person {
    
    
    
    String name,CNP;
    void constructor (){
        Scanner sc = new Scanner(System.in); 
          Scanner sc1 = new Scanner(System.in); 

        // String input 
        name=sc.nextLine(); 
          CNP=sc1.nextLine(); 
    }
    
    
    boolean verify(){
        
        class Checkperson{
            boolean check(){
            
        
                if(Character.isUpperCase(name.charAt(0)))
                       return false;
                
                if(CNP.length() < 13 ) 
                       return false;
                
                if ( CNP.charAt(0)!=1|| CNP.charAt(0)!=2 )
                return false;
                       
                return true; }
        }
        return true;
    }
}
