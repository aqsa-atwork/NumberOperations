import java.util.Scanner;

public class NumberOperations {
// Finding second highest and second lowest
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void findSecondValues(int[] arr) {
        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        sortArray(numbers);

        System.out.println("\nSorted Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        findSecondValues(numbers);

        sc.close();
    }
}
