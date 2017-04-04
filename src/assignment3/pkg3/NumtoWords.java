package assignment3.pkg3;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Class NumtoWords
 *
 * @author sharanya
 */
public class NumtoWords {

    String abc, inputString;
    long temp;
    int TenThousand, Thousand, Hundred, Tens, ones, hundredThousand, million, tenMillion, hundredMillion;
    int billion, tenBillion, hundredBillion, trillion, tenTrillion, hundredTrillion;

    /**
     * Converts this part of the number (lesser than or equal to 100 Million) to
     * its word equivalent
     *
     *
     */
    public void getString() {
        try {

            Scanner sc = new Scanner(System.in);
            inputString = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Exception Occurred!\n Please enter a number in ###############.####### format" + e);
        }

    }

    public void toWords(int number) {
        temp = number;
        ones = (int) temp % 10;
        Tens = (int) (temp % 100) / 10;
        Hundred = (int) (temp % 1000) / 100;
        Thousand = (int) (temp % 10000) / 1000;
        TenThousand = (int) (temp % 100000) / 10000;
        hundredThousand = (int) (temp % 1000000) / 100000;
        million = (int) (temp % 10000000) / 1000000;
        tenMillion = (int) (temp % 100000000) / 10000000;
        hundredMillion = (int) (temp % 1000000000) / 100000000;

        if (hundredMillion >= 1) {
            System.out.printf("%s Hundred ", abc = nowords(hundredMillion));

        }
        if (tenMillion == 1 && hundredMillion >= 0) {
            System.out.printf("%s Million ", abc = nowords((tenMillion * 10) + million));
        } else if (tenMillion > 1) {
            System.out.printf("%s ", abc = nowords(tenMillion * 10));
            System.out.printf("%s Million ", abc = nowords(million));
        }
        if (million != 0 && tenMillion == 0) {
            System.out.printf("%s Million ", abc = nowords(million));
        }
        if (hundredThousand >= 1) {
            System.out.printf("%s Hundred ", abc = nowords(hundredThousand));

        }
        if (TenThousand == 1 && hundredThousand >= 0) {
            System.out.printf("%s Thousand ", abc = nowords((TenThousand * 10) + Thousand));
        } else if (TenThousand > 1) {
            System.out.printf("%s ", abc = nowords(TenThousand * 10));
            System.out.printf("%s Thousand ", abc = nowords(Thousand));
        }
        if (Thousand != 0 && TenThousand == 0) {
            System.out.printf("%s Thousand ", abc = nowords(Thousand));
        }
        // else if (TenThousand == 1 && Thousand <= 9) {
        // System.out.printf("%s ", abc = nowords((TenThousand * 10) + Thousand));

        //}
        if (Hundred >= 1) {
            System.out.printf("%s Hundred ", abc = nowords(Hundred));
        }
        if (Tens == 1 && Hundred >= 1) {
            System.out.printf("%s ", abc = nowords((Tens * 10) + ones));
        } else if (Tens > 1) {
            System.out.printf("%s ", abc = nowords(Tens * 10));
            System.out.printf("%s ", abc = nowords(ones));
        } else if (ones != 0 && Tens == 0) {
            System.out.printf("%s ", abc = nowords(ones));
        } else if (Tens == 1 && ones <= 9) {
            System.out.printf("%s ", abc = nowords((Tens * 10) + ones));

        }
    }

    /**
     * Converts this part of the number (greater than 100 Million) to its word
     * equivalent
     *
     * @param n - Inputs the part of the number which is greater than 100
     * Million
     */
    public void convertBillion(int n) {
        billion = (int) n % 10;
        tenBillion = (int) (n % 100) / 10;
        hundredBillion = (int) (n % 1000) / 100;
        trillion = (int) (n % 10000) / 1000;
        tenTrillion = (int) (n % 100000) / 10000;
        hundredTrillion = (int) (n % 1000000) / 100000;
        if (hundredTrillion >= 1) {
            System.out.printf("%s Hundred ", abc = nowords(hundredTrillion));

        }
        if (tenTrillion == 1 && hundredTrillion >= 1) {

            System.out.printf("%s Trillion ", abc = nowords((tenTrillion * 10) + trillion));
        } else if (tenTrillion > 1) {

            System.out.printf("%s ", abc = nowords(tenTrillion * 10));
            System.out.printf("%s Trillion ", abc = nowords(trillion));
        } else if (trillion != 0 && tenTrillion == 0) {
            System.out.printf("%s Trillion ", abc = nowords(trillion));
        } else if (tenTrillion == 1 && trillion <= 9) {
            System.out.printf("%s Trillion ", abc = nowords((tenTrillion * 10) + trillion));

        }
        if (hundredBillion >= 1) {
            System.out.printf("%s Hundred ", abc = nowords(hundredBillion));

        }
        if (tenBillion <= 1 && hundredBillion >= 1) {

            System.out.printf("%s Billion ", abc = nowords((tenBillion * 10) + billion));
        } else if (tenBillion > 1) {

            System.out.printf("%s ", abc = nowords(tenBillion * 10));
            System.out.printf("%s Billion ", abc = nowords(billion));
        } else if (billion != 0 && tenBillion == 0) {
            System.out.printf("%s Billion ", abc = nowords(billion));
        } else if (tenBillion == 1 && billion <= 9) {
            System.out.printf("%s Billion ", abc = nowords((tenBillion * 10) + billion));

        }

    }

    /**
     * Inputs the number and returns the corresponding word for the number
     *
     * @param n n is the number to be converted to word
     * @return word the number in words
     */
    public String nowords(int n) {
        String word = "";
        switch (n) {
            /*case 0:
                word = "";
                return word;*/
            case 1:
                word = "One";
                return word;
            case 2:
                word = "Two";
                return word;
            case 3:
                word = "Three";
                return word;
            case 4:
                word = "Four";
                return word;
            case 5:
                word = "Five";
                return word;
            case 6:
                word = "Six";
                return word;
            case 7:
                word = "Seven";
                return word;
            case 8:
                word = "Eight";
                return word;
            case 9:
                word = "Nine";
                return word;
            case 10:
                word = "Ten";
                return word;
            case 11:
                word = "Eleven";
                return word;
            case 12:
                word = "Twelve";
                return word;
            case 13:
                word = "Thirteen";
                return word;
            case 14:
                word = "Fourteen";
                return word;
            case 15:
                word = "Fifteen";
                return word;
            case 16:
                word = "Sixteen";
                return word;
            case 17:
                word = "Seventeen";
                return word;
            case 18:
                word = "Eighteen";
                return word;
            case 19:
                word = "Nineteen";
                return word;
            case 20:
                word = "Twenty";
                return word;
            case 30:
                word = "Thirty";
                return word;
            case 40:
                word = "Forty";
                return word;
            case 50:
                word = "Fifty";
                return word;
            case 60:
                word = "Sixty";
                return word;
            case 70:
                word = "Seventy";
                return word;
            case 80:
                word = "Eighty";
                return word;
            case 90:
                word = "Ninety";
                return word;
        }
        return word;
    }

    /**
     * Splits the string into the decimal and fractional part,checks if it is
     * negative and if it is a valid input, prompts user to enter valid input, converts it into words, rounds off the decimal to two points
     * and displays the amount
     *
     * @return integer - indicates whether the input is a valid input or not
     * @throws Exception catches NoSuchElementexception while tokenising inputString
     * 
     */
    public int tokenizeString() throws Exception {
        StringTokenizer str = new StringTokenizer(inputString, ".");
        Scanner sc = new Scanner(System.in);
        int exitvariable = 0;

        System.out.println();
        while (str.countTokens() > 2) { // Checks if enetered input is in the correct format
            System.out.println("Enter a  valid input in in ###############.####### format\n");
            str = new StringTokenizer(sc.nextLine(), ".");
            System.out.println();
        }
        String s = str.nextElement().toString();
        String s2, s3, q1 = "0";
        int n1, n2, mark = 0, negative = 0;
        try { // Checks if input is integer, throws and catches Exception and prompts user to enter a valid integer input
            if (s.length() > 9) { // checks if the number is greater than 100 Million- calls a separte method if it is Billion or greater

                s2 = s.substring(0, s.length() - 9);
                s3 = s.substring(s.length() - 9, s.length());

                if (Integer.parseInt(s2) < 0) {
                    System.out.print("- "); // Outputs a minus sign if the entered integer is negative
                }

                n1 = Math.abs(Integer.parseInt(s2));// takes absolute value of integer 
                n2 = Integer.parseInt(s3);
                convertBillion(n1); // calls convertBillion to convert Number greater or equal to 1 Billion
                toWords(n2);// calls toWords to convert Numbers lesser than or equal to 100 Million 
            } else {
                if (Integer.parseInt(s) < 0) {
                    System.out.println("Number in words:\n");
                    System.out.print("- ");// Outputs a minus sign if the entered integer is negative
                }
                toWords(Math.abs(Integer.parseInt(s)));// takes absolute value and calls toWords to convert Numbers lesser than or equal to 100 Million 
            }
        } catch (Exception e) { // If a string is enetered as the input, then it is incorrect and the exit variable is set to 1 - thus cents part does not get executed
            exitvariable = 1;
            System.out.println("Invalid Input! Please enter a number in ###############.####### format\n");
            return 0;

        }

        if (exitvariable == 0) { // If input is valid- cents part is executed
            try {
                q1 = (str.nextElement().toString());
            } catch (Exception e) {

                int q = q1.length();
                double r = 1.0;
                for (int i = 0; i < q; i++) {
                    r = r * 10;
                }
                try {
                    double p = Integer.parseInt(q1) / r;
                    float number = Math.round(p * 100); // Rounds off the decimal part to two decimal points  
                    System.out.print("and ");
                    System.out.println((int) number + "/100");
                    System.out.println("\nNo cents part");
                    mark = 1;
                } catch (Exception ex) { // If a string is enetered as the input, then it is incorrect and the exit variable is set to 1 - thus cents part does not get executed
                    exitvariable = 1;
                    System.out.println("Invalid Input! Please enter a number in ###############.####### format\n");
                    return 0;

                }
            }
            if (mark == 0) {
                System.out.print("and ");
                int q = q1.length();
                double r = 1.0;
                for (int i = 0; i < q; i++) {
                    r = r * 10;
                }
                double p = Integer.parseInt(q1) / r;
                float number = Math.round(p * 100); // Rounds off the decimal part to two decimal points  

                System.out.println((int) number + "/100");// Displays the cents
            }

        }

        System.out.println();
        return 1;
    }

}
