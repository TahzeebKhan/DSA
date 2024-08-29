public class MaxSubArray02 {

    public static void main(String[] args) {
        int arr[] = { 15,-5,-7,8,-9 };

        MaxSubArray(arr);
    }

    public static void MaxSubArray(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max SubArray Sum = " + maxSum);
    }
}
