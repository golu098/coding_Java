
import java.util.Scanner;

class SelectionSort{
    public static void selectionSort(int[]arr){
        int n=arr.length;
        for (int idx = 0; idx < n-1; idx++) {
            int miniIndex=idx;
            for(int idx1=idx+1;idx1<n;idx1++){
                if(arr[idx1]<arr[miniIndex]){
                    miniIndex=idx1;
                }
            }
            int temp=arr[miniIndex];
            arr[miniIndex]=arr[idx];
            arr[idx]=temp;
            
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for (int idx = 0; idx < arr.length; idx++) {
            System.err.println(arr[idx]);
            
        }
    }
} 