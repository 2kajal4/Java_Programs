package strings;

public class EvenWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="Hi myself kajal Shukla here";
		
		String word[] =sentence.split(" ");
		
		for(int i=0;i<word.length;i++) {
			int length=word[i].length();
			
			if(length%2==0) {
				System.out.println(word[i]);
			}
		}
	}

}
