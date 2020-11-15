/* (C) IES San Vicente 2016
 * Javier Dacasa Gomez
 * This program calculates the average of a set of marks, until the user types “end”
 */

import java.util.Scanner;

public class Average{
    public static void Main(){
        Scanner scan=new Scanner(System.in);
        double totalMark=0, mark, counter=0, average;
        String inputMark;

        System.out.print("Insert a mark: ");
        inputMark=scan.next();

        while(!inputMark.equals("end")){
            mark=Double.parseDouble(inputMark);
            counter++;
            totalMark+=mark;

            System.out.print("Insert a mark: ");
            inputMark=scan.next();
        }

        if(counter!=0){
            average=totalMark/counter;
            System.out.print("The average is {0}." + average);
        }
    }
}