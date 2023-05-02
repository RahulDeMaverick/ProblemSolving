//tc : O(N)^2
//sc : O(N)

class Solution {
    //create a transaction class to save all the transactions
    class Transactions{
        String name;
        int time;
        int amount;
        String city;
        //constructor to save the split transactions
        public Transactions(String transaction){
            String[] strArr = transaction.split(",");
            this.name= strArr[0];
            this.time = Integer.parseInt(strArr[1]);
            this.amount = Integer.parseInt(strArr[2]);
            this.city= strArr[3];
        }
        
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        //map of name to list of transactions
        HashMap<String,List<Transactions>> map = new HashMap<>();
        //iterate over the transactions and save every transactions in the map with name as key and list of the transaction 
        for(String s: transactions){
            Transactions t = new Transactions(s);
            //if name is not present then put the name and new arraylist of transactions
            map.putIfAbsent(t.name, new ArrayList<>());
            //add the list to the name in the hashmap
            map.get(t.name).add(t);
        }
        //iterate over transactions again
        for(String s: transactions){
            Transactions t = new Transactions(s);
            //call isValid funtion. if its not valid add the result
            if(!isValid(t, map.getOrDefault(t.name, new ArrayList<>()))){
                //append all invalid transaction to result 
                result.add(s);
            }
        }
        return result;
    }
    
    //isValid funtion to determine the transaction is valid or not
    private boolean isValid(Transactions t, List<Transactions> list){
        //if amount is greter than 1000 then return false
        if(t.amount >1000) return false;
        
        //iterate over the transaction list and check if its placed less than 60 mins and from diffetent cities
        //then return false else return true
        for(Transactions ta : list){
            if(Math.abs(ta.time - t.time) <= 60 && !ta.city.equals(t.city)){
				return false;
			}
        }
        return true;
    }
}