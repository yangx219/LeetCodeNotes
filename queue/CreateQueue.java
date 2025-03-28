package queue;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Add  O(1)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        //[1,2,3]
        System.out.println(queue.toString());

        //Get the head of queue : O(1)
        int temp1 = queue.peek();
        //1
        System.out.println(temp1);


        //Remove the head of queue O(1)
        int tmp2 = queue.poll();
        //1
        System.out.println(tmp2);

        //[2,3]
        System.out.println(queue.toString());

        //Queue is empty? O(1)
        System.out.println(queue.isEmpty());

        //The length of Queue O(1)
        System.out.println(queue.size());

        //
        while (!queue.isEmpty()) {
            int tmp3 = queue.poll();
            System.out.println(tmp3);
        }



    }
}
