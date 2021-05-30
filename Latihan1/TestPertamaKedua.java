/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author rafir 
 */
public class TestPertamaKedua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat objek
        Kedua D2 = new Kedua();
        Pertama S1 = new Pertama();
        
        D2.BacaSuper();
        D2.info();
        
        //jarak
        System.out.println("");
        
        S1.terlindungi();
        S1.info();
    }
    
}