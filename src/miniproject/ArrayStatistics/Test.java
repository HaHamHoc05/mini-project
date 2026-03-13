/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject.ArrayStatistics;

/**
 *
 * @author Admin
 */
public class Test {
    
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 3, 10};
        // min
        int min = ArrayStatistics.findMin(arr);    
        System.out.println("Min = : " + min);
        
        // max
        int max = ArrayStatistics.findMax(arr);
        System.out.println("Max = : " + max);
        
        // average
        double ave = ArrayStatistics.calculateAverage(arr);
        System.out.println("Ave = : " + ave);
    }
    
    
}
