package com.company;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lanThucHien = 0,soLan;
        System.out.println("Ban muon thuc hien bao nhieu lan ?");
        soLan = sc.nextInt();
        do {
            System.out.println("Lan thu "+(lanThucHien+1));
            int n,target;
            int[] array;
            System.out.println("Nhap vao do dai chuoi");
            n = sc.nextInt();
            array = new int[n];
            System.out.println("Nhap vao so can tim");
            target = sc.nextInt();
            for (int i = 0 ;i<n;i++){
                System.out.println("array["+i+"]");
                array[i] = sc.nextInt();

            }
            timTarget(array,target);
            lanThucHien++;
        }
        while(lanThucHien!=soLan);

    }
    public static void timTarget(int[] array ,int target){
        for (int i = 0 ;i<array.length ; i++){
            for (int j = i+ 1 ;j < array.length ; j++){
                if (array[i]+array[j]==target){
                    System.out.println("["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
