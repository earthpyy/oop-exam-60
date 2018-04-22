
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author EARTHPYY
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("Jane", "100 Bangkok", "Nissan", "Note", 4, 1200);
        car1.recordTax(2016, 2, 1);
        car1.recordTax(2017, 2, 1);
        car1.recordTax(2018, 2, 1);
        System.out.println(car1);
        ArrayList list = car1.getAnnualTaxRecord();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");
        Pickup p1 = new Pickup("YenJai", "99 Ayuthaya", "Ford", "Ranger", 4, 3200, 0, 2000);
        
        p1.recordTax(2016, 1, 1);
        p1.recordTax(2017, 1, 1);
        p1.recordTax(2018, 1, 1);
        System.out.println(p1);
        list = p1.getAnnualTaxRecord();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------");
        Pickup p2 = new Pickup("Joe", "77 Saraburi", "Toyota", "Fortuner", 4, 2800, 1, 1600);
        
        p2.recordTax(2016, 0, 1);
        p2.recordTax(2017, 0, 1);
        p2.recordTax(2018, 0, 1);
        System.out.println(p2);
        list = p2.getAnnualTaxRecord();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Implement comparable");
        System.out.println("--------------------");
        if (p1.compareTo(p2) > 0) {
            System.out.println("p1 is larger than p2");
        } else if (p1.compareTo(p2) < 0) {
            System.out.println("p1 is smaller than p2");
        } else {
            System.out.println("Equal size");
        }
        
//        System.out.println("");
//        System.out.println("-------------------------------------");
//        System.out.println("Test of using GregorianCalendar class");
//        System.out.println("-------------------------------------");
//        Calendar c1 = new GregorianCalendar(2018, 3, 23);
//        System.out.println(c1.getTime());
    }
    
}
