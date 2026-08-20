package javaprograms;

public class StudentDemo2 {
	public static void main(String[] args) {
		String[] students= {"rahul","lakshmi","anisha"};
		String search ="rahul";
		for(int i=0; i<students.length-1; i++) {
			if(students[i].equals(search)) {
			System.out.println("student Found");
			break;
		}
	}

}
}
