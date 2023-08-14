class Solution {
    public int findKthLargest(int[] nums, int k) {

    
    //min heap
  
        PriorityQueue<Integer> pq =  new PriorityQueue<>();
    
        for(int num: nums){
            pq.add(num);
            if(pq.size() > k){ //making sure pq is less than k
                pq.poll();
            }
        }
        return pq.poll();
    }
        //Max heap
   /*   PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b) ->b-a);
        int result = Integer.MAX_VALUE;
        int n = nums.length;
        for(int num: nums){
            pq.add(num);
            if(pq.size() > n- k){
               result= Math.min(result,pq.poll());
            }
        }
        return result;
    }*/
}