import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,9,7};
        boolean size=true;
        while(size)
        {
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp;
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else{
                break;
            }
        }
    }
        
       System.out.println("Sorted Array is=");
       for(int i=0;i<=arr.length;i++)
       {
          System.out.println(arr[i]); 
       }
    }
}


