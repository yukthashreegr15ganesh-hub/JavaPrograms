package javaprograms;
import java.util.Iterator;
public class thread  extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("method"+i);
	}
	
	}
	public static void main(String[] args) {
		thread th = new thread();
		th.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main method"+i);
		}
	}
}
