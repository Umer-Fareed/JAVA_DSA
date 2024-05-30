public class recursionBasic
 {
    /* 
    //print number from  n to 1
    public static void printnum (int n){
         if(n==0){
         return;
        }
        System.out.println(n);
         printnum(n-1);
    }
    */
    /* 
    //print number from 1 to n 
    public static void printnum1(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnum1(n+1);
    }
    */
    /* 
    //calculate sum of first N numbers
    public static void printsum(int i , int n , int sum ){
        if(i==n){
            sum += n ;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
        System.out.println(i);
    }
    */
    /* 
    //fictorial of n numbers 
    public static int  calfactorial(int n){
        if(n==1 || n==0){
            return 1;

        }
        int fic_nm1 = calfactorial(n-1);
        int fact_n = n*fic_nm1;
        return fact_n;
    }
    */
    /* 
    //fibonacci sqeuence till nth term
     public static void Printfib(int a , int b , int n){
        if(n==0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        Printfib(b, c, n-1);
        
     }
     */ 
    // pirnt c*n in nth trum
    public static int calcpower( int x , int n){
        if(n==0 ){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpownm1 = calcpower(x , n-1);
        System.out.println(xpownm1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        
       int x = 2, n = 5;
        int ans = calcpower(x, n);
        System.out.println(ans );
    }
}
