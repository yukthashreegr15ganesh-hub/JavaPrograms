package javaprograms;


	interface Atm {
		abstract void depo();
	}
	interface Atm1 {
		abstract void min();
	}
	public class AbstractInterface implements Atm, Atm1 {
		public void depo() {
			System.out.println("dep");
		}
		public void min() {
			System.out.println("min");
		}
		public static void main(String[] args) {
			AbstractInterface v = new AbstractInterface();
			v.min();
			v.depo();
		}
	}


