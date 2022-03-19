package lab9;

public class CharacterTokenizer extends TokenizerDecorator {
	CharacterTokenizer(Tokenizer s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	Tokenizer s;
	
	//public CharacterTokenizer(Tokenizer s) {
	//this.s=s;
		// TODO Auto-generated constructor stub
	//}
	
	void getNext(String s){
		for (int i =0;i<s.length()-1;i++) 
			  System.out.println(s.charAt(i));

		
	}
	void getNext() {
		// TODO Auto-generated method stub
		
	}
	
	 public static void main (String[] args) {
		 
		 WordTokenizer a=new WordTokenizer();
		
		 
		 a.ceva= "cv1 cv2 cv3";
		 
		a.cv = a.WordTokenizer(a.ceva);
		 
		 a.getNext(a.cv);
		 
	
		// a=new LowerCase();
		 
		 Tokenizer aa = null;
		 Tokenizer b;
	
		 aa=new CharacterTokenizer(aa);
	
		  System.out.println();

		 
	 }

	

	
	

}
