package queue;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounterQueue933 {
    public Queue<Integer> requests = new LinkedList<>();

    public RecentCounterQueue933() {

    }

    public int pingcopy(int t) {
        this.requests.add(t);
        Queue<Integer> copy = requests;

        while(!copy.isEmpty()&& t - requests.peek()>3000){
            copy.poll();

        }
        return copy.size();
    }

    public int ping(int t) {
        this.requests.add(t);

        //移除超过3000毫秒的操作
        while(!requests.isEmpty()&& t - requests.peek()>3000){
            requests.poll();

        }
        return requests.size();

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
