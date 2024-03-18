import java.util.*;
public class Main
{
	 public static void main(String[] args) {
	int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8};
	         for(int i=0;i<arr.length;i++){
		   for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            arr[i]=arr[i]+arr[j];
		            arr[j]=0;
		            break;
		        }
		    }
		}
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
          			  if (arr[i] != 0) {
               		       arr[temp++] = arr[i];
          			  }
        	         }
       	 for (int i = temp; i < arr.length; i++) {
            	arr[i] = 0;
          }
          System.out.print(Arrays.toString(arr));
	}

}
