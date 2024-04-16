// Given an array of elements whose length is N, print true if the array contains duplicates or print false if it doesn't

package Arrays;

public class Duplicate {
    static boolean FindDuplicate(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main.java
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3, 2, 7, 1};

        // Function call
        System.out.println(FindDuplicate(arr));
    }
}