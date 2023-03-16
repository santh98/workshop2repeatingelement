package com.bridgelabz;

public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = {4, 18, 21, 37, 4, 21};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                   count++;
                   System.out.println(arr[j]);
                }
            }
        }
    }
}