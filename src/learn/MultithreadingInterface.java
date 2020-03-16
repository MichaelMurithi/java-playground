package learn;

class HI implements Runnable {
	public void run() {
		for(int i =0;i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
	}
	}
}

class HEL implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class MultithreadingInterface {
	public static void main(String[] args) {
		Runnable obj1 = new HI();
		Runnable obj2 = new HEL();
		Thread T1 = new Thread(obj1);
		Thread T2 = new Thread(obj2);
		T1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		T2.start();
	}
}

