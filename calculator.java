import java.util.*;
public class calculator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
    System.out.println("enter b");
     int a=sc.nextInt();
    int b=sc.nextInt();
    char operator=sc.next().charAt(0);

       switch(operator) {
        case '+' : System.out.println(a+b);
            break;
        case '-' :System.out.println(a-b);
        break;
        case '*' :System.out.println(a*b);
        break;
        case '/' :System.out.println(a/b);
        break;
        case '%' :System.out.println(a%b);
        break;
       
    
}
}
}