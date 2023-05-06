class MovingAverage {
    
    List<Integer> list;
    int size;
    public MovingAverage(int size) {
        list = new LinkedList<>();
        this.size = size;
    }
    
    public double next(int val) {
        list.add(val);
        int max = list.size();
        if(max > size) list.remove(0);
        int sum =0;
        int i;
        for(i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return (double) sum/i;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */