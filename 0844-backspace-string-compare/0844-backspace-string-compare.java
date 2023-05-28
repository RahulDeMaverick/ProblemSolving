class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuffer sbs = new StringBuffer();
        StringBuffer sbt = new StringBuffer();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            sbs.append(c);
            if(c == '#')
           {    
                if(sbs.length() != 0)
                    sbs.deleteCharAt(sbs.length()-1);
                if(sbs.length() != 0)
                    sbs.deleteCharAt(sbs.length()-1);
           }
        }
        
        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            sbt.append(c);
            if(c == '#')
           {    
                if(sbt.length() != 0)
                    sbt.deleteCharAt(sbt.length()-1);
                if(sbt.length() != 0)
                    sbt.deleteCharAt(sbt.length()-1);
           }
        }
        return (sbs.toString()).equals(sbt.toString());
    }
}