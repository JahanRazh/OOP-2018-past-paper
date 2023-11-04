package q02a;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		//extend Thread
		CountDown countDown1 = new CountDown();//option1
		Thread countDown = new Thread(new CountDown());// option 2
		
		//implements Runnable option 
		Thread calcsum1 = new Thread(new Calcsum());
		Thread calcsum2 = new Thread(new Calcsum());
		
		calcsum1.setName("Black");
		calcsum2.setName("white");
		
		countDown.start();
		countDown.join();
		
		calcsum1.start();
		calcsum1.join();
		calcsum2.start();
		calcsum2.join();
		
	}

}
