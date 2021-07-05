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
public class NhapN_TinhTichChanLe {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println(" intput n:");
        n=Integer.parseInt(sc.nextLine());
        int tichChan=1;
        int tichLe=1;
        for (int i = 1; i <= n; i++) {
            if( i%2==0){
                tichChan*=i;
            }else{
                tichLe*=i;
            }
        }
        System.out.println(" gia trị của tich chan la: "+ tichChan);
        System.out.println(" gia tri cua tich le la:"+ tichLe );
    }
}
