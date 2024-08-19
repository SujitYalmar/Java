package com.company;

public class cwh_39_ch8ps {
    // problem number 1
    static class Employee1{
        int salary;
        String name;
        public int getSalary(){
             return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String n) {
            this.name = n;
        }
    }
    // problem number 2
    static class cellphone {
        public void ring(){
            System.out.println("Ringing....");
        }
        public void vibrate(){
            System.out.println("vibrating.....");
        }
        public void callfriend(){
            System.out.println("calling sujit ");
        }

    }
    //problem number 3
    static class square {
        int side;

        public int area() {
            return side * side;
        }

        public int perimeter() {
            return 4*side;

        }

        }
        //problem number 4
    static class rectangle {
        int l;
        int w;
        public int area1(){
            return w*l;
        }
        public int perimeter1(){
            return 2*(w*l);
        }
    }

    // problem number 5
    static class game{
        public void hit(){
            System.out.println("Hitting The Enemy ");
        }
        public void Run(){
            System.out.println("Running from The Enemy ");
        }
        public void Fire(){
            System.out.println("Firing on  The Enemy ");
        }

    }

    public static void main(String[] args) {
        /*
        // Problem number 1
        Employee1 sujit = new Employee1();
                sujit.setName("sujit yalmar");
                sujit.salary = 150000;
        System.out.println("My name is "+ sujit.getName());
        System.out.println("My salary is " + sujit.getSalary());

        // Problem number 2
        cellphone vivo = new cellphone();
        vivo.callfriend();
        vivo.vibrate();
        vivo.ring();

        //problem number 3
       square sq = new square();
       sq.side = 6;
        System.out.println("Perimeter " + sq.perimeter());
        System.out.println("Area " + sq.area());

        // Problem number 4
        rectangle sq1 = new rectangle();
        sq1.w = 4;
        sq1.l = 3;
        System.out.println("Perimeter =" + sq1.perimeter1());
        System.out.println("Area =" + sq1.area1());

         */

        // Problem number 5
        game player1 = new game();
        player1.hit();
        player1.Run();
        player1.Fire();


    }
}
