import java.util.*;
class Main{
    public static void main(String args[]){
        int mat[][] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
        int sum=0,sum2=0,TotalSum=0;
        int M = mat.length;
        int N = mat[0].length;
        for (int i=2;i<M;i++){
            for(int j=0;j<N;j++){
                sum+=mat[i][j];
            }
        }
        System.out.print(sum);
    }
}
