package com.company;

interface childinterface{
    void meth1();
    void meth2();
}
interface mychildintereface extends childinterface{
    void meth();
    void meth4();
}

class mysampleclass implements childinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    
} 
public class cwh_58_inhertance_interface {
    public static void main(String[] args) {
        mysampleclass mc = new mysampleclass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();
        
    }
    
}
