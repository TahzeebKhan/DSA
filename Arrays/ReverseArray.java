public class ReverseArray {
    
    public static void main(String[] args) {
        int arr[] = {3,21,45,67,87,6};

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int arr[]){
        
        int start = 0, end = arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }
}
