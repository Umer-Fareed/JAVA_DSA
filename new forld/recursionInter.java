import java.util.HashSet;
public class recursionInter
 {  /* 
    //tower of hanoi
    public static  void towerofhanoi(int n , String src , String help , String des){
        if(n==1){
            System.out.println("transfor disk "+ n + " from " + src + " to " + des);
            return;
        }
         towerofhanoi(n-1, src , des, help);
        System.out.println("transfor disk "+ n + " from " + src + " to " + des);
        towerofhanoi(n-1, help, src, des);
    }
    */
    /* 
    //print a string in revrse 
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx-1);
        
    }
    */
    /* 
    //find 1st and last accurance of an element in string
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx , char element ){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currchar = str.charAt(idx);
        if(currchar == element){
           if(first==-1){
            first = idx;

           }else{
            last = idx;
           }
        }

        findOccurance(str, idx+1, element);

    }
    */
    /* 
    //check array is sorted or(strictly increasing)
    public static boolean checksort(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            //sorted till now
            return false;
        }
        return checksort(arr, idx+1);
        
    }
    */
     /* 
    //move all x toword end of string 
    public static void moveAllx(String str, int count , int idx, String newstring){
        
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newstring+='x';
            }
            System.out.println(newstring);
            return;
        }
        
        char currchar = str.charAt(idx);
        if(currchar =='x'){
            count++;
            moveAllx(str, count, idx+1, newstring);
        }else{
            newstring+=currchar;
            moveAllx(str, count, idx+1, newstring);
        }
    }

    */
    /* 
    // remove duplicate chr from string 
    
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']==true){
            removeDuplicate(str, idx+1, newstring);
        }else{
            newstring+=currchar;
            map[currchar-'a']=true;
            removeDuplicate(str, idx+1, newstring);
        }
    }
    */
    /* 
    //calculate all subsequance of the string
    public static void subsequance(String str, int idx , String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        //to be 
        subsequance(str, idx+1, newString+currchar);
        // not to be 
        subsequance(str, idx+1, newString);
    }
    */
    /* 
    //calculate all unique subsequance in string 
    public static void unique_subsequance(String str, int idx , String newString , HashSet<String> set){

        if(idx == str.length()){
           if(set.contains(newString)){
            return;

           }else{
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }
        char currchar = str.charAt(idx);
        //to be 
        unique_subsequance(str, idx+1, newString+currchar, set);
        // not to be 
        unique_subsequance(str, idx+1, newString, set);
    }
    */
    /* 
    //maping possible combinations 
    public static String[] keypad = {". ", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu","vwk","yz"};
    public static void mappingcomb(String str, int idx, String combinations){
        if(idx == str.length()){
            System.out.println(combinations);
            return;
        }
        char currchar = str.charAt(idx);
        String maping = keypad[currchar - '0'];

        for(int i=0; i<maping.length(); i++){

            mappingcomb(str, idx+1, combinations+maping.charAt(i));
            System.out.println(combinations);
        }
    }
    */
    public static void main(String[] args) {
       //String str = "abcaaadaaddad";
       //findOccurance(str,0,'a');

       // int arr[]= {1,2,3,4,5,6};
       // System.out.println( checksort(arr, 0));

       //String str = "axbcxxd";
       //moveAllx(str, 0, 0, "");
         
       //String str = "abccddefgg";
       //removeDuplicate(str, 0, "");

       //String str = "abcde";
       // subsequance(str, 0, "");

       //String str = "aaa";
       //HashSet<String> set = new HashSet<>();
       //unique_subsequance(str, 0, " ", set);

        //String str = "23";
        //mappingcomb(str, 0,"");
    }
}
