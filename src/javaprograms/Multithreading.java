package javaprograms;
class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<5; i++) {
			System.out.println("Thread is Running");
		}
	}
}
public class Multithreading {
	public static void main(String[] args) {

        MyThread obj = new MyThread();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }

}
