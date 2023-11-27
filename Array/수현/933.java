import java.util.*;
class RecentCounter {
    List<Integer> arr = null;
    public RecentCounter() {
            this.arr = new ArrayList<>();
    }
    
    public int ping(int t) {
        arr.add(t);
        int cnt = 0;
        for (int a : arr){
            if (t-3000 <= a && t >= a) cnt++;
        }
        return cnt;
    }
}
