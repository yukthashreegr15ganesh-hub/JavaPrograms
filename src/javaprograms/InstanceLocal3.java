package javaprograms;

public class InstanceLocal3 {
	
		int a;
		int b;

		void m1(int a, int b) {
			this.a = a;
			this.b = b;
		}

		void m2() {
			System.out.println(a + b);
		}

		public static void main(String[] args) {
			InstanceLocal3 vv = new InstanceLocal3();
			vv.m1(4, 3);
			vv.m2();
		}
	}


