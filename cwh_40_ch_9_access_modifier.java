package com.company;

class Myemployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
public class cwh_40_ch_9_access_modifier {
    public static void main(String[] args) {
        Myemployee sujit = new Myemployee();
        //sujit.setId(15);
        //sujit.name= "sujit_with_code ---> throws an  error due to private acess modifierr
        sujit.setName("sujit_with_code");
        System.out.println(sujit.getName());
        sujit.setId(43);
        System.out.println(sujit.getId());
    }
}
