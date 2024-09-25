package com.company;
//problems
// 1) Create an abstract class pen with methods write () and refill () as abstract methods 
// 2) Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
// 3) Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 
// 4) Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism 
// 5) Demonstrate polymorphism using using monkey  class from Q3 
// 6) Create an interface TVremote and use it to inherit another interface smart TVremote 
// 7) Create a class TV which implements TVremote interface from Q6

abstract class pen{
     abstract void write();                               
     abstract void refill();                                        //Q1
}
class fountainpen extends pen{                                                      
    void write(){
        System.out.println("Writing with fountain pen");
        }
    void refill(){                                                             //Q2
        System.out.println("Refilling fountain pen");
        }
    void changenip(){
        System.out.println("Changing the nib of fountain pen");
    }    
}

class monkey {
    void jump(){
        System.out.println("Monkey is jumping......");
    }                                                                       //Q3
    void bite(){
        System.out.println("Monkey is biting.....");
        }
}
interface basicanimal{
    void eat();
    void sleep();       
}

class human extends monkey implements basicanimal{
    public void speak(){
        System.out.println("Human is speaking....");
        }

    public void eat(){
        System.out.println("Animal is eating....");
        }

    public void sleep(){
        System.out.println("Animal is sleeping....");
        }
}



public class cwh_60_practice_QChapter11 {
    public static void main(String[] args) {
        
         // Q1 + Q2
         fountainpen pen = new fountainpen();
         pen.changenip();
 
         // Q3
         human sc = new human();
         sc.sleep();
 
         // Q5
         monkey m1 = new human();
         m1.jump();
         m1.bite();
         // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
 
         basicanimal lov =  new human();
         // lovish.speak(); --> error
         lov.eat();
         lov.sleep();
 


    }
}
