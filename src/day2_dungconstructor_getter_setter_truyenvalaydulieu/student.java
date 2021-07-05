/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_dungconstructor_getter_setter_truyenvalaydulieu;

/**
 *
 * @author hp
 */
public class student {
    private String name;
    private int age;
 // ctrl + space enter 
    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// in một object ra  dùng ctrl+ space chọn tostring
    @Override
    public String toString() {
        return " name: "+ name+ "\t\t" + " Age: "+ age;
    }
    
    
}
