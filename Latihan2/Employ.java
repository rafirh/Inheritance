/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author rafir
 */
public class Employ extends Person {
    private String noKaryawan;
    //Konstruktor
    public Employ(String noKaryawan, String nama, int usia){
        
        //eksekusi konstruktor indu dengan parameter nama dan usia
        super(nama, usia);
        
        this.noKaryawan = noKaryawan;
    }
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        //mengeksekusi method info di class induk
        super.info();
    }
}