package q02b;
/*iii) Implement a class called that contains ( )
function. It sixfold do the following
l)Create an object of the class.
2)Create four threads of the class making use of
the object created earher_
3)Use the four threads to compute the factorial of 40 by changing the
work equally among the four threads.
4)Fanany displays the factorial of 40
*/
public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Calculation calc = new Calculation();
		
		Thread t1 = new Thread(new ParallerThread(calc, 1, 10));
		Thread t2 = new Thread(new ParallerThread(calc, 11, 20));
		Thread t3 = new Thread(new ParallerThread(calc, 21, 30));
		Thread t4 = new Thread(new ParallerThread(calc, 31, 40));
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		t4.join();
		
		System.out.println("Factorial of 40 :"+calc.getAns()); 
		
	}



}
