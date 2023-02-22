/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> map;
    
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        map = new HashMap<>();
        Queue<Employee> q = new LinkedList<>();
        for(Employee e : employees){
            map.put(e.id,e);
        }
        q.add(map.get(id));
        while(!q.isEmpty()){
            Employee e = q.poll();
            result += e.importance;
            for(int subID : e.subordinates){
                Employee subemp = map.get(subID);
                q.add(subemp);
            }
        }
        return result;        
    

    }
}

//DFS Solution
/*
class Solution {
    HashMap<Integer,Employee> map;
    int result;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id,e);
        }
        dfs(id);
        return result;        
    }
    
    private void dfs(int id){
        Employee e = map.get(id);
        result += e.importance;
        for (int subID : e.subordinates){
            dfs(subID);
        }
    }
}
*/