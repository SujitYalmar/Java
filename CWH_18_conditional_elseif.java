package com.company;
import java.util.Scanner;

public class CWH_18_conditional_elseif {
    public static void main(String[] arg) {
        int age;
        System.out.print("Enter your age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are an adult");
                break;
            case 23:
                System.out.println("you are join the job");
                break;
            case 60:
                System.out.println("you are retire from job");
                break;
            default:
                System.out.println("Enjoy your life");
        }
    }
}

          /*
        if (age > 56) {
          System.out.println("you are experienced");
      } else if (age > 45) {
            System.out.println("you are semi-exprienced");
        } else if (age > 35) {
           System.out.println("you are semi-semi-expriencd");
       } else {
            System.out.println("you are not experienced ");
        }

    }
}

           */
