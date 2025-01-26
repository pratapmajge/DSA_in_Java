// class base{
//     base(){
//         System.out.println("base class");
//     }
// }

// class child extends base{
//     child(){
//         System.out.println("child class");
//     }
// }

class base{
    String name;
    int number;
    public void demo(){
        System.out.println("simple  method of base class");
        System.out.println(this.name +" "+this.number);
    }

    base(int number,int number2){ //parameterized constructor
        System.out.println("constructor called and aslo addition is performed: "+ (number+number2));

    }
}

public class constructor {
    public static void main(String[] args) {
        base b1=new base(12,14);
        b1.name="Pratap";
        b1.number=38;
        b1.demo();
        //child c1=new child();
        
    }
}
