package lab8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Patient implements Comparable<Patient> {
	String name;
	int priority;
	
	Patient(){}
	
	 public int compareTo(Patient patient) {
		 if (this.priority < patient.priority) return -1;
		 else if (this.priority > patient.priority) return 1; 
		return 0;}

	 
	 
	 
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
		 java.util.PriorityQueue<Patient> queue = new
				 java.util.LinkedList<Patient>();
		 
		Patient red=new Patient();
		red.name="AA";
		red.priority=100;
		queue.offer(red);
		
		
		Patient red1=new Patient();
		red1.name="Ab";
		red1.priority=10;
		queue.offer(red1);
		
		
		Patient red2=new Patient();
		red2.name="Ac";
		red2.priority=11;
		queue.offer(red2);
		
		red2=queue.remove();
		 //System.out.print(red2.name);
		
		Patient red3=new Patient();
		red3.name="Ad";
		red3.priority=12;
		queue.offer(red3);
		
		Patient red4=new Patient();
		red4.name="AE";
		red4.priority=145345;
		queue.offer(red4);
		
		
		
		 while (queue.size() > 0) {
			 red2=queue.remove();
			 System.out.print(red2.name + " ");
		 }
		  
	 }
	 	  
}
