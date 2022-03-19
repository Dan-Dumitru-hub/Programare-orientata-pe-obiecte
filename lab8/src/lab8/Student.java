package lab8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

public class Student {
	
	String nume;
	float medie;
	Student(){}
	public String  toString() {
		return nume;}
	
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
		 
		 
		 Set<Student> set = new HashSet<Student>();
		 
		 
		 Student aa=new Student();	 
		 aa.nume="maria";
		 aa.medie=10;
		 
		 set.add(aa);
		 Student ac=new Student();	 
		 ac.nume="maria";
		 ac.medie=10;
		 set.add(ac);
		 
		 aa.nume="meria";
		 aa.medie=11;
		 
		 set.add(aa);
		 
		 Student ab=new Student();	 
		 ab.nume="miria";
		 ab.medie=12;
		 
		 set.add(ab);
		 
		 
		 
		 System.out.println(set);
		 
		 	 
	 }
}
