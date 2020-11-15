/* (C) IES San Vicente 2016
 * Javier Dacasa Gomez
 * This program calculates how many numbers of 1, 2, 3 or more digits are entered by the user until he/she types “end”
 */

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int oneDigit = 0, twoDigits = 0, threeDigits = 0, moreDigits = 0, number;
        String inputNumber;

        System.out.print("Insert a number: ");
        inputNumber = scan.next();

        while(!inputNumber.equals("end")){
            number = Integer.parseInt(inputNumber);
            if(number != 0)
            {
                if(number/10 == 0) {
                    oneDigit++;
                } else if (number/100 == 0) {
                    twoDigits++;
                } else if (number/1000 == 0) {
                    threeDigits++;
                } else {
                    moreDigits++;
                }
            }
            System.out.print("Insert a number: ");
            inputNumber = scan.next();
        }
        System.out.printf("Numbers with one digit: %d two digits: %d three digits: %d more digits: %d"
                        , oneDigit, twoDigits, threeDigits, moreDigits);
    }
}