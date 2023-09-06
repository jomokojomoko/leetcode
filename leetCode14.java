class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Sort the array so the shortest word is in the first index
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));
        String answer="";
        boolean same=true;
        //Loop through as many letters as in the shortest word
        for(int i=0;i<strs[0].length();i++){
            char current=strs[0].charAt(i);
            //Check if at that index all words have same letter, if not return the prefix that has been built
            for(String word:strs){
                if(word.charAt(i)!=current){
                    return answer;
                }
            }
            answer+=current;
        }
        return answer;
    }
}
