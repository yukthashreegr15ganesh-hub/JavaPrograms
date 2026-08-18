package javaprograms;

public class Polymorpshism {
		void m1() {
			System.out.println("sdfa");
		}
		void m1(int a) {
			System.out.println("dfasdfasdfasfas");
		}
		public static void main(String[] args) {
			Polymorpshism test = new Polymorpshism();// object
			test.m1();
			test.m1(3);
		}
	}



