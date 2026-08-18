package javaprograms;

public class Overriding1 {
			void minbal() {
			System.out.println("sdfa");
		}
		void minbal(int a) {
		
			System.out.println("dfasdfasdfasfas");
		}
		public static void main(String[] args) {
			Overriding1 test = new Overriding1 ();// object
			test.minbal();
			test.minbal(3);
		}
	}

