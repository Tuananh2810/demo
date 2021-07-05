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
public class main {
    public static void main(String[] args) {
        // truyen du lieu thong qua constructor
        student s= new student("Tran Tuan Anh", 19);
        System.out.println(s);
        student s1= new student("tran thi khanh hoa", 14);
        System.out.println(s1);
        student s12= new student();
        s12.setName("nguyen thi hong");
        s12.setAge(39);
        System.out.println(s12);
        student s11= new student();
        s11.setName("tran duy muoi");
        s11.setAge(40);
        System.out.println(s11);
    }
}
