package javaprograms;

public class InstanceLocal {
		int a = 20;

		void m1(int b) {
			System.out.println("dfasdf "+b);
			System.out.println("dfasdf "+a);
		}

		public static void main(String[] args) {
			InstanceLocal   vv = new InstanceLocal ();
			vv.m1(4);
		}
	}


