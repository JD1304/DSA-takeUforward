public class Solution {
    
    // Function to demonstrate pass by value
    public static void passByValue(int num) {
        num = num + 1;  // Adding 1 to the passed value
        System.out.println("Value inside passByValue function: " + num);
    }

    // Function to demonstrate pass by reference
    public static void passByReference(int[] numArray) {
        numArray[0] = numArray[0] + 2;  // Adding 2 to the first element in the array
        System.out.println("Value inside passByReference function: " + numArray[0]);
    }

    public static void main(String[] args) {
        int a = 5;  // Initial value of a
        System.out.println("Original value of a: " + a);
        passByValue(a);  // Call pass by value
        System.out.println("Value of a after passByValue function: " + a);  // a should remain unchanged

        int[] arr = {5};  // Initial value of the array
        System.out.println("Original value of arr[0]: " + arr[0]);
        passByReference(arr);  // Call pass by reference
        System.out.println("Value of arr[0] after passByReference function: " + arr[0]);  // arr[0] should be modified
    }
}
