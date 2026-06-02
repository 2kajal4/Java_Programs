package strings;

public class Multiply2Strings {

    public static void main(String[] args) {
        
        String s1 = "123";
        String s2 = "45";
        
        int n = s1.length();
        int m = s2.length();
        
        int[] res = new int[n + m];
        
        for(int i = n - 1; i >= 0; i--) {
            for(int j = m - 1; j >= 0; j--) {
                
                int digit1 = s1.charAt(i) - '0';
                int digit2 = s2.charAt(j) - '0';
                
                int mul = digit1 * digit2;
                
                int p1 = i + j;
                int p2 = i + j + 1;
                
                int sum = mul + res[p2];
                
                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
        }
        
        String ans = "";
        
        for(int num : res) {
            if(!(ans.length() == 0 && num == 0)) {
                ans += num;
            }
        }
        
        System.out.println(ans.equals("") ? "0" : ans);
    }
}