class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List<String>> map = new HashMap<>();
            
        for(String str: strs){
            double primeprod = prime(str);
            if(!map.containsKey(primeprod)){
                map.put(primeprod,new ArrayList<>());
            }
            map.get(primeprod).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private double prime(String str){
        double res = 1;
        
        int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            double prime = primeArr[c-'a'];
            res *= prime;
        }
        return res;
    }
}