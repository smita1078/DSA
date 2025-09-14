import java.util.*;
// Brute force
public class Solution{
  String maxEvenLength(String str){
    int n = str.length();
    String[] words = str.split("\\s+");
    String result="";
    int maxi=0;

    for(int i=0;i<words.length;i++){
      int len = words[i].length();
      if(len%2==0 && len>maxi){
        maxi=Math.max(len,maxi);
        result=words[i];
      }
     return result.isEmpty() ? "-1" : result;
    }
}

  //Optimal

String maxEvenLength(String str){
  String result="";
  int maxi=0;
  int i=0;
  while(i<str.length()){
    while(i<str.length() && str.charAt(i)==' ')i++;
    int start =i;
    while(i<str.length() && str.charAt(i)!=' ')i++;
    int end = i;
    int len = end-start;
    if(len>0 && len%2==0 &&len>maxi){
      maxi=len;
      result=str.substring(start,end);
    }
    return result;
  }
    

 public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "This is a beautiful sunny afternoon";
        String output = sol.maxEvenLength(input);
        System.out.println("First Max Even-Length Word: " + output);
    }
