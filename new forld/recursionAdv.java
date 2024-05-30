public class recursionAdv
 {  /*  
    // print all permutations of a string 
    public static void printperm(String str, String permutations){
        if(str.length() == 0){
            System.out.println(permutations);
            return;
        }
        
        
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            //"abc" --> "bc"
            String newString = str.substring(0, i) + str.substring(i+1);
           
            printperm(newString, permutations+currchar);
            
            
            
        }
        
    }
    */

    //Count total paths in a maze to move from (0,0) to (n,m)
    public static int totalpaths(int i , int j , int n , int m){
        if(i == n  || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
       
        int moveright = totalpaths(i,j+1, n,m);
        int  movedowm = totalpaths(i+1, j, n,m);
        return movedowm + moveright;
    }

    
    public static void main(String[] args) {
        //String str = "abc";
        //printperm(str, "");

        int n = 3 , m = 3;
        int path = totalpaths(0,0, n, m);
        System.out.println(path);
    }
}

