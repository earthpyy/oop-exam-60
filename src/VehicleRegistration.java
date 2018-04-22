/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EARTHPYY
 */
public abstract class VehicleRegistration {
    private String ownerName;
    private String ownerAddress;
    private String maker;
    private String model;
    private int numOfWheels;
    private Date registrationDate;
    private ArrayList<TaxRecord> annualTaxRecord;

    public VehicleRegistration(String ownerName, String ownerAddress, String maker, String model, int numOfWheels) {
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.maker = maker;
        this.model = model;
        this.numOfWheels = numOfWheels;
        this.registrationDate = new Date();
        this.annualTaxRecord = new ArrayList<>();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public ArrayList<TaxRecord> getAnnualTaxRecord() {
        return annualTaxRecord;
    }

    public void setAnnualTaxRecord(ArrayList<TaxRecord> annualTaxRecord) {
        this.annualTaxRecord = annualTaxRecord;
    }
    
    public void addAnnualTaxRecord(TaxRecord taxRecord) {
        annualTaxRecord.add(taxRecord);
    }
    
    public abstract void recordTax(int year, int month, int day);

    @Override
    public String toString() {
        return "VehicleRegistration{ownerName=" + ownerName + ", ownerAddress=" + ownerAddress + ", maker=" + maker + ", model=" + model + ", numOfWheels=" + numOfWheels + ", registrationDate=" + registrationDate + "}";
    }
}
