
import java.util.Arrays;

public class largest_smallest {
    public static void main(String[] args) {
        int arr[]={24,15,36,88,65,89,68};
        int smallest=arr[0];
        int largest=arr[0];

        System.out.println("Given Array are :" +Arrays.toString(arr));


        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.println("Largest numbar of given Array is "+largest);
        System.out.println("Smallest number of given Arrary is "+smallest);
    }
    
}
