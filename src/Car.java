/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author EARTHPYY
 */
public class Car extends VehicleRegistration {
    private int cylinderVolume;
    
    public Car(String ownerName, String ownerAddress, String maker, String model, int numOfWheels, int cylinderVolume) {
        super(ownerName, ownerAddress, maker, model, numOfWheels);
        this.cylinderVolume = cylinderVolume;
    }

    public int getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(int cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }
    
    @Override
    public void recordTax(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month, day);
        if (cylinderVolume <= 1500) {
            addAnnualTaxRecord(new TaxRecord(cal, cylinderVolume * 1.5));
        } else {
            addAnnualTaxRecord(new TaxRecord(cal, cylinderVolume * 2.0));
        }
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", cylinderVolume=" + cylinderVolume + "}";
    }
}
