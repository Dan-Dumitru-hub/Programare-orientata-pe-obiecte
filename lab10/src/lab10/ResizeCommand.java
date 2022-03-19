package lab10;

public class ResizeCommand extends ImageCommand{
	
	public Image undo(Image i) {
		
		i.before.blurred=i.blurred;
		i.before.rotate=i.rotate;
		i=i.before;
	
		
		return i;
	}
	
	public Image execute(Image i,String a) {
		
		i.size=a;
		return i;
	}

}
