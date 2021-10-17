package com.usha;
import java.util.Scanner;
class opp {
    static boolean oppositeSigns(int x, int y)
    {
        return ((x ^ y) < 0);
    }
    public static void main(String[] args)
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = sc.nextInt();
        System.out.println("Enter the second number:");
        y = sc.nextInt();
        if (oppositeSigns(x, y) == true)
            System.out.println("Signs are opposite");
        else
            System.out.println("Signs are not opposite");
    }
}