public class Quicksort {
    // Partition function to rearrange elements around the pivot
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the pivot as the last element
        int i = low - 1; // i will track the index of smaller elements than the pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Increment the index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at i+1 position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        return i; // Return the index of the pivot
    }

    // Quicksort function to recursively sort the array
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quicksort(arr, low, pivotIndex - 1); // Left of pivot
            quicksort(arr, pivotIndex + 1, high); // Right of pivot
        }
    }

    // Main function to test the quicksort
    public static void main(String args[]) {
        int arr[] = {3, 2, 5, 8, 4, 7}; // Example array
        int n = arr.length;

        quicksort(arr, 0, n - 1); // Start sorting from index 0 to n-1

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
