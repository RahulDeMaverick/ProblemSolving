​
/*
approch: first the approch is greedy approch but the greedy aproch will fail at some test cases.
second approch is exhaustive but we will get time limit exceed because the time complexity is O(K power N)
so we will take a dp array
in dp array we will store the best possible outcome at every place
​
lets take this array [1,15,7,9,2,5,10]
​
the dp array after will look like
[1,16] after first window
[1,30] after second window
[1,30,45] after third window
​
at every index we will be saving the best possible value
​
[1] is already solved,
[1,5] will be already solved
[1,15,7] will be solved and saved it the best possible outcome with this is 45 then we will go for the next element 9
now in 9 all the possible partitions are calculated such as [9] , [7,9] , [15,7,9] but the best solution will come in single partion we will be calculating the max
in every place
*/
if you have doubts refer this video :
​
https://www.youtube.com/watch?v=mjbLW-YM5XM