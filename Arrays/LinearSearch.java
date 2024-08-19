import java.util.*;

class LinearSearch {

    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + "th value:");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Value to search:");
        int num = sc.nextInt();

        int index = linearSearch(arr, num);

        String result = (index > -1) ? "Element found at position " + (index + 1) : "Not Found";
        System.out.println(result);
    }

    public static int linearSearch(int arr[], int item) {
        // Performing Linear Search over here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1; // Element not found in the array.
    }
}