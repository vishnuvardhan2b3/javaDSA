import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        int sum=0;
        for(Integer i:a){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
}
