
class base1{
    base1(){
        System.out.println("I am constructer");
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I am derived class contructer");
    }
}

class childofderived extends derived1{
    childofderived(){
        System.out.println("I am child of derived class constructor");
}




public class cwh_46_cinstructer_in_inheritance {
    public static void main(String[] args) {
        childofderived c = new childofderived();
        
    }
    
}
