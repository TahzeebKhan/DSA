class SubArray{

    public static void main(String[] args) {
        int arr[] = {3,4,2,5,2};

        SubArray(arr);
    }

    public static void SubArray(int arr[]){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]);
                }
                count++;
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("total no. of subarrays = "+count);
    }
}