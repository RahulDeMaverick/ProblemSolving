class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int idx =0;
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                if(!list.contains(i))
                    list.add(i);
            }
        }
         int[] arr = list.stream().mapToInt(i -> i).toArray();
         return arr;
    }
}