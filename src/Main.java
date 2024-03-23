import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1(args);
        task2(args);
        task3(args);
    }
    public static void task1(String[] args) {
        System.out.println("TASK 1");
        int[] numbers = {1, 5, 3, 8, 13, 2};
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
        int numbers = 1;
        System.out.println(numbers);

    }

    public static void task3(String[] args) {
        System.out.println("TASK 3");
        int numbers = 2;
        System.out.println(numbers);

    }


}