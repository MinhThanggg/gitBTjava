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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // bai a
        System.out.println("bài a");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap k: ");
        int k = input.nextInt();
        if(k <1 || k >=10){
            System.out.println("k khong hop le");
        }
        else{
            for (int i = 1; i < 10; i++) {
                System.out.format("%d * %d = "+k*i+"\n",k,i);
            }
        }
         System.out.println();
         System.out.println("Bài b");
        // bai b
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.format("%d * %d = " + j * i + "\t", j, i);
            }
            System.out.println();
        }
    }
}
