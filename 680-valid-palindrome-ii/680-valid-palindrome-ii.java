class Solution {
    public boolean validPalindrome(String s) {
        return checkRest(0, s.length()-1, s, true);
    }
    
    public boolean checkRest(int start, int end, String s, boolean flag) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                if(flag) {
                    return checkRest(start+1, end, s, false) || checkRest(start, end-1, s, false);
                } else {
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }
}