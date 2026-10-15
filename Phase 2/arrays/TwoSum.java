// two sum in a sorted array
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8};
        int target = 10;

        // Find whether two numbers add up to 10

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } else if (sum > target) {
                right--;
            }
            else{
                left++;
            }
        }
    }
}