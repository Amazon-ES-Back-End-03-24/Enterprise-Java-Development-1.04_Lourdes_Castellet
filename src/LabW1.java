import java.util.Arrays;

public class LabW1 {
    public static void main(String[] args) {
        task1(args);
        System.out.println("\n");
        task2(args);
        System.out.println("\n");
        task3(args);
        System.out.println("\n");
        System.out.println("The end");
        // Making a change for the pull request
    }
    public static void task1(String[] args) {
        System.out.println("TASK 1");
        int[] numbers = {1, -5, 3, -8, 13, 2};
        System.out.println("My numbers are: ");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int largestNum = numbers[numbers.length - 1];
        int smallestNum = numbers[0];
        int result = largestNum - smallestNum;
        System.out.println("The largest number is " + largestNum);
        System.out.println("The smallest number is " + smallestNum);
        System.out.println("The difference between these is " + result);
    }

    public static void task2(String[] args) {
        System.out.println("TASK 2");
        int[] numbers = {10, -6, 2, 9, -13, 4};
        System.out.println("My numbers are: ");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The 2 smallest numbers are: ");
        for (int i = 0; i < 2; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void task3(String[] args) {
        System.out.println("TASK 3");
        int x = 5;
        int y = 12;
        System.out.println("x value is " + x + " and y value is " + y);
        int result = x * x + ((4 * y / 5) - x) * ((4 * y / 5) - x);
        System.out.println("Result: " + result);
    }
}