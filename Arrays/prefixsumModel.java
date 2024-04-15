package Arrays;

class prefixsumModel {
    // Function to calculate sum of max sub array
    static void subarraysum(int[] arr) {
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        int maxsum = 0;
        for(int current : prefix) {
            if(current > maxsum) {
                maxsum = current;
            }
        }
        System.out.println("max sub array sum is: " + maxsum);
    }

    // Main.java
    public static void main(String[] args) {
       int[] nums = {7, 5, -2, -1, 3};
       
       // Function call
       subarraysum(nums);
    }
}