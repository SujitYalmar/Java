/*

1) Create a class circle and use inheritance to create another class cylinder from it
2) Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible 
3) Create a method for area and volume in 1 
4) create methods for area & volume in 2 also create getters and setters 
5) What is the order of constructor execution for the following inheritance hierarchy 
                    Base 
                                
                   Derived 1
                                    
                   Derived 2

    Derived obj = new Derived 2( ); 
    Which constructor(s) will be executed & in what order?
 */

package com.company;
//problem 1
// class Circle{
//     public int radius;
//     Circle(){
//         System.out.println("I am non param of circle");
//     }
//     Circle(int r){
//         System.out.println("I am circle parameterized constructor");
//         this.radius = r;
//     }
 
//     public double area(){
//         return Math.PI*this.radius*this.radius;                 //for problem 3 area method
//     }
//  }
 
// class Cylinder1 extends Circle{
//     public int height;
//     Cylinder1(int r, int h){
//         super(r);
//         System.out.println("I am cylinder1 parameterized constructor");
//         this.height = h;
//     }
//     public double volume(){                                         //for problem 3 volume method
//         return Math.PI*this.radius*this.radius*this.height;
//     }
//  }

 //problem 2
class rectangle{
    public int length;
    public int breadth;
    // public int height;
    private Object area1;
    rectangle(){
        System.out.println("I am non parammetric  of rectangle");
        }
        rectangle(int l, int b){
            System.out.println("I am rectangle parameterized constructor");
            this.length = l;
            this.breadth = b;
            }
            public int area1(){
                return this.length*this.breadth;
            }
            public int volume1(){
                return this.length*this.breadth*1; //for problem 3 volume method
            }    
            // public int getLength() {
            //     return length;
            // }
            // public int getBreadth() {
            //     return breadth;
            // }
            // public int getheigth() {
            //     return height;
            // }
            // public void setLength(int length) {
            //     this.length = length;
            // }
            // public void setBreadth(int breadth) {
            //     this.breadth = breadth;
            // }
            // public void setheight(int height) {
            //     this.height = height;
            // }

    
}
class rectangle1 extends rectangle{
    public int height;
    rectangle1(int l, int b, int h){
        super(l, b);
        System.out.println("I am rectangle1 parameterized constructor");
        this.height = h;
    }
}


 public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        /*  Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println("Area of circle: "+obj.area());
        System.out.println("Volume of cylinder: "+obj.volume());    
         */

        //problem 2
        rectangle myRectangle = new rectangle();
        rectangle1 myRectangle1 = new rectangle1(10, 20, 30);
        System.out.println("length of rectangle1: "+myRectangle1.length);

            //problem 4
        /*myRectangle.setLength(10);
        System.out.println(myRectangle.getLength());
        myRectangle.setBreadth(20);
        System.out.println(myRectangle.getBreadth());
        myRectangle.setheight(30);
        System.out.println(myRectangle.getheigth());
        System.out.println("area of rectangle: "+myRectangle.area1());
        System.out.println("volume of rectangle:" + myRectangle.volume1());
        */
    }
 }
 