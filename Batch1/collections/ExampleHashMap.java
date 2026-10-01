import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        int[] a={20,10,20,32,61,10,75,10};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
                hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        System.out.println(hm);
        ArrayList<int[]> al=new ArrayList<>();
        /*for (Map.Entry<Integer,Integer> entry : al) {
            System.out.println(entry.getKey());
        }*/
        for(Map.Entry<Integer,Integer> i:hm.entrySet()){
             al.add(new int[]{i.getKey(),i.getValue()});
        }
        
        System.out.println(al);
        
        
    }
}
