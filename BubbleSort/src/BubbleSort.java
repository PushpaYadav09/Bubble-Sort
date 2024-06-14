import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements in Array B:");
        m=sc.nextInt();
        int[] B=new int[m];

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        Bubblesort(B);
        System.out.println("sorted array array B:");
        for (int i = 0; i < m; i++) {
            System.out.println(B[i]);
        }
    }
    private static void Bubblesort(int[] B) {
            int m=B.length;
            for(int k=0;k<m-1;k++){
                for(int l=0;l<m-k-1;l++){
                    if(B[l]>B[l+1]){
                        int temp;
                        temp=B[l];
                        B[l]=B[l+1];
                        B[l+1]=temp;
                    }
                }
            }
        }
    }