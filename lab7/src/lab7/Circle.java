package lab7;

public abstract class Circle  extends GeometricObject{
	int radius;
	
Circle(int r){
	this.radius=r;
	
}

 double  getArea(){
	 
	 return this.radius*this.radius*(3.14);
	 
	 
 }
 
 
 void display() {
	 
	 
	 System.out.print(this.radius);
	 
 }
 




 

}
