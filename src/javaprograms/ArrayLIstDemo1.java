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
      System.out.println("Arraylist is empty after adding values " + list.isEmpty());
      System.out.println("Contains of Arryalist after adding values" + list);
      boolean b1=list.contains("E");
      System.out.println("Value E is present"+b1);
      boolean b2=list.contains("R");
      System.out.println("Value R is present"+b2);
      list.remove("B");
      System.out.println("Size of ArrayList after deletion: " + list.size());
      
      System.out.println("Contains of Arryalist after deletion" + list);
      System.out.println("Size of ArrayList after claering: " + list.size());
      System.out.println("Contains of Arryalist after clearing" + list);
      
      
      
  	
  	
	
	
	}

}
