package lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Prob1 {
	
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
	
	 
	 File file = new File("bugs.txt");
     FileInputStream fis = new FileInputStream(file);
     byte[] bytesArray = new byte[(int)file.length()];
     fis.read(bytesArray);
     String s = new String(bytesArray);
     String [] data = s.split("( )|(,)|(/)|(\n)",70);
     
     //System.out.println(data.length);
   //  for (int i=0; i<data.length; i++) 
    //	 System.out.println(data[i]);
     
     
     for (int i=0; i<data.length-1; i++) 
    	 for (int j=i+1; j<data.length; j++) {
    		 
    		 if(data[i].compareTo(data[j]) > 0 ) {
    		  String abs =data[i];
    		 data[i]=data[j];
    		  data[j]=abs;
    		 }
    		 //if(data[i].compareTo(data[j]) == 0 ) {
    		//	 for(int k=j ;k < data.length-1;k++)
    		//	 data[k]=data[k+1];
    		//	 data[data.length-1]="0";
    		// }
    		 
    		 
    	 }
     
     //for (int i=0; i<data.length; i++) 
    	// System.out.println(data[i]);
    	 
      
     List<String> arrayList = new ArrayList<String>();
     for (int i=0; i<data.length; i++) 
    	 arrayList.add(data[i]);
     
     for(int k=0;k<arrayList.size();k++)
     for (int i=0; i<arrayList.size()-1; i++) 
    	 for (int j=i+1; j<arrayList.size(); j++) {
    		 //System.out.println(arrayList.get(j));
    		 
     if(arrayList.get(i).compareTo(arrayList.get(j))==0)
    		 
     arrayList.remove(j);
     
     }
     
     
     
     for (int i=0; i<arrayList.size()-1; i++) 
    	 for (int j=i+1; j<arrayList.size(); j++) {
    		 //System.out.println(arrayList.get(j));
    		 
     if(arrayList.get(i).compareTo(arrayList.get(j))==0)
    		 
     arrayList.remove(j);
     
     }
     
     
     
     System.out.println(arrayList);
     
     
     Set<String> set = new HashSet<String>();
     for (int i=0; i < data.length; i++) 
     set.add(data[i]);
     //System.out.println(set);
     
	 }

}
