package arrays;

public class PeakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,6,2,5,7};
		for (int i = 0; i < arr.length; i++) {
		    // Check if it's greater than left neighbor (or if it has no left neighbor)
		    boolean leftCorrect = (i == 0) || (arr[i] > arr[i - 1]); // either 1st or bigger then previous element
		    
		    // Check if it's greater than right neighbor (or if it has no right neighbor)
		    boolean rightCorrect ;
		    if(i == arr.length - 1) {
		    	rightCorrect = true;
		    }
		    else {
		    	rightCorrect = arr[i] > arr[i + 1];
		    }
		    
//		    System.out.println("arr len" + arr.length);
		    if (leftCorrect && rightCorrect) {
		        System.out.println("Peak Index :" + i);
		        System.out.println("Peak Element:" + arr[i]);
		        continue;
		    }
		}

	}

}
