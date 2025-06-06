class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int pre = value(s.charAt(0));//previous
        for(int i=1;i < s.length();i++){
            int cur = value(s.charAt(i));// current
            if(cur > pre){
                total -= pre;
            }else{
                total += pre;
            }
            pre = cur;
        }
        total += pre;
        return total;
    }
    private int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}