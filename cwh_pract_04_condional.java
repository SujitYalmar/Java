/*
package com.company ;

import java.util.Scanner;

public class cwh_pract_04_condional {
    public static void ma`in(String[] arg) {
        /*
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("this ia an organization ");
        }
        else if (website.endsWith(".com"))
            System.out.println("this is commercial website ");
        }
        else if (website.endsWith(".in")) {
            System.out.println(" this is an indian website ");
        }



    }

    }
        /*
        //Question 5
                // year to be checked
                int year = 2024;
                boolean leap = false;

                // if the year is divided by 4
                if (year % 4 == 0) {

                    // if the year is century
                    if (year % 100 == 0) {

                        // if year is divided by 400
                        // then it is a leap year
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }

                    // if the year is not century
                    else
                        leap = true;
                }

                else
                    leap = false;

                if (leap)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            }
        }

        /*
        //Question 4
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday ");
            case 3 -> System.out.println("Wenesday");
            case 4 -> System.out.println("Thuresday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}
        /*
        //Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in Lakhs per annum :");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);
    }
}
        /*
        // problem 2
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your physics marks:");
        m1 = sc.nextByte();
        System.out.print("enter your maths marks:");
        m2 = sc.nextByte();
        System.out.print("enter your biology marks:");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("your overall percentage is :" + avg );
            if (avg >= 40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congractulaions you are promoted ");
            }
            else
        System.out.println("sorry you are not promoted, please try again ");


        }
    }



        /*
        problem 1
        int a = 11;
        if (a==10)
            System.out.println("i am 11");
        else
            System.out.println("i am 10");
    }
}

         */



