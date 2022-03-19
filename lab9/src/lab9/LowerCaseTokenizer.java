package lab9;

public class LowerCaseTokenizer extends TokenizerDecorator{
Tokenizer s;
	public LowerCaseTokenizer(Tokenizer s) {
		//this.s=s;
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	String getNext(String s) {
		
		return s.toLowerCase();
	}

	@Override
	void getNext() {
		// TODO Auto-generated method stub
		
	}

}
