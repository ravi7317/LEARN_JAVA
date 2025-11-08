package practiceset;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        // Question 1 what will be the output of this program
    
    int a = 10;
    if(a==11){
        System.out.println("Iam 11");

    }
    else{
        System.out.println("I am not 11");
    }

    //question 2
    // write a program to find out weather a student is pass or fail if it require total 40% 
    // and at least 33% in each subject to pass 
    // assume 3 subject and take marks as an input from the user 

    System.out.println("Enter the marks");
    Scanner sc = new Scanner(System.in);
    int marks1 = sc.nextInt();
    int marks2 = sc.nextInt();
    int marks3 = sc.nextInt();
     double Percent = (marks1 + marks2+marks3)*100/300;
    System.out.println("Percent = " + Percent);

    if(Percent>=40 && marks1>=33 && marks2 >= 33 && marks3>33){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

}
}

