
import java.util.Arrays;

public class ArraySortingAndAverage {
    public static void main(String[] args) {
        // Create an array of numeric values
        double[] numbers = { 5.4, 3.2, 9.7, 2.8, 7.1 };

        Arrays.sort(numbers);

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
    }
}
