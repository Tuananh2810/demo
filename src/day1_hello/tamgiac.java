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
// tinh chu vi va dien tich cua tam giac
public class tamgiac {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);// chuyển dữ liệu kiểu int sang string hết: dùng pa+ ctrl+ space.
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        System.out.println("a= " + a);
        System.out.println(" b= " + b);
        System.out.println("c= " + c);
        double p = (double)(a+b+c)/2;
        System.out.println(" chu vi:"+ (a+b+c));
        System.out.println(" nua chu vi:"+ p);
        double s;
        s= Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(" dientich: "+ s);
    }
}
