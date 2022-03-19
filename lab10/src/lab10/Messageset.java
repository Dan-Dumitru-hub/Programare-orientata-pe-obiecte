package lab10;

import java.util.ArrayList;

public class Messageset {
	public Observer observers;
	public ArrayList<String> mesaje;
	
	public void registerObserver(Observer o,int i) {
		// TODO Auto-generated method stub
		this.observers=o;
	}
	public Messageset notifyObserversenglish(String cv,Messageset ms) {
		// TODO Auto-generated method stub
		
			ms.observers.english.add(cv);
			//System.out.println("observe");
		return ms;}
	
	
	
	public Messageset() {
		mesaje = new ArrayList();
		observers = new Observer();
		}
	
	public void printms(Observer o,int i,Messageset ms) {
		if (i>=o.english.size()) {
			
			System.out.println(ms.mesaje.get(i));
		}
		
		else System.out.println(o.english.get(i));
		
	}
	
public static void main(String[] args){
		
Messageset ms1=new Messageset();

ms1.mesaje.add("salut");
ms1.mesaje.add("masina");
ms1.mesaje.add("balon");



Observer o=new Observer();
o.english.add("Hello");
o.english.add("car");


ms1.observers=o;

//System.out.println(o.english.size());

ms1.printms(o, 2, ms1);


ms1 = ms1.notifyObserversenglish("baloon",ms1);
ms1.printms(o, 2, ms1);
		
	}


}
