package lab7;

import java.util.ArrayList;

public class GenericStack<E> {
	ArrayList<E> list;
	
	GenericStack() {}
	
	int getsize() {
		return list.size();
		
	}
	void push(E o) {
		list.add(o);
		
		}
	
	E peek() {
		return list.get(0);
			
	}
	
	E pop() {
		E i=list.get(0);
	
		list.remove(i);
		return i;
			}
	
	
	
	
	boolean isempthy()
	{return list.isEmpty();
		}
	
	
	public static <E> void printStack(GenericStack<E> st) {
		
		 int no_of_elements =  st.getsize();
		  for (int index = 0; index < no_of_elements; index++)
		   System.out.print(st.list.get(index));
		}
	
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int Left=0;
		int Right =list.length;
	    
		int Sol = -1; 
				
	    while(Left <= Right)
	    {
	        int Mid = (Left+Right) / 2;
	        if(((Comparable<E>) list[Mid]).compareTo(key)==0)
	        {
	            Sol = Mid;
	            break;
	        }
	        if(((Comparable<E>) list[Mid]).compareTo(key)>0)
	            Right = Mid - 1;
	        if(((Comparable<E>) list[Mid]).compareTo(key) <0)
	            Left = Mid + 1;
	    }
	    return Sol;
		
		
	}

		
	public static <E extends Comparable<E>> E max(E[] list) {
		E max=list[0];
		for(int i=0;i<list.length;i++) {
			if(list[i].compareTo(max)>0 )
				max=list[i];
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		GenericStack<Integer>  A=new GenericStack<Integer>();
		GenericStack<Double>  B=new GenericStack<Double>();
		GenericStack<String>  C=new GenericStack<String>();
		
		
		A.list=new ArrayList<Integer>();
		B.list=new ArrayList<Double>();
		C.list=new ArrayList<String>();
		
		System.out.print(A.isempthy());
		A.push(10);
		A.push(20);
		System.out.print(A.getsize());
		System.out.print(A.isempthy());
		
		System.out.print(A.peek());
		System.out.print(A.pop());
		
		A.printStack(A);
		
		
		//GenericStack<Integer>  D = new GenericStack<Integer>();//D.push(i);
		
		GenericStack<Integer>[] stiva;
		//for(int i=0;i<10;i++)
		//stiva[i]=new GenericStack<Integer>();
		
		
		//Integer b=1;
		//for(int i=0;i<10;i++)
			//stiva[i].push(i);
		//GenericStack<Integer> max1;
		
		
		
		
		
		System.out.println("/n");
		//GenericStack<Integer>[] list =(GenericStack<Integer>[]) new GenericStack[10];
		Integer [] c = {1, 2, 3, 4};
		Integer m = GenericStack.<Integer>max(c);//Integer[] c
		System.out.println(m);
		
		
		Integer sol=GenericStack.<Integer>binarySearch(c,m);
		System.out.println(sol);
		
	}
	
	
	

}
