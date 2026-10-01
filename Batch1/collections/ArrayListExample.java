import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a.add(sc.nextLine());
        }
        Collections.sort(a);
        Collections.reverse(a);
    
        for(String i:a){
            System.out.print(i+" ");
        }
    }
}
