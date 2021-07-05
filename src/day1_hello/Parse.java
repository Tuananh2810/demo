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
public class Parse {

    public static void main(String[] args) {
        double a;
        float b;
        int c;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.print("input a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("input b: ");
        b = Float.parseFloat(sc.nextLine());
        System.out.print("input c: ");
        c = Integer.parseInt(sc.nextLine());
        System.out.print("input ten: ");
        ten =sc.nextLine();
         //nhan đôi dòng hiện tại ctrl+ shift+ xuống       
        System.out.println(" a= " + a);
        System.out.println(" b= "+b);
        System.out.println(" c= "+c);
        System.out.println(" ten="+ ten);

    }

}
