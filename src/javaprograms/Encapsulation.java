package javaprograms;

public class Encapsulation {

    private int a;

    // Setter method
    public void setA(int a) {
        this.a = a;
    }

    // Getter method
    public int getA() {
        return a;
    }

    public static void main(String[] args) {

        // Creating object
        Encapsulation test = new Encapsulation();

        // Setting value
        test.setA(11);

        // Getting value
        int aa = test.getA();

        // Printing value
        System.out.println(aa);
    }
} 