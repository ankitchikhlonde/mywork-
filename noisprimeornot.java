import java.util.*;
public class noisprimeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==2) {
            System.out.println("n is prime ");
        }
        else{
            boolean isprime= true;
            for(int i=2; i<=n-1;i++){ //loop can run form 2 to root n
                //for(int i=2; i<=math.sqrt(n);i++100)
                if(n%i ==0){// n is a multiple of i { inot equal to 1 or n}
                 isprime= false;
                }
                
            }
            if (isprime== true){
                System.out.println("n is prime");
                
            }
            else{
                System.out.println("n is not prime");
            }
        }
    }
    
}

