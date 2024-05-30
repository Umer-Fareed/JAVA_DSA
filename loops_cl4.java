 import java.util.*;
 public class loops_cl4 {
   public static void main(String[] args) {
    // QESTION NO 1:........................................
     /*for( int counter = 0; counter<12;counter = counter +1){
        System.out.print(counter+" ");
     }*/

    // QUESTION NO 2:......................................
     /*
     for( int i = 0; i < 4; i++){
        for(int j = 0 ; j<=4;j++){
        System.out.print('*');
     }
     System.out.print("\n");
    } */
     
    //QUESTION NO 3:........................................
     /*Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

    int sum = 0;
    for (int i = 0; i<=n; i++){
        sum = sum +i;

    }System.out.println(sum);*/

    //QUESTION NO 4:.........................................
    /* 
     //while loops 
     int i = 0;
     while (i<12){
        System.out.println(i);
        i++;
     }*/

     //QUESTION NO 5:......................................
     /*Scanner sc  = new Scanner(System.in);
     int n = sc.nextInt();
     int result = 0;
     for(int i = 1; i<11; i++){
        result = i * n;
        System.out.println(n + " * " + i + " = "+ result);
     }*/

     //QUESTION NO 6:...................................
      /* int n = 4;
       int m = 5;
       for (int i = 1; i<=n; i ++){
        //innter loop
        for(int j = 1; j<=m; j ++){
            if( i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
        }
        System.out.println();
       } */
    
     //QUESTION NO 7:.............................
      /*Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i = 1; i <=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }*/

      //QUESTION NO 8:.................................
      /*Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for( int i = n; i>=1; i--){
        for(int j=1; j<=i; j++){
           System.out.print("* ");
        }
        System.out.println();
      }*/

      //QUESTION NO 9:...........................
      /*int n = 5;
      for( int i=1; i<=n; i++){

        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      }*/

      //QUESTION NO 10:..............................
     /* int n = 5;
      
      for(int i=1; i<=n; i++){

        for(int j=1; j<=i; j++){
            
            System.out.print(j);
           
        }
       
        System.out.println();
      }*/ 

      //QUESTION NO 11:..............................
      /*int n = 5;
      for(int i = n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
      }*/

      //QUESTION NO 12:..............................
      /*int n = 5;
      int ans = 1;
      for(int i=1; i<=n; i++){
       
        for(int j=1; j<=i; j++){
            System.out.print(ans+" ");
            ans = ans +1;
        } 
        System.out.println();
      }*/

      /*int n = 5;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0 ){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
      }
      System.out.println();
    }*/

    //QUESTION NO 13:...........................
    int n = 5;
    for(int i = 1; i <= n; i++){
      for(int j = 1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j = i; j<=2*i-1; j++){
        System.out.print("*");
        
      }
      System.out.println();
    }
    for(int i = n; i >=1 ; i--){
      for(int j = 1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j = i; j<=2*i-1; j++){
        System.out.print("*");
        
      }
      System.out.println();
    }
    //QUESTION NO 14:...........................

   }

}
