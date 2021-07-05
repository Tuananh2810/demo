/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4_VongLap2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println(" inPut: ");
        n=Integer.parseInt(sc.nextLine());
        int check =0;
        for (int i = 2; i <n; i++) {
            if (n%i==0) {
               check= 1;
               break;
            }
        }
        if (check==0) {
            System.out.println(" n la so nguyen to");
        }
        else{
            System.out.println(" n khong phai la so nguyen to");
        }
    }
}
