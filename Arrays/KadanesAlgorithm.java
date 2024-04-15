package Arrays;

class KadanesAlgorithm {
    // Function to calculate sum of max sub array
    static void subarraysum(int[] arr) {
        int maxsum = arr[0];
        int currentsum = arr[0];

        for(int i=1; i<arr.length; i++) {
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println("sum of max sub arr is: " + maxsum);
    }
    public static void main(String[] args) {
        int[] nums = {-2, -1, -5, -8, -6};

        // Function call
        subarraysum(nums);
    }
}