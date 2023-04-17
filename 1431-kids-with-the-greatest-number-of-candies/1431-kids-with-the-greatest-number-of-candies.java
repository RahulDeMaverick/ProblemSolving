class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        int max =0;
        
        for(int i=0;i < candies.length;i++){
            max = Math.max(candies[i],max);
        }
        
        for(int i=0;i < candies.length;i++){
            int temp = candies[i] + extraCandies;
            if(temp >= max){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        
        return arr;
    }
}