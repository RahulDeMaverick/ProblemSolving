class Solution {
    public String sortSentence(String s) {
        int key=0;
        String value;
        StringBuilder sb = new StringBuilder();
        List<String> words = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        list.add(s);
        list.stream().forEach(str -> {
            words.addAll(Arrays.asList(str.split(" ")));
        });
        
        TreeMap<Integer,String> map = new TreeMap<>();
            
            String[] str = Arrays.copyOf(
            words.toArray(), words.size(), String[].class);
            
            for(String s1 : str){
            key = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
           value = s1.replaceAll("[0-9]","");
                map.put(key,value);
          }
        
          for (String res : map.values()){ 
            sb.append(res).append(" ");
    }
            
     return sb.toString().substring(0, sb.toString().length() - 1);
    }
}