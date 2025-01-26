import java.util.ArrayList;
import java.util.Collection;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println("element at index 0 is: "+arr.get(0));
        arr.add(3,4);
        System.out.println("adding element at specified location "+arr);

        //loops
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        Collection.sort(arr);
    }
}
