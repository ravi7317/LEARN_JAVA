package practiceset;

import java.util.Scanner;

public class incometa {
    public static void main(String[] args) {
        System.out.println("Enter your tax slab");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax=0;
        if(income<=250000){
            System.out.println("No Tax");
        }
        else if(income<= 500000){
         tax= (income-250000)*5/100;
         System.out.println("Your Tax is "+ tax);
        }
        else if (income<=1000000){
            tax= (income- 250000)*20/100;
            System.out.println("Your tax is "+ tax);
        }
        else{
         tax = (income - 250000)*30/100;
         System.out.println("Your tax is "+ tax);
        }
    }
}
