package javaprograms;

public class TotalSalary {
public static void main(String[] args) {
	int[] salary= {10000,15000,18000,20000};
	int totalsalary=0;
	for(int i=0; i<salary.length; i++) {
		totalsalary=totalsalary+salary[i];
	}
System.out.println("Totalsalary"+totalsalary);
}
}
