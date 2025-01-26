class parent {
    String carbrand="BMW";
    public void myfun(){
        System.out.println("parent class executed");
    }
}
class child extends parent{
    String carmodel=" M5 CS";
    public void myfun1(){ //if carmodel is declared inside function ,then it is not directly accessible in main method
        System.out.println("child class executed");
    }
}
class inheritance{
public static void main(String[] args){
    child ch=new child();
    ch.myfun();
    ch.myfun1();
    System.out.println(ch.carbrand + ch.carmodel);
    
}
}