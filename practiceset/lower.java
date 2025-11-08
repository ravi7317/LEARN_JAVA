package practiceset;

public class lower {
    public static void main(String[] args) {
       //problem 1 conver to Lower case 
       String name = "Ram Manohar";
       //System.out.println(name);
       name = name.toLowerCase();
       System.out.println(name);

       //problem 2 write a program to replace space to underscore 
       String ravi = name.replace(" ", "_");
       System.out.println(ravi);

       //problem 3 write a program to fill in a letter template 
       //which look like 
       //letter = "dear </name> thanks a lot "
       //replace </name> with a string (some name )

       String letter= " Dera name , thanks a lot";
       String value = letter.replace("name", "Ravi");
       System.out.println(value);

       // problem 4 : write a java program to detect double 
       // triple space in a string 
        String mystring = "Ram  is a  good   boy";

        System.out.println("Single space index: " + mystring.indexOf(" "));
        System.out.println("Double space index: " + mystring.indexOf("  "));
        System.out.println("Triple space index: " + mystring.indexOf("   "));

        //problem 5:  write a program to  format the following letter using escape sequence characters 
        // letter " Dear Harry, This java Course is nice Thanks"
        String escap = "\"Dear Harry, This java Course is nice Thanks\"";
        System.out.println(escap);
           }
}
