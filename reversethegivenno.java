public class reversethegivenno {
    public static void main(String args[]){
       int n=10899;
        int reverse=0;
        while(n>0){
           int lastdigit= n%10; // lastdigit print
           reverse=(reverse*10)+lastdigit;
           n=n/10; //n update
       
}
 System.out.println(reverse);
}
}