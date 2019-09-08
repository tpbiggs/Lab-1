import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter Price of Sale:");
        
        float priceSale = keyboard.nextFloat();
        float taxState = priceSale * .04F;
        float taxCounty = priceSale * .02F;
        float taxTotal = taxState + taxCounty;
        float realTotal = taxTotal + priceSale;
        
        System.out.println("State Tax: \t" + taxState);
        System.out.println("County Tax: \t" + taxCounty);
        System.out.println("Total Tax: \t" + taxTotal );
        System.out.println("Total Sale: \t" + realTotal);
        
    }
}
