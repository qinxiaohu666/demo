package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class arr {


    public static void main(String[] args) {
        int[]arr={1,2,3,1,2};
        int max=arr.length;
        int count=0;
        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                 if (args[i]==args[j]){
                  count++;
                 }
            }
            System.out.println(count);
            map.put(i,count);
            count=0;
            System.out.println();
        }
        System.out.println();
    }















}
