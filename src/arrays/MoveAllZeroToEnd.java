package arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {2,6,0,5,0,8};
		
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		
		while(j<arr.length) {
			arr[j]=0;
			j++;
			
		}
		
		System.out.println("Arrays moving all zero to end");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
	}

}