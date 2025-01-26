interface parent1{
    public void myfun();
   // public void myfun1();
}

class child1 implements parent1{
    public void myfun(){
        System.out.println("Interface used");
    }
    public void myfun1(){
        System.out.println("Interface used");
    }
}

public class main {
    public static void main (String args[]) {
    child1 ch=new child1();
    ch.myfun();
    ch.myfun1();
    }
}
