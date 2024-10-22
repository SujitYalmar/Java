package Learning;
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        // B b = new A();  not allowed to call child class to parent class
        // a.meth3(); //not allowed to call
        A a = new A();
        a.meth2();
         

        B b = new B();
        // A b  = new B(); //allowed to call parent class to child class
        b.meth2();
        // b.meth3(); // allowed to call

        
    }
}
