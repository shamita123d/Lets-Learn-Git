import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Elements ::");
        int n = sc.nextInt();
        
        System.out.println("Enter the Array Elements :: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroesToEnd(arr, n);

        System.out.println("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroesToEnd(int arr[], int n) {
        int count = 0; // Non-zero elements ke liye index
        
        // Step 1: Non-zero elements ko shift karo
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {  
                arr[count] = arr[i]; 
                count++;
            }
        }

        // Step 2: Baaki places ko zero se fill karo
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }
}
