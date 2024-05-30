import java.util.*;

public class practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colunm = sc.nextInt();
        int [][] array = new int[row][colunm];
        for(int i = 0; i< row; i++){
            for(int j=0; j<colunm; j++){
                array[i][j] = sc.nextInt();

            }
        }

        int num = sc.nextInt();

        for(int i=0; i<=row; i++){
            for(int j=0; j<=colunm; j++){
                if(array[i][j]==num){
                    System.out.println("number is found at" + i + ", " + j);
                }else{
                    System.out.println("not there ");
                }
            }
        }


    }


}
