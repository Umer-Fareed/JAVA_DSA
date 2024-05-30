import java.util.*;
public class Strings {
    public static void main(String args[]){

        //string declaration 
        String name = "tony stark ";
        String fullname = " umer fareed is my best frind";
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("your name is " + name1);

        /*functions on string */
        //1: concatenation
         String firstname = "tony ";
         String lastname = "stark";
         String fullname = firstname + lastname;

        // to output the length of the string 
         System.out.println(fullname.length());

        //charAt
         for(int i=0; i<fullname.length(); i++){
             System.out.println(fullname.charAt(i));
         }
       
        //compare strings
        //s1>s2: +ve value
        //s1==s2: 0
        //s1<s2: -ve value
        String name1 = "tony ";
         name2 = "tony ";
        if(name1.compareTo(name2)==0) {
            System.out.println("strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        //sub strings
        String sentence = " my name is fareed kamboh";
        String name = sentence.substring(9, 13);
        System.out.println(name);

        //strings are immutable 
    } 
}
