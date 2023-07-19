package sample;

public class Reversearray {
	public static void main(String[] args) {
        int[] A = {2,5,6};
        int B = 0;
        int C = 2;
        
        reverseArrayInRange(A, B, C);
        
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
    
    public static void reverseArrayInRange(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length || start > end) {
            return; 
        }
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
