class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = Integer.toString(x);
        int start, end;
        start = 0; end = s.length()-1;
        while(!(start>end)){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}