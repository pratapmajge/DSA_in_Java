public class exception_1 {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}