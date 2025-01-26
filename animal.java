public class animal {
    public void walk() {
        // Empty method in the parent class
    }
}

class horse extends animal {
    @Override
    public void walk() {
        System.out.println("horse defined");
    }
}

class cat extends animal {
    @Override
    public void walk() {
        System.out.println("cat defined");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        horse h1 = new horse(); 
        h1.walk();  
        
        cat ct = new cat();
        ct.walk();
    }
}
