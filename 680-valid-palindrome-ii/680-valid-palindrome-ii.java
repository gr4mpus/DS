class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        boolean flag = true;
        while(start <= end) {
            if(Character.compare(s.charAt(start), s.charAt(end)) == 0) {
                start++;
                end--;
            } else {
                if(flag) {
                    if(checkRest(start+1, end, s) || checkRest(start, end-1, s)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkRest(int start, int end, String s) {
        while(start <= end) {
            if(Character.compare(s.charAt(start), s.charAt(end)) != 0) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}