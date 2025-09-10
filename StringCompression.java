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
