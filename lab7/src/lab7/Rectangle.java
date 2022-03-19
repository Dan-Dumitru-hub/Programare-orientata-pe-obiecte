package lab7;

import java.util.ArrayList;

public abstract class Rectangle extends GeometricObject {
	int width;
	int height;
	
	Rectangle(int w,int h){
		
		this.width=w;
		this.height=h;
		
	}
	
	
	double  getArea(){
		 
		 return this.width*this.height;
		 
		 
	 }
	 
	 
	 void display() {
		 
		 
		 System.out.print(this.width +" "+this.height);}
	 
	 
	 public static void main(String[] args) {
			
			
			GeometricObject [] A=new GeometricObject[10];
			
			
			Circle c = new Circle(5) {};
			c.radius=10;
			Rectangle R;
			Square S;
			//A[1]=c;
			//System.out.print(A[1].getArea());
			
			
			A[1]=new Circle(5) {};
			A[2]=new Rectangle(10,5) {};
			A[3]=new Square(5) {};
			A[4]=new Circle(100) {};
			//A.maximumArea(A);
			
			ArrayList<GeometricObject> B= new ArrayList<GeometricObject>();
			
			
			B.add(A[1]);
			B.add(A[2]);
			B.add(A[3]);
			maximumArea(B);
			System.out.println("/n");
			
			B.add(A[4]);
			maximumArea(B);
			
			System.out.println("/n");
			
			
		//	GeometricObject [] F =new GeometricObject[10];
			//for(int i=0;i<10;i++)
		//	F[i]=new Circle(i) {};
			
			Circle [] D = new Circle [11];
			for(int i=0;i<11;i++)
			D[i]=new Circle(i) {};
			
			
			
			ArrayList<Circle> E= new ArrayList<Circle>();
			for(int i=0;i<11;i++)
				E.add(D[i]);
			
			maximumArea(E);
			
			
	 }
	 
	 

}
