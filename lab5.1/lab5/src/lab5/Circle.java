/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author tipa
 */
public  class Circle {
 
     
    double radius;
    int number;
    
    void  setRadius( double newradius) throws InvalidRadiusException{
        
        this.radius=newradius;
        if ( newradius < 0)
            throw new InvalidRadiusException();
                    /*new IllegalArgumentException ("nu poate fi zero");*/
       this.number+=1;
    }
  
    public  static void main(String[] args) throws InvalidRadiusException ,NumberFormatException {
        // TODO code application logic here
        
        Circle c1;
        c1= new Circle();
        double r=10;
        c1.setRadius(r);
        r=9;
        c1.setRadius(r);
        System.out.println ( "aria este" +c1.number );
        
        
    }
    
    
}
