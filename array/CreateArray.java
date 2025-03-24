package array;

import java.util.*;
/**
 * 连续的内存空间中，存储一组相同类型的元素
 * 
 * 1. Access：  O（1）
 * 2. Search :  O（n）
 * 3. Insert : O（n）
 * 4. delete : O（n）
 * 特点： 适合读
 *       不适合写
 */

public class CreateArray {
    public static void main(String[] args) {

        /****** Create Array *******/
        //1.
        int[] a = {1,2,3};
        System.out.println("a: " + Arrays.toString(a));

        //2.
        int[] b = new int[]{1,2,3};
        System.out.println("b: " + Arrays.toString(b));

        //3.
        int[] c = new int[3];
        for (int i = 0; i < 3; i++) {
            c[i] = i+1;
        }
        System.out.println("c: " + Arrays.toString(c));

        //4. ArrayList  推荐：无需知道数组大小和元素，有各种方法方便操作数组
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i+1);
        }
        System.out.println("arrayList: " + arrayList.toString());



        /****** 1. Add  *******/
        //直接加到末尾，或者不够位置重新找位置复制整个数组
        // O（1）/O（N）
        arrayList.add(99);
        System.out.println("arrayList: " + arrayList.toString());

        /****** 2. Insert  *******/
        arrayList.add(3,88);



        /****** 3. Access Array *******/
        //直接访问索引地址
        //Time Complexity : O(1)
        int c1 = c[1];
        int arr1 = arrayList.get(1);

        System.out.println("c1: " + c1);
        System.out.println("arr1: " + arr1);


        /****** 4. Update Array *******/
        //Time Complexity : O(1)
        c[1] = 11;
        arrayList.set(1, 11);


        /****** 5. Remove *******/
        //Time Complexity : O(N)
        arrayList.remove(3);


        /****** 6. Get Length *******/
        //Time Complexity : O(1)
        int cSize = c.length;
        int arrSize = arrayList.size();

        /****** 7. Iterate an Array 遍历数组 *******/
        //Time Complexity : O(N)

        for (int i = 0; i < c.length; i++) {
            int current = c[i];
            System.out.println("c at index " + i + " : " + current);

        }

        for (int i = 0; i < arrSize; i++) {
            int current = arrayList.get(i);
            System.out.println("arr at index : " + i + " current value : " + current);
        }

        /****** 8. find an element  *******/
        //Time Complexity : O(N)

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 11) {
                System.out.println("We found 99 in array c ! ");
            }

        }

        boolean is11 = arrayList.contains(11);
        System.out.println("Are we found 11 in arr? " + is11);


        /****** 9. Sort an array by built-in lib  *******/
        //Time Complexity : O(N)
        c = new int[]{2,3,1};
        arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);

        System.out.println("c: " + Arrays.toString(c));
        System.out.println("arrayList: " + arrayList.toString());

        Arrays.sort(c);
        System.out.println("after sort c: " + Arrays.toString(c));

        Collections.sort(arrayList);
        System.out.println("after sort arrayList: " + arrayList.toString());

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("after reverse sort arrayList: " + arrayList.toString());

    }


    
}