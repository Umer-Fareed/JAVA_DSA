import java.util.Scanner;

public class sorting {
    public static void printarray (int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        /* 
        //time complexity = O(n^2)
        //bubble sort
        for( int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
        printarray(array);
        */
        /* 
        //selection sort
        for(int i=0; i<array.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<array.length; j++){
                if(array[smallest]>array[j]){
                    smallest = j;

                }

            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        printarray(array);
        */
        
        //insertion sort
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        printarray(array);
        
    }

}
