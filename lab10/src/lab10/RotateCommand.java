package lab10;

public class RotateCommand extends ImageCommand {
	
	public  Image undo(Image i) {
		i.before.blurred=i.blurred;
		i.before.size=i.size;
		i=i.before;
		return i;
	}
	
	public Image execute(Image i,String rotate) {
		i.rotate=rotate;
		return i;
	}

}
