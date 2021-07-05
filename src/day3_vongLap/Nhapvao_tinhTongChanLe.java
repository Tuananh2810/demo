/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_vongLap;
 // tính tổng các sỗ chẵn và số lẻ từ1-n
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Nhapvao_tinhTongChanLe {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print(" input n: ");
        n=Integer.parseInt(sc.nextLine());
        int sumChan=0;
        int sumLe=0;
        
        
        for (int i = 0; i <= n; i++) {
            if( i%2==0){
                sumChan+=i;
                
            }else{
                sumLe+=i;
                
            }
            
        }
        System.out.println("tong chan: "+ sumChan);
        System.out.println("tong le: "+ sumLe);
       
    }
}
