public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        
        //char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index
        sb.setCharAt(1, 'p');
        System.out.println(sb);
        
        //insert 
        sb.insert(0, "s");
        System.out.println(sb);

        sb.insert(2, "n");
        System.out.println(sb);

        //delete part of string
        sb.delete(2, 3);//ending index in non-inclusive
        System.out.println(sb);

        //append string
        sb.append("e");//str = str+"e"
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        //print length of string
        System.out.println(sb.length());
                                        
        //reverse the string 
        
        for(int i=0; i<sb.length()/2; i++){
            //set index
            int front = i;
            int back = sb.length()-1-i; //5-1-0 = 4
            //set char
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            //set chat at function
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);



    }
}
