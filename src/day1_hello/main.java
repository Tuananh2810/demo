/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_hello;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input your name: ");
        String name = sc.nextLine();
        
        System.out.println("name: "+ name ); 
        System.out.println(" input your age: ");
        int age= sc.nextInt();
        System.out.println("Age: "+ age);
        System.out.println(" input your mark: ");
         double diem= sc.nextDouble();
         System.out.println("Diem: "+ diem  );
    }
    
}
