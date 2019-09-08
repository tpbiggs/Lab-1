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
public class Cookies {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many cookies eaten:\t");
        
        int cookies = keyboard.nextInt();
        int caloriesEaten = cookies * 30;
        
        System.out.println("Total Calories Eaten:\t" + caloriesEaten);
        
    }
}
