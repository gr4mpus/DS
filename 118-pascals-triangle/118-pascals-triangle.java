class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(li);
        for(int i = 2; i<= numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j<i; j++) {
                int left = 0;
                if(j > 0) {
                    left = res.get(i-2).get(j-1);
                }
                
                int right = 0;
                if(j+1<i) {
                    right = res.get(i-2).get(j);
                }
                temp.add(left+right);
            }
            res.add(temp);
        }
        
        return res;
    }
}