class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return thevalueofscore(s,"ab",x,y);
        }
        else{
            return thevalueofscore(s,"ba",y,x);
        }
    }
    public int thevalueofscore(String s, String firstpattern, int score1, int score2){
        int score=0;
        StringBuilder temp=new StringBuilder();
        // for first pattern
        for(char ch: s.toCharArray()){
            temp.append(ch);
            int len=temp.length();
            if(len>=2 && temp.substring(len-2).equals(firstpattern)){
                temp.delete(len-2,len);
                score=score+score1;
            }
        }
        // for second pattern 
        String result;
        if(firstpattern.equals("ab")){
            result="ba";
        }
        else{
            result="ab";
        }
        StringBuilder result2= new StringBuilder();  
        for(char ch:temp.toString().toCharArray()){
            
            result2.append(ch);
            int len = result2.length();
            if(len>=2 && result2.substring(len-2).equals(result)){
                result2.delete(len-2,len);
                score=score+score2;
            }
        }
        return score;
    }
}