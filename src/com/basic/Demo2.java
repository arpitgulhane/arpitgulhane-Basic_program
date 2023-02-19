package com.basic;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        int arr[] =new int[5];
//        int num;

        System.out.println("Enter Num:");
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }

}
