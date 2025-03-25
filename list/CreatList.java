package list;

import java.util.LinkedList;

public class CreatList {
    public static void main(String[] args) {
//        creat
        LinkedList<Integer> list = new LinkedList<>();
        //add  O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

        //Insert  O(N) 先找到索引为2的元素再插入
        list.add(2,99);
        System.out.println(list.toString());

        //Access  O(N)
        int element = list.get(2);
        System.out.println(element);

        //Search O(N)
        int index = list.indexOf(99);
        System.out.println(index);

        //Update  O(N)
        list.set(2,88);
        System.out.println(list.toString());


        //delete O(N) 先找再删
        list.remove(2);
        System.out.println(list.removeFirst());

        //Length
        int length = list.size();
        System.out.println(length);
    }

}
