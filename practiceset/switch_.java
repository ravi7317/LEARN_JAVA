package practiceset;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        //Question 4:
        // weite a java program to find out the day of 
        // the week given the number [1 form monday, 2 fro tuesday ... and so on !]
        System.out.println("Enter Your Day");
        Scanner sc= new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thrusday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
    }
}
