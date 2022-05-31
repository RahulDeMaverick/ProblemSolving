class Solution {
    public double average(int[] salary) {
        double count=0;
        double val=0; 
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            count += salary[i];
            val +=1;
        } 
        double result = count/val;
        return result;
    }
}