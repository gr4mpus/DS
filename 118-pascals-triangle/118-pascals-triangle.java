class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(innerList);
        if(numRows == 1){
            return outerList;
        }
        
        return getList(numRows, outerList);
        
        
    }
    
    public List<List<Integer>> getList(int rows, List<List<Integer>>arrList){
//         base case
        if(arrList.size()>rows-1){
            return arrList;
        }
//         base case end
        
        List<Integer> res = new ArrayList<>();
        
//      first element is always 1
        res.add(1);
        
        List<Integer> lastEl = arrList.get(arrList.size()-1);
        int lastElSize = lastEl.size();
        
//      count of next arraylist is increasing by 1 and 2 elements are getting filled 1 as value. So, counter+1-2
        int counter = lastElSize-1;
        
        for(int i=1; i<= counter; i++){
            res.add(lastEl.get(i)+lastEl.get(i-1));
        }
        
//      last element is always 1
        res.add(1);
        
        arrList.add(res);
        return getList(rows, arrList);
    }
}