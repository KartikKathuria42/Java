import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        // 1. Input a string in UpperCase
        // 2. Print the frequency of the character 

        // Take Input from the user
        Scanner sc = new Scanner(System.in); // naina
        String s = sc.nextLine();
        String str = s.toUpperCase(); // NAINA
        int n = str.length(); // 5
        int[] freq = new int[n]; // Frequency Array to store the frequency of each character

        // Convert the string into the character array
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        System.out.println("Frequencies of the character given below: ");
        System.out.println("Character Frequencies");
        for (int i = 0; i < freq.length; i++) {
            if(ch[i]!=' ' && ch[i]!='0'){
                System.out.println(ch[i] +"    " + freq[i]);
            }
        }
        sc.close();
    }
}

// N A I N A
// i i i i
//   j j j j