import java.util.Arrays;

public class largest_Secondlargest {
    public static void main(String[] args) {
        
        int arr[]={89,65,98,56,74,52,85,95};
        int largest=arr[0];
        int secondlargest=arr[0];
        System.out.println("Give Array are :"+Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }

        System.out.println("Largest number of given array is "+largest);
        System.out.println("Secondlargest number  of given array is "+secondlargest);

    }
    
}
