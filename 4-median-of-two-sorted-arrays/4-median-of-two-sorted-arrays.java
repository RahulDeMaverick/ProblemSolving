class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result= 0;
        int length = nums1.length + nums2.length; 
        int[] mergedArray = new int[length];    
int pos = 0;  
for (int element : nums1)   
{  
mergedArray[pos] = element;  
pos++;             
}  
for (int element : nums2)   
{  
mergedArray[pos] = element;  
pos++;  
} 
       
        Arrays.sort(mergedArray);
        
       
            int extra = mergedArray.length % 2 == 0? 1 : 0;

    int[] a = new int[1 + extra];

    int startIndex = mergedArray.length / 2 - extra;
    int endIndex = mergedArray.length / 2;

    for (int i = 0; i <= endIndex - startIndex; i++) {
        a[i] = mergedArray[startIndex + i];
        result += a[i];
    }
        if(a.length % 2 ==0){
            result = result/2;
        }

   return result;
}
}