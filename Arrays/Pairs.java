public class Pairs {
    
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,11,13};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
}
