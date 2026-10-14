public class Deletion {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int size = 5;
        int index = 2;

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}