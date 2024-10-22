package Learning;

import java.util.Scanner;

public class cwh_35_practice_set_on_method {
    // problem number 1
    /*static void multiplication(int n){
        for (int i = 1; i<=10;i++){
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }


            */

    // problem number 2
    /*static void pattern1(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


     */
    /*
    // problem number 3

    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }


     */
/*
// problem number 4
    static void pattern2(int n){
        for (int i = 0; i<n; i--){
            for (int j = 0; j>i; j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }


 */
    /*
    // problem number 5
    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

     */
    //problem number 9
    static float conversionTemp(int n){
        if(n==0){
            return 32f;
        }else {
            return n*9/5+32f;
        }
    }


    public static void main(String[] args) {
            // problem number 1
            //multiplication(8);

                // problem number 2
               // pattern1(8);
                //Problem 3
                //int c = sumRec(10);
                //System.out.println(c);

            // problem number 4
            //pattern2(4);

            // problem number 5
            //int result = fib(10);
            //System.out.println(result);

       // problem number 9
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Temperature you want to convert : ");
        int temp= sc.nextInt();
        float res= conversionTemp(temp);
        System.out.println(res);
        }
    }
