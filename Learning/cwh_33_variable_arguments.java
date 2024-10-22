package com.company;

public class cwh_33_variable_arguments {
    /*
    static int sum(int a, int b){
        return a+b;
        }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    static int sum(int a, int b, int c,int d) {
        return a+b+c+d;
    }
     */
    static int sum(int x, int... arr){
        int result=x;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
       // System.out.println(" The sum of Nothing is :"+ sum());
        System.out.println("The sum of 1 is : "+ sum(1));
         System.out.println("The sum of 4 and 5 : "+ sum(4 ,5));
        System.out.println("The sum of 6,2,and 8 : "+ sum(6,2,8));
        System.out.println("The sum of 8,9,6 and 10 : "+ sum(8,9,6,10));



    }
}
