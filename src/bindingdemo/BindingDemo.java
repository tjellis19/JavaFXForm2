/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindingdemo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author tme5209
 */
public class BindingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        System.out.println("d1 is " + d1.getValue() 
                + " and d2 is " + d2.getValue());
        d1.bindBidirectional(d2);    // now d1 = d2
        System.out.println("d1 is " + d1.getValue() 
                + " and d2 is " + d2.getValue());
        d1.setValue(50.2);
        System.out.println("d1 is " + d1.getValue() 
                + " and d2 is " + d2.getValue());
        d2.setValue(64.1);
        System.out.println("d1 is " + d1.getValue() 
                + " and d2 is " + d2.getValue());
    }
    
}
