abstract class animal { //abstract class 
    abstract public void walk(); //abstract method 
}

class horse extends animal {
    public void walk() {
        System.out.println("horse defined");
    }
}

class cat extends animal {
    public void walk() {
        System.out.println("cat defined");
    }
}

public class abstraction1 { // Keep this as public since the file name is abstraction1.java
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();

        cat ct = new cat();
        ct.walk();
    }
}
