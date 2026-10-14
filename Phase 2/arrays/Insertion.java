public class Insertion {
    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 50;

        int size = 4; // size tracks how many positions currently contain valid array elements. The array's actual capacity remains 5.
        int index = 2;
        int value = 99;

        // 10, 20, 30, 50, 0
        
        // shift elements right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        
        // 10, 20, 30, 30, 50

        arr[index] = value;

        size++;

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}