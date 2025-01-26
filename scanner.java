import java.util.Scanner;

class scanner
{
public static void main(String args[])
{
	int age;
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();

	///b=sc.nextInt();
	//int sum=a+b;
	//System.out.println("The sum is :"+sum);
	
	if(age>18){
	System.out.println("You are an adult");
	}
	else{
	System.out.println("You are not adult");	
	}

}
}