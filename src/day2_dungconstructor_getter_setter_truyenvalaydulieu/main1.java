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
public class main1 {

    public static void main(String[] args) {
// lấy dữ liệu ra qua getter
        student s = new student("tran tuan anh", 19);
        String name = s.getName();
        int age = s.getAge();
        System.out.println(" Name: " + name);
        System.out.println(" age: " + age);

    }
}
