package lab10;

import java.util.ArrayList;

public interface Subject {
	
	
	public Messageset notifyObservers(String cv);

	public void registerObserver(Observer o, int i);

}
