/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int s =0;
        if (n % 2 ==0) {
            for (int i = 2; i <= n; i+=2) {
                if (i != n) {
                    s += i;
                System.out.format("%d + ",i);
                }
                else{
                    s += i;
                     System.out.format("%d \n",i);
                }
            }
        }
        else{
            for (int i = 1; i <= n; i+=2) {
                if (i != n) {
                    s += i;
                System.out.format("%d + ",i);
                }
                else{
                    s += i;
                     System.out.format("%d \n",i);
                }
            }
        }
        System.out.println("Tổng là: "+s);
    }
}
