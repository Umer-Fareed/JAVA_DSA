import java.util.*;
public class arrays {
    public static void main(String[] args) {
        //Predefine array 
        /*int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 34;
        marks[2] = 54;
       // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for(int i = 0 ; i<3; i++){
            System.out.println(marks[i]);
        }*/

        /// array from user 
       /*  Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i <= size; i++){
           numbers[i] = sc.nextInt();
        }
        for(int i = 0; i<= size ; i ++){
            System.out.println(numbers[i]);
        }*/


        // find number 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //for create and input the array
        int array[] = new int[size];
        for(int i=0; i<=size; i++){
            array[i] = sc.nextInt();
        }
        // the number to find
        int num = sc.nextInt();

        // finding the number from array 
        for(int i=0; i<=array.length; i++){
            if(array[i]==num){
                System.out.println(i);
            }
        }
    }
}
