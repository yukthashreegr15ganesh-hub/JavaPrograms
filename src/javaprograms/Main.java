package javaprograms;
import java.util.Scanner;

class Calculator {

    // Addition
    void addition(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Subtraction
    void subtraction(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    // Multiplication
    void multiplication(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    // Division
    void division(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + ((double) a / b));
        else
            System.out.println("Cannot divide by zero");
    }

    // Fibonacci
    void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci = ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // Factorial
    void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    // Area of Triangle
    void triangleArea(double base, double height) {
        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);
    }

    // Palindrome
    void palindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object
        Calculator obj = new Calculator();

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // Calling methods
        obj.addition(x, y);
        obj.subtraction(x, y);
        obj.multiplication(x, y);
        obj.division(x, y);

        System.out.print("\nEnter number of Fibonacci terms: ");
        int n = sc.nextInt();
        obj.fibonacci(n);

        System.out.print("\nEnter number for factorial: ");
        int f = sc.nextInt();
        obj.factorial(f);

        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        obj.triangleArea(base, height);

        System.out.print("\nEnter number for palindrome: ");
        int p = sc.nextInt();
        obj.palindrome(p);

        sc.close();
    }
}


