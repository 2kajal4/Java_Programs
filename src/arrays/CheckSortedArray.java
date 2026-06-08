package arrays;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1, 2, 3, 6, 5};   // given array

	        int i;

	        for (i = 0; i < arr.length - 1; i++) {

	            if (arr[i] > arr[i + 1]) {
	                break;
	            }
	        }

	        if (i == arr.length - 1) {
	            System.out.println("Array is Sorted");
	        } else {
	            System.out.println("Array is NOT Sorted");
	        }

	}

}
