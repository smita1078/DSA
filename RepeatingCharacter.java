class Solution {
    public int repeatedCharacter(String S) {
        Map<Character,Integer>mp = new HashMap<>();
        
        for(int i=0;i<S.length();i++){
            if(mp.containsKey(S.charAt(i))){
                mp.put(S.charAt(i),mp.get(S.charAt(i))+1);
            }
            else{
                mp.put(S.charAt(i),1);
            }
        }
        
        for(int i=0;i<S.length();i++){
            if(mp.get(S.charAt(i))>1){
                return i;
            }
        }
        return -1;
    }
}

