/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;

/**
 *
 * @author EARTHPYY
 */
public class TaxRecord {
    private Calendar payDate;
    private double amountTax;

    public TaxRecord(Calendar payDate, double amountTax) {
        this.payDate = payDate;
        this.amountTax = amountTax;
    }

    public Calendar getPayDate() {
        return payDate;
    }

    public void setPayDate(Calendar payDate) {
        this.payDate = payDate;
    }

    public double getAmountTax() {
        return amountTax;
    }

    public void setAmountTax(double amountTax) {
        this.amountTax = amountTax;
    }

    @Override
    public String toString() {
        return "TaxRecord{payDate=" + payDate.getTime() + ", amountTax=" + amountTax + "}";
    }
}
