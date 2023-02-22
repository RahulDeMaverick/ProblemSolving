/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

//TC: O(V+E) always for graphs
// here it will be mostly o(N)
/*
class Solution {
    HashMap<Integer,Employee> map;
    //BFS solution
    
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        map = new HashMap<>();
        //adding Employee object to the queue
        Queue<Employee> q = new LinkedList<>();
        //iterating over all the employees
        for(Employee e : employees){
            //maintaining employee map with emp id , empolyee object
            map.put(e.id,e);
        }
        //add the employee id to the queue
        q.add(map.get(id));
        while(!q.isEmpty()){
            //poll the employee object
            Employee e = q.poll();
            //add the importance
            result += e.importance;
            //iterate over the subordinates
            for(int subID : e.subordinates){
                //add the sub employee from the map
                Employee subemp = map.get(subID);
                //add the sub emp to the queue
                q.add(subemp);
            }
        }
        return result;        
    

    }
}
*/
//DFS Solution

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
    //get the employee object
        Employee e = map.get(id);
        //calculate importance result
        result += e.importance;
        //iterrate over the subordinates
        for (int subID : e.subordinates){
        //recusively call all the sub ordinates
            dfs(subID);
        }
    }
}
