class Solution {
    public int romanToInt(String s) {
        int total=0;
        //Iterate through every letter
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            //Check what the current letter is
            //If the letter is anything besides C, X, and I just add the value
            //If it is one of those three letters check if it there is a character after and what it is
            //If it is one of the special characters subtract the value instead of adding from the total
            switch(current){
                case 'M':
                    total+=1000;
                    break;
                case 'D':
                    total+=500;
                    break;
                case 'C':
                    if(i!=s.length()-1){
                      if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'){
                          total-=100;
                          break;
                      }  
                    }
                    total+=100;
                    break;
                case 'L':
                    total+=50;
                    break;
                case 'X':
                    if(i!=s.length()-1){
                        if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C'){
                            total-=10;
                            break;
                        }  
                    }
                    total+=10;
                    break;
                case 'V':
                    total+=5;
                    break;
                case 'I':
                    if(i!=s.length()-1){
                      if(s.charAt(i+1)=='X'||s.charAt(i+1)=='V'){
                          total-=1;
                          break;
                      }  
                    }
                    total+=1;
                    break;
            }
        }
        return total;
    }
}
