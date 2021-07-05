/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_vongLap;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NhapN_TinhUocCuaN {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
          int a;
          System.out.println(" input a: ");
        a=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                System.out.println(i);
            }
        }
        
    }
}
