/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.mini_caculator;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập vào số thứ nhất:");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int num2 = Integer.valueOf(sc.nextLine());
        
        int cong = num1 + num2;
        int tru = num1 - num2;
        int nhan = num1 * num2;
        double chia = 1.0*num1 / num2;
        
        System.out.println("Cong: "+ num1 + " + "+ num2 + " = " +cong);
        System.out.println("Tru: " + num1 +" - "+ num2 + " = " +tru);
        System.out.println("Nhan: " + num1 +" * "+ num2 + " = " +nhan);
        System.out.println("Chia: " + num1 +" / "+ num2 + " = " +chia);
        
        System.out.printf("Cong: %d + %d = %d\n", num1, num2, cong);
        System.out.printf("Tru:  %d - %d = %d\n", num1, num2, tru);
        System.out.printf("Nhan: %d * %d = %d\n", num1, num2, nhan);
        System.out.printf("Chia: %d / %d = %.2f\n", num1, num2, chia);
        
        sc.close(); // đóng scanner
    }
}
