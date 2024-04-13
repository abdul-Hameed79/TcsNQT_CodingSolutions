// write a java program to find the largest element present in an array

public class FindLargest {

    // Function to find Largest Number
    public static int LargestNum(int[] arr) {
        int maxNum = arr[0]; // Initial Value

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > maxNum) {
                // Swap
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {9, 5, 10, 2, 32, 7};  // Output: 32

        System.out.println("Largest Number present in the array is: " + LargestNum(arr));
    }
}