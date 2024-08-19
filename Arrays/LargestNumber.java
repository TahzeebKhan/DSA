import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(FindLargest(arr) + " is the largest Number in an Array");
        System.out.println(FindSmallest(arr) + " is the Smallest Number in an Array");
    }

    //  Function to find largest Number in an Array
    public static int FindLargest(int arr[]) {
        
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    //  Function to find Smallest Number in an Array
    public static int FindSmallest(int arr[]) {

        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
