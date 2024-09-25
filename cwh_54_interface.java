package com.company;
 
interface bicyle {
    int a = 45;
    void applybreak();
    void blowhorn();
    }


interface bike{
    void speed();
    void break2();
}

    class Avon implements bicyle, bike{
        public void applybreak(){
            System.out.println("blow a light");
        }
        public void blowhorn(){
            System.out.println("pop pop pop pee pee pee");
        }
        public void speed(){
            System.out.println(".........high speed.......");
        }
        public void break2(){
            System.out.println("pressing a break........");
        }
    } 

    public class cwh_54_interface{
        public static void main(String[] args) {
            Avon bc = new Avon(); 
            bc.applybreak();
            bc.blowhorn();
            bc.break2();
            bc.speed();
            System.out.println(bc.a);
            

        }
    }

