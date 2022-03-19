package lab11;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer  {
	static final int capacitate = 5;
	 LinkedList<Integer> lista;
	 Lock lock = new ReentrantLock();
	  Condition notEmpty = lock.newCondition();
	  Condition notFull = lock.newCondition();
	  Buffer(){}
	  
	 void write (int value) {
		 lock.lock();
		 try {
			notFull.await();
			this.lista.offer(value);
			notEmpty.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		 
	 }
	 int read () {
		 lock.lock();
		 int a=0;
		 try {
			notFull.await();
			a=this.lista.remove();
			notEmpty.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		return a;
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Buffer b =new Buffer();
		 b.lista=new LinkedList<>();
		 b.write(4);
		 b.write(2);
		 ProducerTask p = new ProducerTask();
		 p.lista=new LinkedList<>();
		 ExecutorService executor =
				 Executors.newFixedThreadPool(2);
		 executor.execute(p.run); 
		 executor.shutdown();

	 }
}
