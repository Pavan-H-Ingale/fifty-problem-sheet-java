import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={12,36,25,14,25,12,14,55};
       int count=0;
       List<Integer>list= new ArrayList<>();
       int remarr[]= new int[arr.length];
        System.out.println("Given Array are "+Arrays.toString(arr));
         for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    list.add(arr[i]);
                   count++;
                }
                else{
                     remarr[i]= arr[i];
                }
            }
         }
         System.out.println("Dublicate number of given array are "+list);
         System.out.println("Count of dublicate number is "+count);

    }
    
}
