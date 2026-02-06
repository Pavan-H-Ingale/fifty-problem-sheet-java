import java.util.Arrays;

public class reversearr {
    public static void main(String[] args) {
        
        int arr[]={14,25,36,89,56,23,47,58,54};
        int revarr[]=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        System.out.println("Given array are "+Arrays.toString(arr));

        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
           revarr[i]= arr[i];
        }
        System.out.println("Reverse array of given array "+Arrays.toString(revarr));



    }
}
