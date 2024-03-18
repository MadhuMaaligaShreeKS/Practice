import java.util.*;
public class Main{
    public static void main(String arg[]){
        int ar[]={5, 8, 11, 6, 2 ,1, 7};
        int even=0,odd=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0){
                odd++;
            }
            else{
                even++;
            }
        }
        int e[]=new int[even];
        int o[]=new int[odd];
        int c=0,d=0;
         for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0){
                o[c++]=ar[i];
            }
            else{
                e[d++]=ar[i];
            }
        }
        Arrays.sort(o);
        int max=e[0];
        int temp=0;
        for(int i=0;i<even;i++){
            if(e[i]>max){
                temp=max;
                max=e[i];
            }
        }
      
        int n=odd+even,g=0;
        int k=0;
        int arr[]=new int[n];
        for(int i=0;i<odd;i++){
            arr[g++]=o[i];
        }
        for(int i=odd;i<n;i++){
            arr[i]=e[k++];
        }
        System.out.print(Arrays.toString(arr));
        
    }
}
