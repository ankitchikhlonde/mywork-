public class touppercasestringbuilderques {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");  //sting builder class

        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i< str.length()-1){// emptyspace && aur bhi letters hai to
                sb.append(str.charAt(i)); // empty space copy
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));  //baki letters ko uppercase krke copy krdo
            }else{
                sb.append(str.charAt(i)); // space, word ,no. copy kr dege
            }
        }
        return sb.toString(); 

    }
    public static void main(String[] args) {
        String str = "hi , i am ankit";
        System.out.println(toUpperCase(str));

    }
}

