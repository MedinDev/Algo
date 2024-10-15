package work;

import java.util.Arrays;

public class BigOAnalyzer {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000, 20000}; // Different input sizes

        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            System.out.println("Input size: " + size);

            // Analyze Bubble Sort
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            bubbleSort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort time: " + (endTime - startTime) + " nanoseconds");

            // Analyze Selection Sort
            arrayCopy = Arrays.copyOf(array, array.length);
            startTime = System.nanoTime();
            selectionSort(arrayCopy);
            endTime = System.nanoTime();
            System.out.println("Selection Sort time: " + (endTime - startTime) + " nanoseconds");

            // Analyze Merge Sort
            arrayCopy = Arrays.copyOf(array, array.length);
            startTime = System.nanoTime();
            mergeSort(arrayCopy);
            endTime = System.nanoTime();
            System.out.println("Merge Sort time: " + (endTime - startTime) + " nanoseconds");

            System.out.println("--------------------------");
        }
    }

    // Generate random array of given size
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

    // Bubble Sort O(n^2)
    private static void bubbleSort(int[] arr) {
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

    // Selection Sort O(n^2)
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Merge Sort O(n log n)
    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}