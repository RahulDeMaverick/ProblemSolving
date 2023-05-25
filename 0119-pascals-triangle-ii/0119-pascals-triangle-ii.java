class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row;
        List<Integer> prev= null;
        for(int i =0;i<rowIndex+1;i++){
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1)+ prev.get(j));
                }
            }
            prev= row;
            result.add(row);

        }
            
        
        return result.get(rowIndex);
        
    }
}