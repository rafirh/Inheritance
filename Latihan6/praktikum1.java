/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author rafir
 */
public class praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static int tambah(int a, int b){
    return a+b;
    }
    public static int tambah(int a, int b, int c){
    return a+b+c;
    }
    public static double tambah(double a, double b){
    return a+b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        double d;
        a = 3; b = 4; c=8;
        d=0.5;
        
        System.out.println("1. " +(a+b));
        System.out.println("2. a<"+a+"> +"+" b<"+b+"> = " +(a+b));
        System.out.println("3. "+(a+b+c));
        System.out.println("4. " + (a+b+c-d));
    }
    
}