import java.util.Scanner;

public class bubblesort {
    
    public static void main(String[] args) {
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

        //logic of bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        //to print final sorted array (we can't print array without for loop)
        for(int i=0;i<size;i++){
            System.out.print("Sorted array is: "+arr[i]+" ");
        }
    }
}
