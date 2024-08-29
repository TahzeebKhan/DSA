
import java.util.*;

public class Binary_Search {

    public static void main(String[] args) {

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Key You want to Find:");
        int key = sc.nextInt();

        int index = BinarySearch(arr, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at " + (index + 1) + "th position");
        }

    }

    // Binary Search Function
    public static int BinarySearch(int arr[], int key) {

        //  Sorting the unsorted array in ascending order
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Finding the element Using Binary Search
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] < key) {
                start = mid + 1;

            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
