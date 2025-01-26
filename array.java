import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter size of array: ");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        //for input
        System.err.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter the number to find: ");
        int x=sc.nextInt();
        //output
        //System.err.println("The array you entered is: ");
        for(int i=0;i<size;i++){
           // System.err.println(numbers[i]);
           if (numbers[i]==x) {
            System.out.println("x found at index: "+i);
           }
        }
    }
    
}
