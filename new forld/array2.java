import java.util.*;
public class array2 {
    public static void main(String[] args) {
    /*
     Syntex of 2D array 
      type[][]arrayName = newtype[row][columns]
      int[][]number = new int[1][2]
     */
    ///////////////////////////////////////////////////////
    /* 
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
      int rows = sc.nextInt();
      System.out.println("Enter the number of cols: ");
      int columns = sc.nextInt();
      int [][] number = new int[rows][columns];
    //   input
    // rows
    for(int i=0; i<rows; i++){
        //columns
        for(int j=0; j<columns; j++){
            number[i][j]= sc.nextInt();
        }
    }

    // output
    for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++){
            System.out.print(number[i][j] + " ");
         }
         System.out.println();
    }
    */
    ///////////////////////////////////////////////////////////
    /* 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the number of cols");
    int cols = sc.nextInt();
    int [][] number  = new int[rows][cols];
    //input
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            number[i][j] = sc.nextInt();
        }
    }
    //number to search
    System.out.println("Enter the number to search: ");
    int num = sc.nextInt();
    // search 
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
              if(number[i][j]==num){
                System.out.println("Number found at: " + i + " , " + j);
              }
              

        }
    }
    */
    /////////////////////////////////////////////
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the number of cols");
    int cols = sc.nextInt();
    int [][] number  = new int[rows][cols];
    //input
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            number[i][j] = sc.nextInt();
        }
    }

    int max = 0;
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(number[i][j]>max){
                max = number[i][j];
            }
        }
    }
    System.out.println("The maximum number is this array is: " + max );
}
}