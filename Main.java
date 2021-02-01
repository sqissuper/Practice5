package com.company;

import java.util.*;

public class Main {

//    public static int lastStoneWeight(int[] stones) {
//        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        for(int i = 0; i < stones.length; i++) {
//            que.add(stones[i]);
//        }
//        System.out.println(que);
//        while(que.size() >= 2) {
//            int x = que.poll();
//            int y = que.poll();
//            que.add(x - y);
//
//        }
//        return que.size() == 1 ? que.peek() : 0;
//
//    }
//    public static void main(String[] args) {
//        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        int[] arr = {2,7,4,1,8,1,1};
//        for (int i = 0; i < arr.length; i++) {
//            que.add(arr[i]);
//        }
//        System.out.println(que);
//        System.out.println(lastStoneWeight(arr));
//    }

    //查找和最小的K对数字
//    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return (o1[0] + o1[1]) - (o2[0] + o2[1]);
//            }
//        });
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                heap.add(new int[]{nums1[i],nums2[j]});
//            }
//        }
//        List<List<Integer>> lists = new ArrayList<>();
//        while(k != 0 && !heap.isEmpty()) {
//            List<Integer> ret = new ArrayList<>();
//            int[] arr = heap.poll();
//            ret.add(arr[0]);
//            ret.add(arr[1]);
//            lists.add(ret);
//            k--;
//        }
//        return lists;
//    }

    public static void main(String[] args) {
//        int[] nums1 = {1,7,11};
//        int[] nums2 = {2,4,6};
//        int k = 3;
//        List<List<Integer>> ret = kSmallestPairs(nums1,nums2,k);
//        System.out.println(ret);
    }
}
