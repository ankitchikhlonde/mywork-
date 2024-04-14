public class bubblesort {
    public static void sort(int arr[]){
        for(int turns=0; turns<arr.length-1;turns++){  // n times(turns)
            for(int j=0 ;j<arr.length-1-turns; j++){  //n-1-turns times
                if(arr[j]> arr[j+1]){
                    // swap
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }

            }//tc= O(n2)

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
        sort(arr);
        printarr(arr);
    }
}
