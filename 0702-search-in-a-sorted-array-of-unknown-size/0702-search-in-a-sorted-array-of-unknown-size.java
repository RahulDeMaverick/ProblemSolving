/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        
        int low =0;
        int high = 1;
        while(reader.get(high) < target){
            low = high;
            high = 2*high;
        }
        while(low <= high){
            int mid = low + (high-low)/2;
            int temp = reader.get(mid);
            if(temp == target) return mid;
            else if(temp > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
        
    }
}