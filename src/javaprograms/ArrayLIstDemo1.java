package javaprograms;
import java.util.ArrayList;
public class ArrayLIstDemo1 {
	public static void main(String[] args) {
	ArrayList list= new ArrayList()	;
	System.out.println("Initialise size of arraylist before adding elements"+list.size());
	System.out.println("Array list is empty before adding"+list.isEmpty());
	System.out.println("Contents of arraylist before adding values"+list);
	  list.add("C");
      list.add("A");
      list.add("E");
      list.add("B");
      list.add("D");
      list.add("F");
      
      // can add duplicates and null values in ArrayList
      list.add("A");
      list.add(null);
      
      System.out.println("Size of ArrayList after adding elements: " + list.size());
	
	
	
	}

}
