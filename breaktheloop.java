import java.util.*;

public class breaktheloop {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);   //obj
    do {
        System.out.println("enter your no.=");
        int n=sc.nextInt();
        if(n%10 ==0){
         break;
        }
        System.out.println();

    }
    while(true);
        
    }

   }

