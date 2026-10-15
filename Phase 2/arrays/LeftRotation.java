public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        k = k % arr.length;

        // reverse first (k)

        int left = 0;
        int right = k - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // reverse remaining
        int leftRem = k;
        int rightRem = (arr.length - 1);

        while (leftRem < rightRem) {
            int temp = arr[leftRem];
            arr[leftRem] = arr[rightRem];
            arr[rightRem] = temp;

            leftRem++;
            rightRem--;
        }

        // Reverse all
        int leftAll = 0;
        int rightAll = arr.length - 1;

        while (leftAll < rightAll) {

            int temp = arr[leftAll];
            arr[leftAll] = arr[rightAll];
            arr[rightAll] = temp;

            leftAll++;
            rightAll--;
        }
        // display
        for (int z : arr) {
            System.out.print(z + " ");
        }

    }
}