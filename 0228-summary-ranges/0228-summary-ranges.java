class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums ==null || nums.length ==0) return result;
        StringBuffer sb = new StringBuffer();
        int start = nums[0];
        int end = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if((nums[i+1]-nums[i]) != 1){
                if (start == end) {
                    sb.append(start);
                    result.add(sb.toString());
                } else {
                    sb.append(start).append("->").append(end);
                    result.add(sb.toString());
                }
                sb.setLength(0);
                start = nums[i + 1];
                end = nums[i + 1];
            }
            else {
                end = nums[i + 1];
            }
                
            }
        if (start == end) {
            sb.append(start);
            result.add(sb.toString());
        } else {
            sb.append(start).append("->").append(end);
            result.add(sb.toString());
        }
        return result;
    }
}