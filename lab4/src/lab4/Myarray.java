/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author tipa
 */
public class Myarray {
    int [] tablou;
    int n;
 public int [] constructor (int n){
     for (int i=0;i<n;i++)
         tablou[i]=i;
     
     return tablou;
 }
 
 class Arrayiterator {
 
boolean hasNext(int i){
 return Myarray.this.tablou[i]!=0;
}
 
 boolean hasprevious(int i){
    return Myarray.this.tablou[i-1]!=0;
 }
 
 int next(int i)
 { if (Myarray.this.tablou[i+1]!=0)
     return Myarray.this.tablou[i+1];
 return -1;
     }
 
 int nextindex(int i){
 if (next(i)!=0)
     return i;
     return -1;
    }

 
 int prev(int i)
 { if (Myarray.this.tablou[i-1]!=0)
     return Myarray.this.tablou[i-1];
 return -1;
     }
 
  int prevtindex(int i){
 if (prev(i)!=0)
     return i;
     return -1;
    }

 }
 
 
 
 void printForward()
 {for (int i=0;i<n;i++)
 System.out.print(tablou[i]); 
 }
 
  void printbac()
 {for (int i=n;i>0;i--)
 System.out.print(tablou[i]); 
 }
 
  
  int firstMultiple(int k) {
      for (int i=0;i<n;i++)
          if(tablou[i]/k!=0)
              return i;
      return -1;
  }
  

}

