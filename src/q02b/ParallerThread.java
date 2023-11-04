package q02b;
/*)implement  a Thread called
l) Have the followtng properties
mycalc(Calculation type),start,end(Integer type)
2) Implenent a constructor to get three three properties as parameters and
initialize them
3)the thread should compute the factorial fcr values between the range
start and end.*/

public class ParallerThread implements Runnable {
	
	private Calculation myCalc;  
	private int start;
	private int end;
	
	public ParallerThread(Calculation myCalc, int start, int end) {
		super();
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		//this kiyla dunnath aulak na 
		synchronized (ParallerThread.class) {
			myCalc.Factorial(start, end);
		}

	}

}
