public class ArRotation {
    public static void main(){
int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % arr.length;

        // Store the first k elements
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        // Put the first k elements at the end
        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i];
        }

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}
