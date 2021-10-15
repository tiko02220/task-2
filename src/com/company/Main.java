package com.company;
import java.util.Scanner;
import java.util.Arrays;
class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //fibonacci  numbers
        System.out.print("Input the length of fibonacci algorithm-");
        int[] b = new int[in.nextInt()];
        b[0] = 1;
        b[1] = 2;
        for(int i=2;i< b.length;i++){
            b[i] = b[i-1] + b[i-2];
        }
        System.out.println(Arrays.toString(b));
        System.out.print("Choose the element to print-");
        System.out.println(b[in.nextInt()-1]);
    }
}
