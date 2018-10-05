/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author budis
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int nilai;
        int num1 = 10, num2 = 23, num3 = 5;
        
        nilai = (num1 >= num2) ? num1: num2;
        nilai = (num3 >= nilai) ? num3 : nilai;
        
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        System.out.println("number 3 = " + num3);
        System.out.println("Nilai tertingginya adalah angka = " + nilai);
    }
    
}
