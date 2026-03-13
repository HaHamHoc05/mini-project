package miniproject.ArrayStatistics;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    static ArrayStatistics arrStats = new ArrayStatistics();
    static int[] arr = null;

    public static void main(String[] args) {

        int choice;

        do {
            menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arr = inputArray(sc);
                    break;

                case 2:
                    if (checkArray(arr)) {
                        System.out.println("Min = " + arrStats.findMin(arr));
                    }
                    break;

                case 3:
                    if (checkArray(arr)) {
                        System.out.println("Max = " + arrStats.findMax(arr));
                    }
                    break;

                case 4:
                    if (checkArray(arr)) {
                        System.out.println("Average = " + arrStats.calculateAverage(arr));
                    }
                    break;

                case 5:
                    if (checkArray(arr)) {
                        arrStats.sortArray(arr);
                        System.out.println("Array after sorting:");
                        arrStats.printArray(arr);
                    }
                    break;

                case 0:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    static void menu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Input Array");
        System.out.println("2. Find Min");
        System.out.println("3. Find Max");
        System.out.println("4. Calculate Average");
        System.out.println("5. Sort Array");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    static int[] inputArray(Scanner sc) {
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    return arr;
    }
    
    static boolean checkArray(int[] arr) {
    if (arr == null || arr.length == 0) {
        System.out.println("Please input array first!");
        return false;
    }
    return true;
}
}