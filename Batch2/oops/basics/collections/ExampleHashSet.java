import java.util.HashSet;
class ExampleHashSet{

    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(30);
        hs.add(20);
        hs.add(10);
        hs.add(50);
        hs.add(30);
        hs.remove(10);
        for(Integer i:hs){
            System.out.println(i);
        }
    }
}