package lab9;

public class Pizzafactory {
	public Pizza createPizza(String type, int i,int j) { // metoda factory
		Pizza pizza = null;
		if (type.equals("Quatroformaggi")) {
		pizza = new Quatroformaggi(); //obiecte concrete
		} else if (type.equals("Primavera")) {
		pizza = new Primavera();
		} else if (type.equals("Peperoni")) {
		pizza = new Peperoni();
		} 
		pizza.price=i;
		pizza.size=j;
		return pizza;
		}

}
