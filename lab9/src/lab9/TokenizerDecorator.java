package lab9;

public abstract class TokenizerDecorator implements Tokenizer {
	
	//public TokenizerDecorator(Tokenizer s) {}
	
	Tokenizer s;
	TokenizerDecorator(Tokenizer s){
		this.s=s;
	}
	 abstract void getNext();

}
