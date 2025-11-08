package IfElse;

public class logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

// For logial or


        boolean c = true;
        boolean d = false;
        if(c || d){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // for logical not

        System.out.println("not a is " + !a);
        System.out.println("not b is"+ !b);
    }
}


