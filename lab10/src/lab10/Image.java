package lab10;

import java.io.IOException;

public class Image {
String size;
String blurred;
String rotate;
Image before;
	
	Image(){}
	Image comanda (Image i,ImageCommand c){
		i=c.execute(i, c.a);
		return i;
	}
	
	Image undo (Image i,ImageCommand c){
		i=c.undo(i);
		return i;
	}
	
	public static void main (String[] args) throws IOException {
		
		
		Image i1=new Image();
		i1.size="100";
		i1.blurred="false";
		i1.rotate="right";
		
		
		i1.before=new Image();
		i1.before.size=i1.size;
		i1.before.rotate=i1.rotate;
		i1.before.blurred=i1.blurred;
		//System.out.println(i1.before.size);
		//Image i2=new Image();
		
		
	BlurCommand b2= new BlurCommand();
	b2.a="true";
	ResizeCommand c2=new ResizeCommand();
	c2.a="1000";
	ResizeCommand c3=new ResizeCommand();
	c3.a="200";
	
	i1=i1.comanda(i1, b2);
		System.out.println(i1.blurred);
		
		i1=i1.undo(i1, b2);
		System.out.println(i1.blurred);
		
		i1=i1.comanda(i1, c2);
		System.out.println(i1.size);
		i1.before.size=i1.size;
	
	
		i1=i1.comanda(i1, c3);
		i1=i1.undo(i1, c3);
		
		
		System.out.println(i1.size);
		
		
		
		
	}

}
