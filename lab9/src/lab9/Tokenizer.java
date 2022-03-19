package lab9;

public interface Tokenizer {
String cv1="ceva";
	
	
 static String  getNext(String s , int i) {
	 
		 String[] arr = s.split(" ");  
		 
		 return arr[i+1];
	

}
 
 }
