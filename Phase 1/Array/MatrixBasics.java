public class MatrixBasics {
    public static void main(String[] args) {
        int[][] arr = { { 4, 1, 9 }, { 5, 2, 1 }, { 3, 7, 15 } };
        int[][] newArr = new int[arr.length][arr.length];

        // Transposing the 3*3 matrix

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }

        for (int[] row : newArr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
