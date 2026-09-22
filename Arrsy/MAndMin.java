public class MAndMin {
    public static void main(String[] args) {

int[] arr = {5, 4, 3, 2, 1};

        int max = arr[0];
        int min = arr[0];
        int secondLargest = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        for (int num : arr) {
            if ((num > secondLargest) && (num < max)) {
                secondLargest = num;
            }
        }

        System.out.println("min " + min);
        System.out.println("second largest " + secondLargest);
        System.out.println("max " + max);

    }
}