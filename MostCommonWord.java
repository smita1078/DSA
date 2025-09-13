class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String[] words = paragraph.split("\\s+");
        List<String>bannedList = Arrays.asList(banned);
        String mostCommon = "";
        int maxCount=0;

        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(bannedList.contains(word))continue;

            int count=0;
            for(int j=0;j<words.length;j++){
                if(word.equals(words[j]))count++;
            }

            if(count>maxCount){
                maxCount=count;
                mostCommon=word;
            }
        }
        return mostCommon;
    }

      public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for(String word : banned){
            bannedSet.add(word.toLowerCase());
        } // add banned list words to set so that they are not repeated


        Map<String,Integer> mp= new HashMap<>();
        String[] words = paragraph.toLowerCase().split("\\W+"); //in string words added words of paragraph by splitting them using \\W+

        for(String word: words){
            if(!bannedSet.contains(word)){
                mp.put(word, mp.getOrDefault(word,0)+1);
            }
        }
        String result="";
        int maxFreq=0;

        for(Map.Entry<String,Integer>entry : mp.entrySet()){
            if(entry.getValue()>maxFreq){
                result = entry.getKey();
                maxFreq= entry.getValue();
            }
        }
        return result;
    }
}
}
