package lab11;

public class ProducerTask extends Buffer implements Runnable {

	ProducerTask(){}
	Runnable run= () -> {
	 //public void run() {
		// TODO Auto-generated method stub
		int i=5;
		
		while (i>0) {
			this.write(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	 }
	
	
	


