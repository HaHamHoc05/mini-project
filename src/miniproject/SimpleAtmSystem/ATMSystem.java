/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.SimpleAtmSystem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ATMSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sodu = 0;
        int choice;

        do {
            System.out.println("---ATM MENU---");
            System.out.println("1. Kiem tra so du");
            System.out.println("2. Nap tien");
            System.out.println("3. Rut Tien");
            System.out.println("4. Thoat");
            
            choice = Integer.parseInt(sc.nextLine());
            
            switch(choice) {
            case 1: 
                System.out.println("So du tai khoan: " +sodu);
                break;
            case 2:
                sodu = napTien(sc,sodu);
                break;
            case 3:
                sodu = rutTien(sc,sodu);
            case 4:
                break;
            default:
                System.out.println("Vui long chon dung so trong menu!");
            }
        } while (choice != 4);
        
        
        
    }
    public static int napTien(Scanner sc, int sodu) {
        System.out.println("Nhap so tien ban muon nap: ");
        int naptien = Integer.parseInt(sc.nextLine());
        
        if (naptien > 0) {
            sodu += naptien;
            System.out.println("Nap tien thanh cong");
        } else {
            System.out.println("Nap tien that bai.");
        }
        return sodu;
    }
    
    public static int rutTien(Scanner sc, int sodu) {
        System.out.println("Nhap so tien ban muon rut: ");
        int ruttien = Integer.parseInt(sc.nextLine());
        
        if (ruttien >0) {
            sodu = sodu - ruttien;
            System.out.println("Ban da rut: " +ruttien);
            System.out.println("So du con lai la: " +sodu );
        } else {
            System.out.println("Rut tien that bai.");
        }
        return sodu;
    }
}
