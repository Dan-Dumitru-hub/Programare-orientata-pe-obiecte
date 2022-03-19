package lab9;

public class StopWordsTokenizer extends TokenizerDecorator {
Tokenizer s;
	public StopWordsTokenizer(Tokenizer s) {
		//this.s=s;
		super(s);
		
		
		// TODO Auto-generated constructor stub
	}
	
	void getNext ( String [] s1 , String[] s2) {
		for(int i=0;i<s1.length-1;i++) { 
			int k=1;
			for(int j=0;j<s2.length-1;j++) 
				if(s1[i] == s2[i])
					k=0;
			if(k==1)
				    System.out.println(s1[i]);

			
			}
			
		
	}

	@Override
	void getNext() {
		// TODO Auto-generated method stub
		
	}

	
	

}
