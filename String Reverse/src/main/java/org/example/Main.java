package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] arr = s.toCharArray(); // we convert string to char array
        boolean b = false;
        int len = arr.length - 1;
        for(int i = 0; i <= len; i++ ){
            if(arr[i] == arr[len-i])
                b = true;
            else b = false;
        }
        if(b == true)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}