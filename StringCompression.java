//Brute Force
import java.util.*;

public class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            sb.append(currentChar);
            if (count > 1) {
                sb.append(count);
            }
        }

        // Copy back to original array
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] input = {'a','a','b','b','c','c','c'};
        int newLength = sol.compress(input);

        System.out.println("Compressed Length: " + newLength);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

// Optimal Approach
import java.util.*;

class Solution {
    public int compress(char[] chars) {
        int write=0;
        int read=0;
        while(read<chars.length){
            char currentchar = chars[read];
            int count=0;
            while(read<chars.length && currentchar==chars[read]){
                read++;
                count++;
            }
            chars[write++]=currentchar;
            String cnt = Integer.toString(count);
            if(count>1){
            for(char c : cnt.toCharArray()){
                chars[write++]=c;
            }
            }
        }
        return write;
    }
}

public static void main(String args[]){
  Solution sol = new Solution();
  char[] input = {'a','b,'a','a'};
  int newLength = sol.compress(input);
  System.out.println(""+length);
  for(int i=0;i<length;i++){
  System.out.println(input[i]);    
}
}
