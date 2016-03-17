package com.william.sandbox.stackoverflow.samples20160317;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sandbox2 {

    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. Print output to STDOUT.
        int a,b,n;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=0;
            c=2*c*b;
            int result=a+c;
            System.out.print(result+ " ");
        }

    }
}
