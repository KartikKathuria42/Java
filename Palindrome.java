import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        // m  a  d  a  m
        // 0  1  2  3  4
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String rst = "";
        int n = st.length();
        for (int i = n-1 ; i >= 0; --i) { // 5-1 =4 --> 0
            rst = rst + st.charAt(i); 
            // "" + "m" -> "m"
            // "m" + "a" -> "ma"
            // "ma" + "d" -> "mad"
            // "mad" + "a" -> "mada"
            // "mada" + "m" -> "madam"
        }
        if(st.toLowerCase().equals(rst.toLowerCase())){
            System.out.println(st + " is a palindromic string");
        }else{
            System.out.println(st + " is not a palindromic string");
        }
        sc.close();
    }
}
// @%$&#_
// @$%$@ -> @$%$@ ->
