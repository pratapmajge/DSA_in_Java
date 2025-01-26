public class Merge1 {

    public static void conquer(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the result
        int merged[] = new int[ei - si + 1];

        int idx1 = si;  // It will track the index of the first divided array
        int idx2 = mid + 1;  // It will track the index of the second divided array
        int x = 0;  // It will track the index of the merged array

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {  // If element of array-1 is smaller
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {  // If element of array-2 is smaller
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        // If there are any remaining elements in the first array (array-1)
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        // If there are any remaining elements in the second array (array-2)
        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        // Copy the merged array into the original array
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;  // (si + ei) / 2 to prevent overflow
        divide(arr, si, mid);  // Recursively divide the left part
        divide(arr, mid + 1, ei);  // Recursively divide the right part
        conquer(arr, si, mid, ei);  // Merge the two halves
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 9, 5};
        int n = arr.length;

        divide(arr, 0, n - 1);  // Call the divide function

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
