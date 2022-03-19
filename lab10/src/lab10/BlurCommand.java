package lab10;

public class BlurCommand extends ImageCommand {
	
	public Image execute(Image i,String a ){
		i.blurred=a;
		return i;
	}
	 public Image undo(Image i) {
		
		i.before.size=i.size;
		i.before.rotate=i.rotate;
		i.blurred=i.before.blurred;
		return i;
	}

}
