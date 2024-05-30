import java.util.*;
public class functionp_cl6 {
    //function no 1:.........................
    /*public static int avg( int a, int b , int c){
        int result = (a + b + c)/3;
        return result;         
    }*/

    //function no 2:.........................
   /* public static int sum(int a){
        int result = 0;
        for(int i = 1; i <= a; i++){
            if(i%2==1){
                result = result + i;
            }
            continue;
        }
        return result;
    }*/

    //function no 3:........................
    /*public static int grater(int a , int b){
        int result = 0;
        if(a > b ){
            result = a;
        }else{
            result = b;
        }
        return result;
    }*/

    //function no 4:.........................
    /*public static float curcumfrance(int r ){
        float pi = 3.14159f;
        float cur = 2 * pi * r;
        return cur;
    }*/

    //function no 5:............................
    /*public static boolean str(int a){
        if(a>18){
          return true;

        }else{
            return false;   
             }
      
    }*/

    //function no 6:..............................
    /*public static void infiniteloop(){
        do{
            System.out.println("this loop is infinite");

        }while(true);
    }*/

    //function no 7:..............................
    /*public static int sum_e(int a, int b){
        int base = a;
        int power = b;
        for(int  i = 1; i<=power; i++){
            base = base*power;

        }
        return base;
    }*/
    
    //function no 9:.........................
    /*public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }*/
    /*public static void fibonacci(int a){
        int num1 = 0 , num2 = 1;
        System.out.println("the fibonacci series of:"+a+"is: ");
        for(int i =0; i<=a;i++){
            System.out.print(num1+" ");
          int sum = num1 + num2;
          num1 = num2;
          num2 = sum;
        }
    }*/
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number: ");
       int a= sc.nextInt();
       fibonacci(a);
      
       
    }
}
