import java.util.Scanner;

public class factorial {
    public static void factorial1(int n){
            int fact=1;
            // if (n<0) {
            //     System.out.println("Invalid number");
            //     return;
            // }
            for(int i=n;i>=1;i--){
                fact=fact*i;
            }
            System.out.println(fact);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.err.print("Enter number");
            int n=sc.nextInt();
            factorial1(n);
    }
}
