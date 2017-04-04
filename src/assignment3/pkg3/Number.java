/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.pkg3;

import java.util.Scanner;

/**
 * Class Number
 *
 * @author sharanya
 */
public class Number {

    /**
     * Inputs the number to be converted to string, Initializes numtoWords
     * object and calls tokenizeString method
     *
     * @param args the command line arguments
     * @throws Exception catches any unexpected exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        NumtoWords ob = new NumtoWords();
        Scanner continueVar = new Scanner(System.in);
        do {
            System.out.println("Enter a number to be displayed in words (Maximum limit 999 Trillion)\n###############.####### format\n* If input exceeds 999 Trillion the next digits will be augmented *\n");

            try {
                ob.getString();
                System.out.println("");
                while (ob.tokenizeString() == 0) {
                    ob.getString();
                }
            } catch (Exception e) {
                System.out.println("\nException Occurred!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter a number in ###############.####### format");
            }
            System.out.println("Continue? Press y");
        } while (continueVar.nextLine().equals("y"));
    }
}
