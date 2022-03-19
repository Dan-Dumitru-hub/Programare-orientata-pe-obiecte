package lab7;

import java.util.ArrayList;

public abstract class  GeometricObject implements Comparable {
	
	GeometricObject(){}
	
	abstract double  getArea();
	abstract void display();
	

public int compareTo(Object o) {
 if (o instanceof Circle) {
	 Circle c =(Circle)o;
 
	if (this.getArea() == c.getArea())
		return 0;	
	if (this.getArea() > c.getArea())
		return 1;
	return -1;}
 
 
 
 
	if(o instanceof Rectangle) {
	Rectangle r=(Rectangle)o; 
	
	if (this.getArea() == r.getArea())
		return 0;	
	if (this.getArea() > r.getArea())
		return 1;
	return -1;}
	
	if(o instanceof Square) {
	Square s=(Square)o; 
	
	if (this.getArea() == s.getArea())
		return 0;	
	if (this.getArea() > s.getArea())
		return 1;
	return -1;}
	return 0;
	
	
}


public static void maximumArea(ArrayList<? extends GeometricObject> list) {
	
	int max=0;
	double max1=0;
	for(int i=0;i<list.size();i++) {
		
		if(max1 < list.get(i).getArea()) {
			max1=list.get(i).getArea();
		max=i;
		}
	}
	
	System.out.print( list.get(max).getArea());
	
}

public static void main(String[] args) {
	
	
	GeometricObject [] A=new GeometricObject[10];
	
	
	
	
	
	
	
}





}
