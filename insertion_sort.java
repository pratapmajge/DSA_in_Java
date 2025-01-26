import java.util.Scanner;

public class insertion_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];//declaration of array

        System.out.print("Enter array elements: ");
        //to take input array
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //to print input array
        System.out.print("Array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Length of array is: "+arr.length);
        
        //logic of insertion sort
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        
        //to print final sorted array (we can't print array without for loop)
        System.out.print("Sorted array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
