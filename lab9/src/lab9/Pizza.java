package lab9;

public abstract class Pizza {
	int size;
	int price;
	
	 Pizza(){};
	 
	 private static Pizza uniqueInstance;
	 
	 
	 public static Pizza getInstance() {
		 if (uniqueInstance == null) {
		 uniqueInstance = new Pizza(){};
		 
		 }
		 return uniqueInstance;
	 }
	 public static void main (String[] args)
	 {
		 
		 Pizza [] v= new Pizza[3];
		v[0]=new Primavera();
		 v[0].price=10;
		 v[0].size=10;
		 
		 Pizzafactory a= new Pizzafactory();
		 
		 v[0]=a.createPizza("Peperoni",10,10);
		 v[1]=a.createPizza("Primavera", 5, 5);
		 v[2]=a.createPizza("Quatroformaggi", 2, 2);
		
		 for (int i=0;i<3;i++)
			 System.out.println(v[i].toString());
		 
	 }

}
