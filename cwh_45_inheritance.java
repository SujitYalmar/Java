package com.company;

class base{
    public int x;

    public int getx(){
        return x;
    }
    public int setx(int x){
        System.out.println("i am in base class");
        this.x = x;
    }

}

class derived extends base{
    public int y;
    public int gety(){
        return y;
    }
    public int setx(int y){
        System.out.println("i am in derived class");
        this.y = y;
    }

public class cwh_45_inheritance {
    public static void main(String[] args) {
        derived d = new derived();
        d.setx(10);
        System.out.println(d.getx());
        
}

