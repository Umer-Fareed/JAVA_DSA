import java.util.*;
public class functions_cl5 {
 //FUNCTION NO 1:..................
 /*public static void printMyName(String name){
    System.out.println(name);
    return;*/

 //FUNCTION NO 2:..................
 /*public static int sumNumber(int a , int b){
    
    int c = a + b;
    return c;
 }*/

 //FUNCTION NO 3:.............................
 public static int fict(int a){
    int result = 1;
  for(int i = a; i >=1; i--){
    result  = result * i;

  }
   return result;
 }

 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int result = fict(a);
    System.out.println("the fictorial of "+ a +" is  "+ result);
 }
}
