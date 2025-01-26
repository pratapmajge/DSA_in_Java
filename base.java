import java.io.*;
import java.util.*;
import  java.lang.*;

public class base{
    public int a=10;
    public  void add1(){
        System.out.println("this is public class ");
    }
}
class derived extends base{
    public int b=20;
    public void add2(){
        System.out.println("this is first base class");
    }
}
 class derived_1 extends derived{
    public int c=a+b;
    public void add(){
        System.out.println("Sum of two num: "+c);
    }
 }
public class multilevel {
    public static void main(String[] args) {
        derived_1 d1=new derived_1();
        d1.add();
    }
}
