package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 5, 8, 25, 15};

        int largest = arr[0];
        int secondLargest = arr[0];

        // First find largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Now find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }

	}


