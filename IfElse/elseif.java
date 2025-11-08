package IfElse;
import java.util.*;
public class elseif {
    public static void main(String[] args) {
       // int age = 38;
       System.out.println("Enter the age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         switch(age){

            // using switch statement
            case 18:
            System.out.println("You are going to become adult");
            break;
            case 23:
            System.out.println("You are going to join a job");
            break;
            case 60:
            System.out.println("You are going to retire");
            break;
            default:
            System.out.println("Enjoy your life");
         }

// using if else elseif
        
        if(age>56){
            System.out.println("You are experience!");

        }
        else if(age> 46){
            System.out.println("You are semi experience");
        }
        else if(age>36){
            System.out.println("you are semi-semi experience");
        }
        else{
            System.out.println("you are not experience");
        }
            
    }
}
