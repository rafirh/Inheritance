/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author rafir
 */
public class B extends A{
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    
    //override terhadap method tampilkanNilai di A
    public void tampilkanNilai(){
        System.out.println("Nilai b : "+getB());
    }
}
