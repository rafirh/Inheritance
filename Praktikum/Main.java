/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author rafir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek guru
        Guru pakGuru = new Guru("Pak Yanto", "Matematika", 43, "19850723200502");
        pakGuru.info();
        
        //membuat objek murid
        Murid murid = new Murid("Andi", "X RPL 1", 19, 16, "171807019");
        murid.info();
        
        //membuat objek karyawan
        Karyawan satpam = new Karyawan("Pak Muklis", "Security", 40, "19850723200532");
        satpam.info();
        
    }
    
}