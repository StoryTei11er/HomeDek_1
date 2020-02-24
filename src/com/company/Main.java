package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght: ");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int n : arr) {
            System.out.println(n);
        }

    }

    static void swap(int[] a, int left, int right) {
        if (left != right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
    }
}



