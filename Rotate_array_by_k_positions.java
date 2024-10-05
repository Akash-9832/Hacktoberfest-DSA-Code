import java.util.*;

class Rotate_array_by_k_positions {
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // int[] myArray = { 1, 2, 3, 4, 5, 6, 7 };
        // int k = 3
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] myArray = new int[n];
		for(int i=0; i<n; i++){
			myArray[i] = sc.nextInt();
		}
        rotateArray(myArray, k);
        System.out.println("Rotated Array: " + Arrays.toString(myArray));
    }
    
}

