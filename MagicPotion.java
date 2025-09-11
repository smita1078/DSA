public class Solution{
  public static int minimalSteps(String ingredients){
    int n = ingredients.length();
    if(n==0) return 0;
    StringBuilder enocded = new StringBuilder();
    encoded.append(ingredients.charAt(0); // first char is always appended
    for(int i=1;i<n;i++){
      int prefixLen = i;
      int doubleLen = 2*prefixLen;
      if(doubleLen<=n){
        String prefix = ingredients.substring(0,prefixLen);
        String nextSegment = ingredients.substring(prefixLen,doubleLen);

        if(prefix.equals(nextSegment){
          encoded.append("*");
          i=doubleLen-1;
          continue;
        }
      }
      encoded.append(ingredients.charAt(i);
    }
    return encoded.length();
  }

   public static void main(String[] args) {
        boolean pass = minimalSteps("ABCDABCE") == 8 &&
                       minimalSteps("ABCABCE") == 5 &&
                       minimalSteps("AAA") == 3 &&
                       minimalSteps("AAAA") == 3 &&
                       minimalSteps("BBB") == 3 &&
                       minimalSteps("AAAAAA") == 5;

        System.out.println(pass ? "Pass" : "Fail");
    }
}
        
      
    
