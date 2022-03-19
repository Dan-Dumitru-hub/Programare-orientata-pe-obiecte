package lab7;

public abstract class Square extends GeometricObject {
	int side;
	
	Square(int s){
		
		this.side=s;
		
	}
	
	
	double  getArea(){
		 
		 return this.side*this.side;
		 
		 
	 }
	 
	 
	 void display() {
		 
		 
		 System.out.print(this.side );}
	 
	 
	 
	 

}
