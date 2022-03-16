package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //numbers from 1 to 50
        ArrayList<Integer> arrayList = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i < 51; i++)
            arrayList.add(i);
        System.out.println(arrayList);


        //unpair numbers
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 0)
                arrayList2.add(i);
        System.out.println(arrayList2);

        //pair numbers
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i = 1; i <=100 ; i++)
            if (i%2!=1)
            arrayList3.add(i);
            System.out.println(arrayList3);

    }
}










