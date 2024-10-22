package com.company;
class employee {
    public int Salary;
    int id;
    String name;
    public void printDetails(){
        System.out.println(" My id is "+ id);
        System.out.println("My name is "+ name);
    }

    public int getSalary(){
        return Salary;
    }

    }
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println(" This is custom class");
        employee sujit = new employee();  // instantiating a new employee
        employee aadesh = new employee();  // instantiating a new employee

        // setting attributes for sujit
        sujit.id = 12;
        sujit.name ="sujit yalmar";
        sujit.Salary = 20;

        // setting attributes for aadesh
        aadesh.id = 13;
        aadesh.name = "aadesh bhumkar";
        aadesh.Salary = 25;

        // Printing the Attribute
        //System.out.println("My ID is "+ sujit.id);
        //System.out.println("My Name is "+ sujit.name);
        //System.out.println("My ID is "+ aadesh.id);
        //System.out.println("My Name is "+ aadesh.name);
        sujit.printDetails();
        System.out.println(" my salary is "+ sujit.Salary);
        aadesh.printDetails();
        int salary = sujit.getSalary();
        System.out.println("my salary is " + aadesh.Salary);


    }
}
