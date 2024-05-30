import java.util.*;
public class conditions_cl3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        if(a==b){
            System.out.println("a is equal then b");
        }ee if(a>b){
            System.out.println("a is greater");

        }else if(a<b){
            System.out.println("a is lesser");

        }else{
            System.out.println("not velid"); 
        }
        */

        /*
         *  switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
            System.out.println("han g ");
                break;
            case 3:
            System.out.println("ki haal he");
                break;
            default:
            System.out.println("not in function");
                break;
        }
         */
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = sc.nextDouble();
        System.out.println("select an operation: ");
        System.out.println("1: for addition '+'");
        System.out.println("2: for subtrection '-'");
        System.out.println("3: for multipling '*' ");
        System.out.println("4: for dividing '/'");
        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("addition is: \n"+ (num1+num2));
            break;
            case 2:
            System.out.println("subtraction is: \n " + (num1-num2));
            break;
            case 3:
            System.out.println("multiplication is: \n" + (num1*num2));
            break;
            case 4:
            System.out.println("division is:\n " + (num1/num2));
            break;
            default:
            System.out.println("invelid syntex");
             break;
        
        
        }
    }
}