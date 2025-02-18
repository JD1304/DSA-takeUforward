class Solution {
    // Function to sort the array using bubble sort algorithm recursively
    public void bubbleSort(int arr[]) {
        bubbleSortRecursive(arr, arr.length); // Call the recursive helper method
    }
    
    // Helper method to implement bubble sort recursively
    private void bubbleSortRecursive(int arr[], int n) {
        // Base case: if the array has 1 or fewer elements, it's already sorted
        if (n <= 1) return;

        // One pass of bubble sort: push the largest element to the end of the array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively call the function to sort the first (n-1) elements
        bubbleSortRecursive(arr, n - 1);
    }
}
