import java.util.*;

public class Solution{
  String maxEvenLength(String str){
    int n = str.length();
    String[] words = str.split("\\s+");
    String result="";
    int maxi=0;

    for(int i=0;i<words.length;i++){
      int len = words[i].length();
      if(len%2==0){
        maxi=Math.max(len,maxi);
        result=words[i];
      }
     return result.isEmpty() ? "-1" : result;
    }
}

 public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "This is a beautiful sunny afternoon";
        String output = sol.maxEvenLength(input);
        System.out.println("First Max Even-Length Word: " + output);
    }
