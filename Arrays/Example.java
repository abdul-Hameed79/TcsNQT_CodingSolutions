public class Example {
    public static int findCount(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                int currentsum = 0;
                for(int k=i; k<=j; k++) {
                    currentsum += arr[k];
                }
                if(currentsum == target) {
                    count++;
                }
            }
        }
        return count;
    }
    // Main.java
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 6, 3};
        int target = 12;
        System.out.println(findCount(arr, target));  // Output = 3  i.e, count of 6 comes 3 times in this array
    }
}
