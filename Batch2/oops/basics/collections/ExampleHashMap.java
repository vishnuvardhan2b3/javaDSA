import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        int a[]={10,23,34,23,15,10,23,17,94,15};
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
                  hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        System.out.println(hm);
   }
}
