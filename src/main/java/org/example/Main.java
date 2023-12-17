package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        //Задача 1
        System.out.println("Задача 1");

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("----------");

        //Задача 2
        System.out.println("Задача 2");

        List<Integer> nums1 = new ArrayList<>(List.of(1, 8, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> nums2 = new HashSet(List.of());

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 0) {
                nums2.add(nums1.get(i));
            }
        }
        Integer[] nums3 = nums2.toArray(new Integer[0]);

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums3[i] < nums3[j]) {
                    Integer value = nums3[j];
                    nums3[j] = nums3[i];
                    nums3[i] = value;

                }
            }
        }

        System.out.println(Arrays.toString(nums3));

        System.out.println("----------");

        //Задача 3
        System.out.println("Задача 3");
        List<String> str1 = new ArrayList<>(List.of("hhh", "ggg", "ggg", "hhre", "hhh", "qqq", "aaa"));
        Set<String> str2 = new HashSet(List.of());

        str2.addAll(str1);

        System.out.println(str2);

        System.out.println("----------");

        //Задача 4
        System.out.println("Задача 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> strings1 = new HashSet(List.of());

        strings1.addAll(strings);

        String[] strings2 = strings1.toArray(new String[0]);

        for (int i = 0; i < strings2.length; i++) {
            int count = 0;
            for (String string : strings) {

                if (strings2[i] == string) {
                    count++;
                }
            }
            System.out.println(count);

        }


    }
}

