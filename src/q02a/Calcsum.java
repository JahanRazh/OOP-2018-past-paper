package q02a;

public class Calcsum implements Runnable {
	private long sum = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (Calcsum.class) {
			for (int i = 0; i < 100000; i++) {
				sum+=1;
			}
			System.out.println("Current Thread : "+Thread.currentThread().getName()+"Sum: "+sum);
		}
	}

}
