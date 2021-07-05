/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5_VongLapWhile_Dowhile;

import java.util.Scanner;

/**
 *
 * @author hp
 */
// in cac so tư 1-10
public class VongLapWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println(" input n: ");
        n= Integer.parseInt(sc.nextLine());
        
        while (true) {            
            if (n<=0) {
                System.out.println(" input n:");
                n= Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("gi tri cua n la: "+ n);
                break;
            }
        }
    }
}
