package javaprograms;

import java.util.HashSet;

public class patternRecognition {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 50, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int number : numbers) {

            if (!set.add(number)) {
                System.out.println("Duplicate found: " + number);
            }
        }
    }
}