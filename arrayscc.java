import java.util.*;
public class arrayscc {
    public static void main(String[] args) {
        int marks[]=new int[50];
        //int phy;
        //phy=sc.nextInt();

    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();   //phy
    marks[1]=sc.nextInt();  //chem
    marks[2]=sc.nextInt(); //maths
    System.out.println("phy:"+ marks[0]);
    System.out.println("chem:"+ marks[1]);
    System.out.println("maths:"+ marks[2]);

    marks[2]=100; //marks[2]= marks[2]+1 {add or sub(+,-)}
    System.out.println("maths:"+ marks[2]);
    int percentage= (marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage:"+ percentage+ "%");

    System.out.println("length of an array ="+ marks.length);

}
}