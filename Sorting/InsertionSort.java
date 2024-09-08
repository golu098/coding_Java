import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int []array){
        int n=array.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&& array[j-1]>array[j]){
                int temp=array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i] +" ");
        }

        System.out.println();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        insertionSort(array);


    }
}
