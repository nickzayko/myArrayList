package com.andersen;

public class Run {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println("count of elements = " + list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("count of elements after adding = " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.array[i]);
        }

        System.out.println("isEmpty = " + list.isEmpty());

        System.out.println("get element by index " + 3 + " : " + list.get(3));
        list.remove(2);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.array[i]);
        }

        System.out.println("new count of elements = " + list.size());

    }
}
