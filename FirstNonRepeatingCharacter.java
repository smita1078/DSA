//Brute force O(n2)
class Solution {
    public int firstUniqChar(String s) {
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            flag=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    flag=true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return -1;
    }
}

public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "leetcode";
        int result = sol.firstUniqChar(input);
        System.out.println("First Unique Character Index: " + result);
    }

//Optimal

    public int firstUniqChar(String s) {
        Map<Character,Integer>mp = new HashMap<>();

        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
