package miniproject.ArrayStatistics;

import java.util.Arrays;

public class ArrayStatistics {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}