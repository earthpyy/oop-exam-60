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
public class Pickup extends VehicleRegistration implements Comparable<Pickup> {
    private int type;
    private int cylinderVolume;
    private int weight;

    public Pickup(String ownerName, String ownerAddress, String maker, String model, int numOfWheels, int cylinderVolume, int type, int weight) {
        super(ownerName, ownerAddress, maker, model, numOfWheels);
        this.type = type;
        this.cylinderVolume = cylinderVolume;
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(int cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public void recordTax(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month, day);
        if (type == 0) {
            if (weight >= 1500) {
                addAnnualTaxRecord(new TaxRecord(cal, 900));
            } else if (weight > 1000 && weight < 1500) {
                addAnnualTaxRecord(new TaxRecord(cal, 750));
            } else {
                addAnnualTaxRecord(new TaxRecord(cal, 600));
            }
        } else if (type == 1) {
            if (cylinderVolume > 1800) {
                addAnnualTaxRecord(new TaxRecord(cal, cylinderVolume * 2));
            } else if (cylinderVolume > 60 && cylinderVolume <= 1800) {
                addAnnualTaxRecord(new TaxRecord(cal, cylinderVolume * 1.5));
            } else {
                addAnnualTaxRecord(new TaxRecord(cal, cylinderVolume * 0.5));
            }
        }
    }

    @Override
    public int compareTo(Pickup t) {
        return Integer.compare(cylinderVolume, t.cylinderVolume);
    }
    
    @Override
    public String toString() {
        return "Pickup{" + super.toString() + ", type=" + type + ", weight=" + weight + ", cylinderVolume=" + cylinderVolume + "}";
    }
}
