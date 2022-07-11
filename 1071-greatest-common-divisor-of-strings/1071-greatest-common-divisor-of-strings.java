class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1+str2).equals(str2+str1))
            return "";
        
        int len = lenght(str1.length(),str2.length());
            return str2.substring(0,len);   
    }
    
    private int lenght(int s1,int s2){
        
        if(s2==0)
            return s1;
        
        return lenght(s2,s1%s2);
    }
}