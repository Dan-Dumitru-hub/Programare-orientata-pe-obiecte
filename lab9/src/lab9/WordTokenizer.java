package lab9;

public class WordTokenizer implements Tokenizer {
	Tokenizer s;
	String ceva;
	String [] cv;
	
	public String[] WordTokenizer(String s ){
		
		String[] arr = s.split(" ");  
		
		return arr;
	}
	
	
	public void getNext(String[] arr) {
		for ( String ss : arr) {
		    System.out.println(ss);
		}
		
	}

}
