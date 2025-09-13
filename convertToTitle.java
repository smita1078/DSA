class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber>0){ // column index adjustment by removing --
            columnNumber--;
            char c = (char) ('A' + (columnNumber%26));
            result.append(c);
            columnNumber/=26;
        }
        return result.reverse().toString();
    }
}
