\\Java program to write a selection sort
import java.util.*;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        Random random = new Random();
        
        System.out.println("Populating array with random numbers...");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Original array:");
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println("Performing selection sort...");
        long startTime = System.currentTimeMillis();
        selectionSort(array);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println("\nExecution time: " + executionTime + " milliseconds");
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
