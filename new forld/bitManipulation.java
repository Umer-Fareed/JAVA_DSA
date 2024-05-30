import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
       /*
       //get bit operation
        int n = 5; 
        
        int pos = 3;
        int bitmask = 1<<pos;
         //perform or operation
        if((bitmask & n)==0){
            System.out.println("number is zero");
        }
        else{
            System.out.println("number is one ");
        }
        */
        /* 
        //set bit operation 
        int n = 9;
        int pos = 1; 
        int bitmask = 1<<pos;

        int newNumber = bitmask | n ;// perform and 
        System.out.println(newNumber);
        */
        /* 
        //Clear bit operation 
        int n = 5;
        int pos = 2;
        int bitmast = 1<<pos;
        int notbitmast = ~(bitmast);

        int newnumber = notbitmast | n ;
        System.out.println(newnumber);
        */
        /* 
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1:set , oper=0:clear
        int n =5;
        int pos = 1;
        int bitmask=1<<pos;
        if(oper==1){
        //set oper
        
        int newnumber=bitmask | n ;
        System.out.println(newnumber);
        }
        else{
            //clear oper
            int notbitmast= ~(bitmask);
            int newnumber = notbitmast | n;
            System.out.println(newnumber);
        }
        */



    }
}
