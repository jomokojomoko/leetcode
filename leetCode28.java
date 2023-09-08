class Solution {
    public int strStr(String haystack, String needle) {
        //Figure out what the first letter of needle is
        char first=needle.charAt(0);
        //Check every letter in haystack from the beginning to where a word of size needle could still fit
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            //if the current letter is correct check if the word can be spelled, if it can return the index
            if(haystack.charAt(i)==first){
                boolean same=true;
                for(int j=i;j<haystack.length()&&j-i<needle.length();j++){
                    if(haystack.charAt(j)!=needle.charAt(j-i)){
                        same=false;
                    }
                }
                if(same){
                    return i;
                }
            }
        }
        return -1;
    }
}
