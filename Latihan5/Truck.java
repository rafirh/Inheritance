/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author rafir
 */
public class Truck {
    //the truck class has three fields
    public int cadence, gear, speed;
    
    //the Truck class has one constructor
    public Truck(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    //the trcuk class has four methods

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applybrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }
    
}
