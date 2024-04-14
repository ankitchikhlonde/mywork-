/*import java.util.Arrays;
public class inbuiltsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length; i++){
            int curr= arr[i];
            int prev =i-1;
            //finding out the correct poss to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;

            }
            //insertion
            arr[prev+1]= curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,3);
        //insertion(arr);
        printarr(arr);
    }
}*/

import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
    public static void insertion(Integer arr[]){
        for(int i=1;i<arr.length; i++){
            int curr= arr[i];
            int prev =i-1;
            //finding out the correct poss to insert
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]= arr[prev];
                prev--;

            }
            //insertion
            arr[prev+1]= curr;
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        //Arrays.sort(arr,0,3);
        //insertion(arr);
        printarr(arr);
    }
}
