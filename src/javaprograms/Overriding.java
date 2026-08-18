package javaprograms;

	class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class Overriding extends Parents {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			Overriding  test = new Overriding();// object
			test.marry();
			test.property();
		
		}
	}



