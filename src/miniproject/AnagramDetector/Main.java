/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.AnagramDetector;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String input1 = sc.nextLine();
        System.out.println("Enter second word: ");
        String input2 = sc.nextLine();
        
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        
        if (input1.length() != input2.length()) {
            System.out.println("Not Anagram");
        }
        // tạo một mảng 26 phần tử tương ưng 26 chữ cái
        int[] count = new int [26];
        for (int i = 0; i < input1.length(); i++ ) {
            char c = input1.charAt(i);
            int index = c - 'a';
            count[index]++;
        
        }
        for (int i = 0; i < input2.length();i++) {
            char c = input1.charAt(i);
            int index = c - 'a';
            count[index]--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagram");
            } else {
                System.out.println("Anagram");
            }
        }
    }
}
