public class maxsubarraysumprefix {
    public static void maxsarraysum(int numbers[]){
        int currsum= 0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]= numbers[0];
        //calculate prefix aaray
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }

        for( int i =0; i<numbers.length;i++){
            int start= i;
            for(int j= i;j<numbers.length;j++){
                int end =j;
                currsum= start== 0 ? prefix[end]: prefix[end] - prefix[start- 1];
             //time complecity o(n^2) - coz of 2 loops
               if(maxsum < currsum){
                maxsum = currsum;
               }
            }
            
        }
        System.out.println("max sum=" +maxsum);
    }
    public static void main(String[] args) {
        int  numbers[]={2,4,6,8,10};
        maxsarraysum(numbers);
    }
}

