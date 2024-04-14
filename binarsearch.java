public class binarsearch {
    public static int binsearch(int numbers[], int key){
    int start =0,end = numbers.length-1;
    while( start<= end){
        //comparison
        int mid =( start +end)/2;
        if (numbers[mid] ==key){
            return mid;

        } if(numbers[mid]< key){//right
            return mid+1;

        }else{ //left
            end= mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14};
        int key =8;
        System.out.println("index for the key:"+ binsearch(numbers, key));
    }
}
