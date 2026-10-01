import java.util.TreeSet;
class HashSetExample{
   public static void main(String[] args){
      TreeSet<Integer> hs=new TreeSet<>();
        hs.add(30);
        hs.add(20);
        hs.add(10);
        hs.add(50);
        hs.add(40);
        hs.add(10);
        for(Integer i:hs){
            System.out.println(i);
        }
    }
}
