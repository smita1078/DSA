class Solution {
    private static final String[] KEYPAD = {
        "","","abc","def","ghi","jkl","mno",
        "pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
List<String> result = new ArrayList<>();
        if(digits.isEmpty()) return result;
        StringBuilder current = new StringBuilder();
        backtrack(digits,result,current,0);
        return result;
    }
    private void backtrack(String digits,List<String>result, StringBuilder current,int index){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index)-'0'];
        for(char c: letters.toCharArray()){
            current.append(c);
            backtrack(digits, result,current,index+1);
            current.deleteCharAt(current.length()-1);
        }
    }
}
