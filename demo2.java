import java.util.*;

class demo2
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	switch(num){
	case 1: System.out.println("You entered one");
	break;
	case 2: System.out.println("You entered two");
	break;
	case 3:  System.out.println("You entered three");
	break;
	default:  System.out.println("You entered number greater than three");
        }
}
}
