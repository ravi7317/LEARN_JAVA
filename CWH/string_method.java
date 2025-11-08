package CWH;
public class string_method {
    public static void main(String[] args) {
        String a = "Ravi";
       // System.out.println(a);



       //print length of the string
       int value = a.length();
       System.out.println(value);
        String b= new String("Verma");


        //printing upper case to lower case
        String lowerstring = b.toLowerCase();
        System.out.println(lowerstring);

         // printing lower case to upper case 
       // System.out.println(b);
       String uppeString = b.toUpperCase();
       System.out.println(uppeString);
       String c= new String("      ram is a good boy");

       //triming the string trelling the zero 
       String trimString = c.trim();
       System.out.println(trimString);

       // printing start point of the index 
        System.out.println(b.substring(3));
        String d = "abcdefgh";
        System.out.println(d);

        //printing start and end index of the string
        String sub = d.substring(3,5);
        System.out.println(sub);

        //printing sub string of String
        String rep = d.replace("a","c");
        System.out.println(rep);
        // replace character or string

        System.out.println(b.startsWith("V"));
        System.out.println(b.endsWith("a"));
        // return bollean value start and end with this char 


        System.out.println(b.charAt(3));
        System.out.println(d.indexOf("g"));
         // printinh charcter at that inex and tell this char which index 

        // Searching start from 2 index
        String modifi = "bahadur";
        System.out.println(modifi.indexOf("a",2));

        System.out.println(modifi.lastIndexOf("a"));
        System.out.println(modifi.lastIndexOf("a",4));
        
        String equ = "Varanshi";
        System.out.println(equ.equals("Varanshi"));
        System.out.println( equ.equalsIgnoreCase("vaRanShi"));

        // two string equals check 
        //ignor lower and upper case using equalsignor upper case

    }
}
