package lab11;

public class ConsumerTask extends Buffer implements Runnable {

	@Override
	public void run() {
		int i=5;
		// TODO Auto-generated method stub
		while (i>0) {
			this.read();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	

}
