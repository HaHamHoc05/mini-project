/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.PalindromeChecker;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap chuoi de kiem tra Palindrome: ");
        String input = sc.nextLine();
        
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;
        boolean isPalidrome = true;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalidrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalidrome) {
            System.out.println("Result: Palidrome");
        } else {
            System.out.println("Result: Not a Palidrome");
        }
    }
}
