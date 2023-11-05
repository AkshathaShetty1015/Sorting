//Program to implement Quick sort
package quick;

import java.util.Random;
import java.util.Scanner;

/** Class QuickSort **/
public class QuickSort
{

/** Quick Sort function **/
public static void sort(int[] arr)
{
quickSort(arr, 0, arr.length - 1);
}

/** Quick sort function **/
public static void quickSort(int arr[], int low, int high)
{
int i = low, j = high;
int temp;
int pivot = arr[low];
/** partition **/
while (i <= j)
{
while (arr[i] < pivot)
i++;
while (arr[j] > pivot)
j--;
if (i <= j)
{
/** swap **/
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
}
/** recursively sort lower half **/
if (low < j)
quickSort(arr, low, j);
/** recursively sort upper half **/
if (i < high)
quickSort(arr, i, high);
}

/** Main method **/
public static void main(String[] args)
{
Scanner scanner = new Scanner( System.in );
System.out.println("Quick Sort Test\n");
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();
int[] array = new int[size];
Random random = new Random();
System.out.println("Populating array with random numbers...");
for (int i = 0; i < size; i++) {
array[i] = random.nextInt();
}
System.out.println("Original array:");
for (int i = 0; i < size; i++) {
System.out.println(array[i] + " ");
}
long startTime = System.currentTimeMillis();
sort(array); //Call method sort
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
/** Print sorted Array **/
System.out.println("\nElements after sorting ");
for (int i = 0; i < size; i++) {
System.out.println(array[i] + " ");
}
System.out.println("Total Time taken to sort the numbers is: "+executionTime+" MilliSeconds");
scanner.close();
}
}
