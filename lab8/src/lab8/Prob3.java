package lab8;
import java.util.*;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator; 
//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Map;

//import com.sun.javafx.collections.MappingChange.Map;

public class Prob3 {
	String nume;
	float medie;
	
	//public int compareTo()
	
	
	void addstud(Prob3 a , SortedMap<Float, String> sm) {
		sm.put(a.medie, a.nume);
	  }
  
  
  public static void main(String[] args) { 
  SortedMap<Float, String> sm =  new TreeMap<Float, String>(Collections.reverseOrder()); 
  
  Prob3 a=new Prob3();
  a.nume="ana";
  a.medie=(float)0.5;
  
  Prob3 b=new Prob3();
  b.nume="bana";
  b.medie=(float)1.5;
  
  
  
  sm.put(b.medie,b.nume);
  sm.put(a.medie,a.nume);
  
 // a.medie=5;
  //a.nume="dc";
  //sm.put(a.medie,a.nume);
  
  
  
  for(float i=0;i<11;i++)
   sm.put(i,"cv");
  sm.put((float)5.5,"dd");
  System.out.println("SortedTreeMap: " + sm);
  
 // for (Float medie : sm.keySet())  
     // System.out.println("medie: " + medie); 

 // for (String nume : sm.values())  
 //     System.out.println("nume: " + nume); 

 
	 Set s = sm.entrySet(); 
	 Iterator i = s.iterator(); 
	  
	 float j=(float)10;
	 float m1=10;
     while (i.hasNext()) 
     {  
        Map.Entry m = (Map.Entry)i.next(); 

        float key = (float)m.getKey(); 
        String value = (String)m.getValue(); 
       // System.out.println(key); 
        
        if(m1-key <1 && m1-key >= 0)
        { m1--;
    float k = j;
        
        System.out.println("nume cu medii de" + (int)k); }
        
       // if(j-key == 1) {
       	// j=j-1;
        //System.out.println(j);
       // }
        j=m1;
        
         if(j<key && key <= j+1) 
        	 System.out.println(value); 
         
        
     } 
	  	  
  }
}
